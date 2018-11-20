/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: UserToAccountServiceImpl
 * Author:   PanYin
 * Date:     2018/11/20 12:07
 * Description: 用户和资金连表接口实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.UserToAccountMapper;
import com.xuyang.mould.UserToAccount;
import com.xuyang.service.UserToAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户和资金连表接口实现类〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
@Service
public class UserToAccountServiceImpl implements UserToAccountService {
    @Autowired
    private UserToAccountMapper toAccountMapper;
    @Override
    public List<UserToAccount> querySellerInfo(int pageNum, int pageSize,String identity) {
        return toAccountMapper.querySellerInfo(identity);
    }
}
