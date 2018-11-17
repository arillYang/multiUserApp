/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: OrderToGoodsToTypeServiceImpl
 * Author:   PanYin
 * Date:     2018/11/16 11:12
 * Description: 订单的接口实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.OrderToGoodsToTypeMapper;
import com.xuyang.mould.OrderToGoodsToType;
import com.xuyang.service.OrderToGoodsToTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈订单的接口实现类〉
 * @author PanYin
 * @create 2018/11/16
 * @since 1.0.0
 */
@Service
public class OrderToGoodsToTypeServiceImpl implements OrderToGoodsToTypeService {
    @Autowired
    private OrderToGoodsToTypeMapper toGoodsToTypeMapper;
    @Override
    public List<OrderToGoodsToType> queryOrderToGoodsToType(int id) {
        return toGoodsToTypeMapper.queryOrderToGoodsToType(id);
    }

    @Override
    public List<OrderToGoodsToType> queryMyOrderState(int id, String state) {
        return toGoodsToTypeMapper.queryMyOrderState(id,state);
    }

    @Override
    public OrderToGoodsToType queryOrderUserDetails(int order_id) {
        return toGoodsToTypeMapper.queryOrderUserDetails(order_id);
    }
}
