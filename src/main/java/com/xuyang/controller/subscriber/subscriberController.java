/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: subscriberController
 * Author:   PanYin
 * Date:     2018/11/9 16:35
 * Description: 用户控制器
 */
package com.xuyang.controller.subscriber;

import com.xuyang.mapper.*;
import com.xuyang.model.*;
import com.xuyang.mould.CouponToUser;
import com.xuyang.mould.OrderToGoodsToType;
import com.xuyang.service.CouponToUserService;
import com.xuyang.service.OrderToGoodsToTypeService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户控制器〉
 * @author PanYin
 * @create 2018/11/9
 * @since 1.0.0
 */
@Api(description = "前端用户控制器")
@RequestMapping(value = "/user")
@RestController
public class subscriberController {
    //收货地址接口
    @Autowired
    private TrecipientMapper trecipientMapper;
    //收藏接口
    @Autowired
    private ThouseMapper thouseMapper;
    //优惠券和用户关联接口
    @Autowired
    private CouponToUserService toUserService;
    //订单及商品和类型接口(还有用户的几个数据)
    @Autowired
    private OrderToGoodsToTypeService toGoodsToTypeService;
    //商品评论接口
    @Autowired
    private TgoodsAppraisesMapper tgoodsAppraisesMapper;
    //订单接口
    @Autowired
    private TorderMapper torderMapper;
    //订单详情接口
    @Autowired
    private TorderGoodsMapper torderGoodsMapper;
    @Autowired
    private TdynamicMapper tdynamicMapper;
    @ApiOperation(value = "用户收货查询地址")
    @ResponseBody
    @RequestMapping(value = "/queryRess", method = RequestMethod.POST)
    public Object queryRess(@RequestBody @ApiParam(name = "用户ID",value = "数值") Integer id){
        TrecipientExample example = new TrecipientExample();
        example.createCriteria().andRecipientIdIsNotNull().andUserIdEqualTo(id);
        List<Trecipient> trecipients = trecipientMapper.selectByExample(example);
        if(trecipients !=  null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",trecipients);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @ApiOperation(value = "我的收藏商品")
    @ResponseBody
    @RequestMapping(value = "/mycollectGoods", method = RequestMethod.POST)
    public Object mycollectG(@RequestBody Integer id){
        ThouseExample example = new ThouseExample();
        example.createCriteria().andHouseIdIsNotNull().andGIdIsNotNull().andUserIdEqualTo(id);
        List<Thouse> thouses = thouseMapper.selectByExample(example);
        if(thouses !=  null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",thouses);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @ApiOperation(value = "我的收藏文章")
    @ResponseBody
    @RequestMapping(value = "/mycollectArticle", method = RequestMethod.POST)
    public Object mycollectWen(@RequestBody Integer id){
        ThouseExample example = new ThouseExample();
        example.createCriteria().andHouseIdIsNotNull().andDyIdIsNotNull().andUserIdEqualTo(id);
        List<Thouse> thouses = thouseMapper.selectByExample(example);
        if(thouses !=  null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",thouses);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @ApiOperation(value = "我的优惠券")
    @ResponseBody
    @RequestMapping(value = "/coupon", method = RequestMethod.POST)
    public Object mycoupon(@RequestBody Integer id){
        List<CouponToUser> couponToUsers = toUserService.queryCoupon(id);
        if(couponToUsers !=  null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",couponToUsers);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @ApiOperation(value = "我的优惠券(状态)")
    @ResponseBody
    @RequestMapping(value = "/notusedcoupon", method = RequestMethod.POST)
    public Object mycouponstate(@RequestBody Integer id,@RequestBody String state){
        List<CouponToUser> couponToUsers = toUserService.mycouponstate(id,state);
        if(couponToUsers !=  null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",couponToUsers);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @ApiOperation(value = "我的订单(全部)")
    @ResponseBody
    @RequestMapping(value = "/userorder", method = RequestMethod.POST)
    public Object myorder(@RequestBody Integer id){
        if(id != null && id != 0){
            List<OrderToGoodsToType> orderToGoodsToTypes = toGoodsToTypeService.queryOrderToGoodsToType(id);
            if(orderToGoodsToTypes !=  null){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",orderToGoodsToTypes);
            }
            return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-参数错误",null);
    }

    @ApiOperation(value = "我的订单(状态)")
    @ResponseBody
    @RequestMapping(value = "/orderState", method = RequestMethod.POST)
    public Object myorderState(@RequestBody Integer id,@RequestBody String state){
        if(id != null && id != 0){
            List<OrderToGoodsToType> orderToGoodsToTypes = toGoodsToTypeService.queryMyOrderState(id,state);
            if(orderToGoodsToTypes !=  null){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",orderToGoodsToTypes);
            }
            return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-参数错误",null);
    }
    @ApiOperation(value = "发表评价")
    @ResponseBody
    @RequestMapping(value = "/inserevaluate", method = RequestMethod.POST)
    public Object inserevaluate(@RequestBody TgoodsAppraises tgoodsAppraises){
        int insert = tgoodsAppraisesMapper.insert(tgoodsAppraises);
        if(insert>0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",insert);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-添加失败",null);
    }

    @ApiOperation(value = "确认订单(提交订单及订单详情)")
    @ResponseBody
    @RequestMapping(value = "/inserOrder", method = RequestMethod.POST)
    public Object inserOrder(@RequestBody Torder torder,@RequestBody TorderGoods torderGoods){
        int insert = torderMapper.insert(torder);
        int insert1 = torderGoodsMapper.insert(torderGoods);
        if(insert>0 && insert1>0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",insert);
        }else if(insert>0 && !(insert1 > 0)){
            return XuYangResult.ok(ResultConstant.code_failue,"订单添加成功，详情失败",null);
        }else if(!(insert>0) && insert1>0){
            return XuYangResult.ok(ResultConstant.code_failue,"订单详情添加成功，订单失败",null);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-添加失败",null);
    }
    @ApiOperation(value = "删除全球发布")
    @ResponseBody
    @RequestMapping(value = "/delrelease", method = RequestMethod.POST)
    public Object delrelease(@RequestBody Integer id){
        int i = tdynamicMapper.deleteByPrimaryKey(id);
        if(i>0){
            return XuYangResult.ok(ResultConstant.code_ok,"删除成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-删除失败",null);
    }



}
