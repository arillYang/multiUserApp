/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: DynamicToUserServiceImpl
 * Author:   PanYin
 * Date:     2018/11/2 15:46
 * Description:
 */
package com.xuyang.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.DynamicToUserMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.DynamicToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
@Service
public class DynamicToUserServiceImpl implements DynamicToUserService {
    @Autowired
    private DynamicToUserMapper dynamicToUserMapper;
    /**
     * 功能描述: <br>
     * 〈分页查询全部的文章和发布者的信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @Override
    public PageInfo<DynamicToUser> queryToUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DynamicToUser> dynamic = dynamicToUserMapper.queryToUser();
        PageInfo result = new PageInfo(dynamic);
        return result;
    }
    /**
     * 功能描述: <br>
     * 〈根据类型ID分页查询文章及发布者信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @Override
    public PageInfo<DynamicToUser> typeTocard(int pageNum, int pageSize,int id) {
        PageHelper.startPage(pageNum, pageSize);
        List<DynamicToUser> dynamic = dynamicToUserMapper.typeTocard(id);
        PageInfo result = new PageInfo(dynamic);
        return result;
    }
    /**
     * 功能描述: <br>
     * 〈根据文章ID查询文章和发布者信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @Override
    public DynamicToUser queryDetails(int id) {
        return dynamicToUserMapper.queryDetails(id);
    }

    @Override
    public PageInfo<DynamicToUser> reasonidcard(int pageNum, int pageSize, int id) {
        PageHelper.startPage(pageNum, pageSize);
        List<DynamicToUser> dynamic = dynamicToUserMapper.reasonidcard(id);
        PageInfo result = new PageInfo(dynamic);
        return result;
    }

    @Override
    public List<DynamicToUser> queryGlobalManage() {
        return dynamicToUserMapper.queryGlobalManage();
    }
}
