/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: ShoppingToGoodsToUserServiceImpl
 * Author:   PanYin
 * Date:     2018/11/6 16:01
 * Description: 购物车数据实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.ShoppingToGoodsToUserMapper;
import com.xuyang.mould.ShoppingToGoodsToUser;
import com.xuyang.service.ShoppingToGoodsToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈购物车数据实现类〉
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
@Service
public class ShoppingToGoodsToUserServiceImpl implements ShoppingToGoodsToUserService {
    @Autowired
    private ShoppingToGoodsToUserMapper toGoodsToUserMapper;
    @Override
    public List<ShoppingToGoodsToUser> queryMyShopping(int id) {
        return toGoodsToUserMapper.queryMyShopping(id);
    }
}
