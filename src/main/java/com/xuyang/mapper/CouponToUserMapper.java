package com.xuyang.mapper;

import com.xuyang.mould.CouponToUser;

import java.util.List;

public interface CouponToUserMapper {

   List<CouponToUser> queryCoupon(int id);

   List<CouponToUser> mycouponstate(int id,String name);
}
