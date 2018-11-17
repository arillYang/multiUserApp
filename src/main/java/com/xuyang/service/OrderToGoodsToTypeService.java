package com.xuyang.service;

import com.xuyang.mould.OrderToGoodsToType;

import java.util.List;

public interface OrderToGoodsToTypeService {
    List<OrderToGoodsToType> queryOrderToGoodsToType(int id);

    List<OrderToGoodsToType> queryMyOrderState(int id,String state);
}
