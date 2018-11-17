package com.xuyang.service;

import com.xuyang.mould.OrderToGoodsToType;

import java.util.List;

public interface OrderToGoodsToTypeService {
    /**
     * 功能描述: <br>
     * 〈根据用户ID查询订单〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<OrderToGoodsToType> queryOrderToGoodsToType(int id);

    /**
     * 功能描述: <br>
     * 〈查询订单不同的状态〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<OrderToGoodsToType> queryMyOrderState(int id,String state);
    /**
     * 功能描述: <br>
     * 〈根据订单ID查询详情〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    OrderToGoodsToType queryOrderUserDetails(int order_id);
}
