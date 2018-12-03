/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: CouponController
 * Author:   PanYin
 * Date:     2018/12/1 16:56
 * Description: 优惠券
 */
package com.xuyang.controller;

import com.xuyang.mapper.TcouponsMapper;
import com.xuyang.model.Tcoupons;
import com.xuyang.model.TcouponsExample;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈优惠券〉
 * @author PanYin
 * @create 2018/12/1
 * @since 1.0.0
 */
@RestController
@Api(description = "CouponController",tags = {"优惠券"})
@RequestMapping(value = "oupon")
public class CouponController {
    @Autowired
    private TcouponsMapper tcouponsMapper;

    @ApiOperation(value = "优惠券")
    @ResponseBody
    @RequestMapping(value = "/queryCoupon",method = RequestMethod.POST)
    public Object queryCoupon(){
        TcouponsExample example = new TcouponsExample();
        example.createCriteria().andCouponIdIsNotNull();
        List<Tcoupons> tcoupons = tcouponsMapper.selectByExample(example);
        if(tcoupons != null && !tcoupons.isEmpty()){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tcoupons);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }

    @ApiOperation(value = "添加优惠券")
    @ResponseBody
    @RequestMapping(value = "/insertCoupon",method = RequestMethod.POST)
    public Object insertCoupon(@RequestParam("tcoupons")Tcoupons tcoupons){
        if(tcoupons != null){
            int insert = tcouponsMapper.insert(tcoupons);
            if(insert > 0){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",insert);
            }else{
                return XuYangResult.ok(ResultConstant.code_failue,"失败-插入失败",insert);
            }
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }
}
