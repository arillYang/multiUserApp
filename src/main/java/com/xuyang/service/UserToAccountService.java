package com.xuyang.service;

import com.xuyang.mould.UserToAccount;

import java.util.List;

public interface UserToAccountService {
    /**
     * 功能描述: <br>
     * 〈查询用户信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<UserToAccount> querySellerInfo(int pageNum, int pageSize,String identity);
}
