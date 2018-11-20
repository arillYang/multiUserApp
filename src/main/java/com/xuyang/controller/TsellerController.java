/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TsellerController
 * Author:   PanYin
 * Date:     2018/11/19 17:58
 * Description: 商家控制器
 */
package com.xuyang.controller;

import com.xuyang.mapper.TbankCardMapper;
import com.xuyang.mapper.TcouponsMapper;
import com.xuyang.mapper.TorderMapper;
import com.xuyang.model.*;
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
    @Autowired
    private TbankCardMapper tbankCardMapper;
    @Autowired
    private TcouponsMapper tcouponsMapper;
    @Autowired
    private TorderMapper torderMapper;

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
    @RequestMapping(value = "/querySellerOrder",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "商家订单")
    public Object querySellerUser(){

        return null;
    }

}
