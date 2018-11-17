/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: QuotientServiceImpl
 * Author:   PanYin
 * Date:     2018/11/17 18:12
 * Description: 商推接口实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.QuotientMapper;
import com.xuyang.mould.Quotient;
import com.xuyang.service.QuotientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商推接口实现类〉
 * @author PanYin
 * @create 2018/11/17
 * @since 1.0.0
 */
@Service
public class QuotientServiceImpl implements QuotientService {
    @Autowired
    private QuotientMapper quotientMapper;
    @Override
    public List<Quotient> queryQuotient(int user_id) {
        return quotientMapper.queryQuotient(user_id);
    }
}
