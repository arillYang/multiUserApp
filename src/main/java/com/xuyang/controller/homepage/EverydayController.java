/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: Everyday
 * Author:   PanYin
 * Date:     2018/11/3 14:21
 * Description: 每日领券
 */
package com.xuyang.controller.homepage;

import com.xuyang.mapper.TcouponsMapper;
import com.xuyang.model.Tcoupons;
import com.xuyang.model.TcouponsExample;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈每日领券〉
 * @author PanYin
 * @create 2018/11/3
 * @since 1.0.0
 */
@RestController
@Api(description = "每日领券")
@RequestMapping(value = "/every")
public class EverydayController {
    @Autowired
    private TcouponsMapper tcouponsMapper;
    /**
     * 功能描述: <br>
     * 〈查询优惠券〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ApiOperation(value = "查询优惠券")
    @RequestMapping(value = "/queryCoupons",produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    @ResponseBody
    public Object queryCoupons(){
        TcouponsExample example = new TcouponsExample();
        example.createCriteria().andCouponIdIsNotNull().andCouponFlagEqualTo("在用")
                .andCouponValidEndTimeLessThan(new Date()).andCouponSendEndTimeLessThan(new Date());
        List<Tcoupons> tcoupons = tcouponsMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tcoupons);
    }
}
