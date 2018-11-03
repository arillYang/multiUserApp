/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: DynamicToUserServiceImpl
 * Author:   PanYin
 * Date:     2018/11/2 15:46
 * Description:
 */
package com.xuyang.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.DynamicToUserMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.DynamicToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
@Service
public class DynamicToUserServiceImpl implements DynamicToUserService {
    @Autowired
    private DynamicToUserMapper dynamicToUserMapper;

    @Override
    public PageInfo<DynamicToUser> queryToUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DynamicToUser> dynamic = dynamicToUserMapper.queryToUser();
        PageInfo result = new PageInfo(dynamic);
        return result;
    }
}
