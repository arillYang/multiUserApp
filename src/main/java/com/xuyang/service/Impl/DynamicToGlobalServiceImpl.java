/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: DynamicToGlobalServiceImpl
 * Author:   PanYin
 * Date:     2018/11/20 14:42
 * Description: 后台商家全球管理
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.DynamicToGlobalMapper;
import com.xuyang.mould.DynamicToGlobal;
import com.xuyang.service.DynamicToGlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈后台商家全球管理〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
@Service
public class DynamicToGlobalServiceImpl implements DynamicToGlobalService {
    @Autowired
    private DynamicToGlobalMapper toGlobalMapper;
    @Override
    public List<DynamicToGlobal> queryDynamicToGlobal(Integer user_id) {
        return toGlobalMapper.queryDynamicToGlobal(user_id);
    }
}
