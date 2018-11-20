package com.xuyang.mapper;

import com.xuyang.mould.UserToAccount;

import java.util.List;

public interface UserToAccountMapper {
    /**
     * 功能描述: <br>
     * 〈查询用户信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<UserToAccount> querySellerInfo(String identity);
}
