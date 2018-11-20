package com.xuyang.mapper;

import com.xuyang.mould.DynamicToGlobal;

import java.util.List;

public interface DynamicToGlobalMapper {
    /**
     * 功能描述: <br>
     * 〈后台商家管理全球管理〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<DynamicToGlobal> queryDynamicToGlobal(Integer user_id);
}
