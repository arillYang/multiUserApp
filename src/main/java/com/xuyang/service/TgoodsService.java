package com.xuyang.service;

import com.xuyang.model.Tgoods;

import java.util.List;

public interface TgoodsService {
    
    /**
     * 功能描述: <br>
     * 〈商品新品推荐〉
     */
    List<Tgoods> queryNewGoods();
    /**
     * 功能描述: <br>
     * 〈查询精品推荐商品〉
     */
    List<Tgoods> queryBestGoos();
}
