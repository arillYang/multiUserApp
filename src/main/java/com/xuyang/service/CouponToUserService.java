package com.xuyang.service;

import com.xuyang.mould.CouponToUser;

import java.util.List;

public interface CouponToUserService {
    List<CouponToUser> queryCoupon(int id);

    List<CouponToUser> mycouponstate(int id,String name);
}
