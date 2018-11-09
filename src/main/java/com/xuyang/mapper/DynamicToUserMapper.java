package com.xuyang.mapper;

import com.xuyang.mould.DynamicToUser;

import java.util.List;

public interface DynamicToUserMapper {
    /**
     * 功能描述: <br>
     * 〈分页查询全部的文章和发布者的信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<DynamicToUser> queryToUser();
    /**
     * 功能描述: <br>
     * 〈根据类型ID分页查询文章及发布者信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<DynamicToUser> typeTocard(int id);
    /**
     * 功能描述: <br>
     * 〈根据文章ID查询文章和发布者信息〉
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
    List<DynamicToUser> reasonidcard(int id);
}
