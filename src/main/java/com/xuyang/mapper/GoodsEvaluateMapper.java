package com.xuyang.mapper;

import com.xuyang.mould.GoodsEvaluate;

import java.util.List;

public interface GoodsEvaluateMapper {
    //某件商品的全部评价
    List<GoodsEvaluate> queryAllEvaluate(int id);

    //某件商品的前两条评价(好评)团购优惠的好评
    List<GoodsEvaluate> queryTopEvaluate(int id);

    /**
     * 功能描述: <br>
     * 〈查询某个用户对某个订单的评价〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    GoodsEvaluate queryOrderEvaluate(int order_id,int user_id);
}
