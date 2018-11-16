package com.xuyang.mapper;

import com.xuyang.mould.OrderToGoodsToType;

import java.util.List;

public interface OrderToGoodsToTypeMapper {
    List<OrderToGoodsToType> queryOrderToGoodsToType(int id);

    List<OrderToGoodsToType> queryMyOrderState(int id,String state);
}
