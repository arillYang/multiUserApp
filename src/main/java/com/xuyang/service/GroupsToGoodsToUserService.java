package com.xuyang.service;

import com.xuyang.mould.GroupsToGoodsToUser;

import java.util.List;

public interface GroupsToGoodsToUserService {
    /**
     * 功能描述: <br>
     * 〈查询团购信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<GroupsToGoodsToUser> queryGroupsToGoodsToUser();
    /**
     * 功能描述: <br>
     * 〈查询未成团购的信息〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<GroupsToGoodsToUser> queryUnfinishedGroups();
}
