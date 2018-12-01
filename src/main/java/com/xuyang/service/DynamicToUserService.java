package com.xuyang.service;

import com.github.pagehelper.PageInfo;
import com.xuyang.mould.DynamicToUser;

import java.util.List;

public interface DynamicToUserService {
    /**
     * 功能描述: <br>
     * 〈分页查询发表的文章〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    PageInfo<DynamicToUser> queryToUser(int pageNum, int pageSize);
    /**
     * 功能描述: <br>
     * 〈根据类型ID分页查询该类型下的文章〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    PageInfo<DynamicToUser> typeTocard(int pageNum, int pageSize,int id);
    /**
     * 功能描述: <br>
     * 〈根据文章ID查询文章及作者的信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    DynamicToUser queryDetails(int id);

    /**
     * 功能描述: <br>
     * 〈分页查询全球发现某个用户的文章〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    PageInfo<DynamicToUser> reasonidcard(int pageNum,int pageSize,int id);

    /**
     * 功能描述: <br>
     * 〈后台全球管理(已经审核通过发布了的)〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<DynamicToUser> queryGlobalManage();
}
