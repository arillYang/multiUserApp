/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: ExamineController
 * Author:   PanYin
 * Date:     2018/11/20 15:14
 * Description: 审核控制器
 */
package com.xuyang.controller;

import com.xuyang.mapper.*;
import com.xuyang.model.*;
import com.xuyang.service.TmoneyService;
import com.xuyang.service.TuserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈审核控制器〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
@RestController
@Api(description = "ExamineController",tags = {"审核管理控制器"})
@RequestMapping(value = "/examine")
public class ExamineController {
    //权限审核接口
    @Autowired
    private TuserAuditRecordMapper tuserAuditRecordMapper;
    @Autowired
    private TuserService tuserService;
    //提现审核接口
    @Autowired
    private TmoneyAuditRecordMapper tmoneyAuditRecordMapper;
    //资金流水表
    @Autowired
    private TmoneyService tmoneyService;
    @Autowired
    private TgoodsMapper tgoodsMapper;
    @Autowired
    private TdynamicMapper tdynamicMapper;
    @Autowired
    private GroupsMapper groupsMapper;
    @ApiOperation(value = "/权限审核(审核发布文章权限)")
    @ResponseBody
    @RequestMapping(value = "/userexamine",method = RequestMethod.POST)
    public Object queryUserexamine(){
        TuserAuditRecordExample example = new TuserAuditRecordExample();
        example.createCriteria().andUserAuditIdIsNotNull();
        List<TuserAuditRecord> tuserAuditRecords = tuserAuditRecordMapper.selectByExample(example);
        if(tuserAuditRecords != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tuserAuditRecords);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }
    @ApiOperation(value = "/权限操作")
    @ResponseBody
    @RequestMapping(value = "/handleuserexamine",method = RequestMethod.POST)
    public Object handleUserexamine(@RequestBody Integer state,@RequestBody TuserAuditRecord tuserAuditRecord){
        if(state == 1 && tuserAuditRecord != null){
            //通过
            Tuser user=new Tuser();
            user.setUserId(tuserAuditRecord.getUserId());   //用户ID
            user.setUserAddress(tuserAuditRecord.getUserAddress());              //地址
            user.setUserSex(tuserAuditRecord.getUserSex());                  //性别
            user.setUserQqsole(tuserAuditRecord.getUserQqsole());               //真实姓名
            user.setUserDate(tuserAuditRecord.getUserDate());                 //出生日期
            user.setUserWxsole(tuserAuditRecord.getUserWxsole());               //职业
            user.setUserWbsole(tuserAuditRecord.getUserWbsole());               //爱好
            user.setUserIdentity(tuserAuditRecord.getUserIdentity());             //申请的标识
            int i = tuserService.updateByPrimaryKeySelective(user);
            if(i > 0){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
            }else{
                return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
            }
        }else{
            int i = tuserAuditRecordMapper.updateByPrimaryKeySelective(tuserAuditRecord);
            if(i > 0){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
            }else{
                return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
            }
        }
    }

    @ApiOperation(value = "/提现审核")
    @ResponseBody
    @RequestMapping(value = "/reflectExamine",method = RequestMethod.POST)
    public Object reflectExamine(){
        TmoneyAuditRecordExample example = new TmoneyAuditRecordExample();
        example.createCriteria().andMoneyAuditIdIsNotNull();
        List<TmoneyAuditRecord> tmoneyAuditRecords = tmoneyAuditRecordMapper.selectByExample(example);
        if(tmoneyAuditRecords != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tmoneyAuditRecords);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }
    @ApiOperation(value = "/提现审核操作")
    @ResponseBody
    @RequestMapping(value = "/handlereflectExamine",method = RequestMethod.POST)
    public Object handlereflectExamine(@RequestBody Integer state, TmoneyAuditRecord auditRecord){
        if(state == 1 && auditRecord != null){
            //通过
            Tmoney tmoney = new Tmoney();
            tmoney.setUserId(auditRecord.getUserId());        //商家ID
            tmoney.setTargetType("提现");             //消费类型
            tmoney.setDataSrc("提现");                //来源
            tmoney.setMoneyRemark(auditRecord.getAuditRemark());
            tmoney.setForward(auditRecord.getCreateTime()); //提现时间
            tmoney.setMoney(auditRecord.getMoney());             //提现金额
            tmoney.setPutForward(auditRecord.getPutForward());        //提现流水号
            tmoney.setCreateTime(new Date());
            int i = tmoneyService.insert(tmoney);
            int i1 = tmoneyAuditRecordMapper.deleteByPrimaryKey(auditRecord.getMoneyAuditId());
            if(i > 0){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
            }else{
                return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
            }
        }else{
            int i = tmoneyAuditRecordMapper.updateByPrimaryKeySelective(auditRecord);
            if(i > 0){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
            }else{
                return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
            }
        }
    }

