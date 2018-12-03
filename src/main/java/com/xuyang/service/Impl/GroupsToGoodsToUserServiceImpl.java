/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GroupsToGoodsToUserServiceImpl
 * Author:   PanYin
 * Date:     2018/12/1 16:21
 * Description: 团购接口实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.GroupsToGoodsToUserMapper;
import com.xuyang.mould.GroupsToGoodsToUser;
import com.xuyang.service.GroupsToGoodsToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈团购接口实现类〉
 * @author PanYin
 * @create 2018/12/1
 * @since 1.0.0
 */
@Service
public class GroupsToGoodsToUserServiceImpl implements GroupsToGoodsToUserService {
    @Autowired
    private GroupsToGoodsToUserMapper toGoodsToUserMapper;
    @Override
    public List<GroupsToGoodsToUser> queryGroupsToGoodsToUser() {
        return toGoodsToUserMapper.queryGroupsToGoodsToUser();
    }

    @Override
    public List<GroupsToGoodsToUser> queryUnfinishedGroups() {
        return toGoodsToUserMapper.queryUnfinishedGroups();
    }
}
