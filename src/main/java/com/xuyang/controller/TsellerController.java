/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TsellerController
 * Author:   PanYin
 * Date:     2018/11/19 17:58
 * Description: 商家控制器
 */
package com.xuyang.controller;

import com.xuyang.mapper.*;
import com.xuyang.model.*;
import com.xuyang.mould.DynamicToGlobal;
import com.xuyang.mould.UserToAccount;
import com.xuyang.service.DynamicToGlobalService;
import com.xuyang.service.UserToAccountService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商家控制器〉
 * @author PanYin
 * @create 2018/11/19
 * @since 1.0.0
 */
@RestController
@Api(description = "TsellerController",tags = {"商家管理控制器"})
@RequestMapping(value = "/seller")
public class TsellerController {
    //银行卡
    @Autowired
    private TbankCardMapper tbankCardMapper;
    //优惠券
    @Autowired
    private TcouponsMapper tcouponsMapper;
    //订单
    @Autowired
    private TorderMapper torderMapper;
    //用户和资金表
    @Autowired
    private UserToAccountService toAccountService;
    //全球内容
    @Autowired
    private DynamicToGlobalService toGlobalService;
    //文章
    @Autowired
    private TdynamicMapper tdynamicMapper;
    //点赞
    @Autowired
    private TglobalLikeMapper tglobalLikeMapper;
    //评论
    @Autowired
    private TglobalRecipientMapper tglobalRecipientMapper;
    @RequestMapping(value = "/queryBank",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "商家银行卡")
    public Object queryBankCard(@RequestBody String tenant_sid){
        TbankCardExample example = new TbankCardExample();
        example.createCriteria().andBankCardIdIsNotNull().andTenantSidEqualTo(tenant_sid);
        List<TbankCard> tbankCards = tbankCardMapper.selectByExample(example);
        if( tbankCards != null ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tbankCards);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @RequestMapping(value = "/queryGoodsCoupons",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "商品优惠券")
    public Object queryGoodsCoupons(@RequestBody Integer goods_id){
        TcouponsExample example = new TcouponsExample();
        example.createCriteria().andCouponIdIsNotNull().andGIdEqualTo(goods_id);
        List<Tcoupons> tcoupons = tcouponsMapper.selectByExample(example);
        if(tcoupons != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tcoupons);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @RequestMapping(value = "/querySellerOrder",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "商家订单")
    public Object querySellerOrder(@RequestBody String tenant_sid){
        TorderExample example = new TorderExample();
        example.createCriteria().andOrderIdIsNotNull().andTenantSidEqualTo(tenant_sid);
        List<Torder> torders = torderMapper.selectByExample(example);
        if(torders != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",torders);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @RequestMapping(value = "/querySellerUser",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询商家信息")
    public Object querySellerUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                    int pageSize){
        List<UserToAccount> userToAccounts = toAccountService.querySellerInfo(pageNum, pageSize, "3");
        if(userToAccounts != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",userToAccounts);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @RequestMapping(value = "/queryGlobalcontent",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "全球内容")
    public Object queryGlobalcontent(@RequestBody Integer user_id){

        List<DynamicToGlobal> dynamicToGlobals = toGlobalService.queryDynamicToGlobal(user_id);

        if(dynamicToGlobals != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",dynamicToGlobals);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @RequestMapping(value = "/delGlobalcontent",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除")
    public Object delGlobalcontent(@RequestBody Integer dy_id){
        int i = tdynamicMapper.deleteByPrimaryKey(dy_id);
        TglobalLikeExample likeExample = new TglobalLikeExample();
        likeExample.createCriteria().andDyIdEqualTo(dy_id).andLikeIdIsNotNull();
        int i1 = tglobalLikeMapper.deleteByExample(likeExample);
        TglobalRecipientExample example = new TglobalRecipientExample();
        example.createCriteria().andDyIdEqualTo(dy_id).andRecIdIsNotNull();
        int i2 = tglobalRecipientMapper.deleteByExample(example);
        if(i>0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未能成功删除",null);
    }

    @RequestMapping(value = "/queryUotient",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询商推")
    public Object queryUotient(@RequestBody Integer user_id){

        return null;
    }

}
