package com.xuyang.mapper;

import com.xuyang.mould.Quotient;

import java.util.List;

public interface QuotientMapper {

    /**
     * 功能描述: <br>
     * 〈用户ID查询商推〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<Quotient> queryQuotient(int user_id);
}