    @ApiOperation(value = "/商品审核")
    @ResponseBody
    @RequestMapping(value = "/GoodsExamine",method = RequestMethod.POST)
    public Object queryGoodsExamine(){
        TgoodsExample tgoodsExample = new TgoodsExample();
        tgoodsExample.createCriteria().andGIdIsNotNull().andGFlagEqualTo("0");
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(tgoodsExample);
        if(tgoods != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }

    @ApiOperation(value = "/商品审核操作")
    @ResponseBody
    @RequestMapping(value = "/handleGoodsExamine",method = RequestMethod.POST)
    public Object handleGoodsExamine(@RequestBody Tgoods tgoods){
        if(tgoods == null){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-参数有误",null);
        }
        //通过
        if(tgoods.getgFlag().equals("1")){
            int i = tgoodsMapper.updateByPrimaryKeySelective(tgoods);
            if(i>0){
                return XuYangResult.ok(ResultConstant.code_ok,"通过成功",tgoods);
            }
        }
        if(tgoods.getgFlag().equals("2")){
            int i = tgoodsMapper.updateByPrimaryKeySelective(tgoods);
            if(i>0){
                return XuYangResult.ok(ResultConstant.code_ok,"审核以驳回",tgoods);
            }
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }
    @ApiOperation(value = "/全球发现审核")
    @ResponseBody
    @RequestMapping(value = "/globalDisco",method = RequestMethod.POST)
    public Object globalDisco(){
        TdynamicExample example = new TdynamicExample();
        example.createCriteria().andDyIdIsNotNull().andDyAuditStatusEqualTo(0);
        List<Tdynamic> tdynamics = tdynamicMapper.selectByExample(example);
        if(tdynamics != null && !tdynamics.isEmpty()){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tdynamics);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @ApiOperation(value = "/全球发现操作")
    @ResponseBody
    @RequestMapping(value = "/globalDiscoExamine",method = RequestMethod.POST)
    public Object globalDiscoExamine(@RequestParam("tdynamic")Tdynamic tdynamic){
        if(tdynamic != null){
            //更新不为空的数据
            int i = tdynamicMapper.updateByPrimaryKeySelective(tdynamic);
            if(i>0){
                return XuYangResult.ok(ResultConstant.code_ok,tdynamic.getDyAuditStatus()==1?"审核通过":"审核驳回",i);
            }
            return XuYangResult.ok(ResultConstant.code_failue,"失败-更新失败请检查数据",null);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }
    @ApiOperation(value = "/团购审核")
    @ResponseBody
    @RequestMapping(value = "/queryGroup",method = RequestMethod.POST)
    public Object queryGroup(){
        GroupsExample example = new GroupsExample();
        example.createCriteria().andGroupIdIsNotNull().andGroupStatusEqualTo(0);
        List<Groups> groups = groupsMapper.selectByExample(example);
        if(groups != null && !groups.isEmpty()){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",groups);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }

    @ApiOperation(value = "/团购操作")
    @ResponseBody
    @RequestMapping(value = "/groupExamine",method = RequestMethod.POST)
    public Object queryGroupExamine(@RequestParam("groups")Groups groups){
        if(groups != null){
            int i = groupsMapper.updateByPrimaryKeySelective(groups);
            if(i>0){
                return XuYangResult.ok(ResultConstant.code_ok,groups.getGroupStatus()==1?"审核通过":"审核驳回",i);
            }
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }


        /***********************看页面在加上***********************/
    @ApiOperation(value = "/商品详情")
    @ResponseBody
    @RequestMapping(value = "/goodsdetails",method = RequestMethod.POST)
    public Object goodsdetails(){

        return null;
    }

    @ApiOperation(value = "/全球详情")
    @ResponseBody
    @RequestMapping(value = "/globaldetails",method = RequestMethod.POST)
    public Object globaldetails(){

        return null;
    }




}
