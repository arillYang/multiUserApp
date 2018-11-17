package com.xuyang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.TuserMapper;
import com.xuyang.model.Tuser;
import com.xuyang.model.TuserExample;
import com.xuyang.service.TuserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuserServiceImpl implements TuserService {

    @Autowired
    private TuserMapper tuserMapper;


    @Override
    public int updateByPrimaryKeySelective(Tuser record) {
        return tuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tuser record) {
        return tuserMapper.updateByPrimaryKey(record);
    }

    @Override
    public Tuser selectByPrimaryKey(Integer userId) {
        return tuserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return tuserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Tuser record) {
        return tuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Tuser record) {
        return tuserMapper.insertSelective(record);
    }

    @Override
    public Tuser selectUserForLogin(Tuser tuser) {
        return tuserMapper.selectUserForLogin(tuser);
    }

    /**
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     */
    @Override
    public PageInfo<Tuser> queryUser(int pageNum, int pageSize, String identity) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Tuser> userDomains = tuserMapper.queryUser(identity);
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    /**
     * @param mobile
     * @return
     * @Discription 判断手机号码是否存在
     */
    @Override
    public Boolean checkMobile(String mobile) {
        TuserExample example = new TuserExample();
        TuserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(mobile);
        List<Tuser> list = tuserMapper.selectByExample(example);
        return list.size() == 0;
    }

    /**
     * 用户重置密码
     *
     * @param userPhone
     * @param userPwd
     * @return
     */
    @Override
    public XuYangResult resetPassword(String userPhone, String userPwd) {
        TuserExample example = new TuserExample();
        TuserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(userPhone);
        List<Tuser> u = tuserMapper.selectByExample(example);
        if (u.size() == 0)
            return XuYangResult.build(ResultConstant.code_yewu, "没有该用户", "");
        Tuser user = u.get(0);
        user.setUserPwd(userPwd);
        tuserMapper.updateByPrimaryKey(user);
        return XuYangResult.ok(ResultConstant.code_ok, "修改成功", "");
    }
}
