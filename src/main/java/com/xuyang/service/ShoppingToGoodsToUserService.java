package com.xuyang.service;

import com.xuyang.mould.ShoppingToGoodsToUser;

import java.util.List;

public interface ShoppingToGoodsToUserService {
    /**
     * 功能描述: <br>
     * 〈查询我的购物车〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<ShoppingToGoodsToUser> queryMyShopping(int id);
}
