package com.xuyang.service;

import com.xuyang.mould.Quotient;

import java.util.List;

public interface QuotientService {
    /**
     * 功能描述: <br>
     * 〈用户ID查询商推〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<Quotient> queryQuotient(int user_id);
}
