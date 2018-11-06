/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GroupsToItemServiceImpl
 * Author:   PanYin
 * Date:     2018/11/6 11:24
 * Description: 团购和明细，买家，商品，用户的关联数据实现表
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.GroupsToItemMapper;
import com.xuyang.mould.GroupsToItem;
import com.xuyang.service.GroupsToItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈团购和明细，买家，商品，用户的关联数据实现表〉
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
@Service
public class GroupsToItemServiceImpl implements GroupsToItemService {
    @Autowired
    private GroupsToItemMapper groupsToItemMapper;
    @Override
    public List<GroupsToItem> queryTopGroups(int id) {
        return groupsToItemMapper.queryTopGroups(id);
    }
}
