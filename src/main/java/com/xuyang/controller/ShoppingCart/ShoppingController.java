/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: ShoppingController
 * Author:   PanYin
 * Date:     2018/11/6 14:39
 * Description: 购物车控制器
 */
package com.xuyang.controller.ShoppingCart;

import com.xuyang.mapper.GoodsShopcarMapper;
import com.xuyang.model.GoodsShopcarExample;
import com.xuyang.mould.ShoppingToGoodsToUser;
import com.xuyang.service.ShoppingToGoodsToUserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈购物车控制器〉
 *
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
@Api(description = "购物车")
@RequestMapping(value = "/shopping")
@RestController
public class ShoppingController {
    @Autowired
    private ShoppingToGoodsToUserService toGoodsToUserService;
    @Autowired
    private GoodsShopcarMapper shopcarMapper;

    /**
     * 功能描述: <br>
     * 〈我的购物差〉
     *
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ApiOperation(value = "我的购物车")
    @ResponseBody
    @RequestMapping(value = "/myshopping", method = RequestMethod.POST)
    public Object queryMyshopping(@RequestBody Integer id) {
        List<ShoppingToGoodsToUser> shoppingToGoodsToUsers = toGoodsToUserService.queryMyShopping(id);
        if (shoppingToGoodsToUsers != null && !shoppingToGoodsToUsers.isEmpty()) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", shoppingToGoodsToUsers);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
    }

    @ApiOperation(value = "清空购物车")
    @ResponseBody
    @RequestMapping(value = "/delshopping", method = RequestMethod.POST)
    public Object removeShopping(@RequestBody Integer id) {
        GoodsShopcarExample example = new GoodsShopcarExample();
        example.createCriteria().andCarIdIsNotNull().andUserIdEqualTo(id);
        int i = shopcarMapper.deleteByExample(example);
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", i);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
    }

    @ApiOperation(value = "结算购物车")
    @ResponseBody
    @RequestMapping(value = "/balance", method = RequestMethod.POST)
    public Object generateOrder() {

        return XuYangResult.ok(ResultConstant.code_failue, "待定-还没实现", null);
    }
}
