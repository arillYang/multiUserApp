package com.xuyang.service;

import com.github.pagehelper.PageInfo;
import com.xuyang.mould.DynamicToUser;

public interface DynamicToUserService {
    /**
     * 功能描述: <br>
     * 〈分页查询发表的文章〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    PageInfo<DynamicToUser> queryToUser(int pageNum, int pageSize);
}
