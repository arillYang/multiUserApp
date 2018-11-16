/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: CouponToUserServiceImpl
 * Author:   PanYin
 * Date:     2018/11/15 19:25
 * Description: 优惠券和用户的接口实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.CouponToUserMapper;
import com.xuyang.mould.CouponToUser;
import com.xuyang.service.CouponToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈优惠券和用户的接口实现类〉
 * @author PanYin
 * @create 2018/11/15
 * @since 1.0.0
 */
@Service
public class CouponToUserServiceImpl implements CouponToUserService {
    @Autowired
    private CouponToUserMapper couponToUserMapper;

    @Override
    public List<CouponToUser> queryCoupon(int id) {
        return couponToUserMapper.queryCoupon(id);
    }

    @Override
    public List<CouponToUser> mycouponstate(int id, String name) {
        return couponToUserMapper.mycouponstate(id,name);
    }
}
