/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GroupsController
 * Author:   PanYin
 * Date:     2018/11/30 16:47
 * Description: 团购控制器
 */
package com.xuyang.controller;

import com.xuyang.mapper.GroupsMapper;
import com.xuyang.model.GroupsExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈团购控制器〉
 * @author PanYin
 * @create 2018/11/30
 * @since 1.0.0
 */
@RestController
@Api(description = "GroupsController",tags = {"团购"})
@RequestMapping(value = "groups")
public class GroupsController {
    @Autowired
    private GroupsMapper groupsMapper;

    @ApiOperation(value = "/正在团购的商品")
    @ResponseBody
    @RequestMapping(value = "/beingGroups",method = RequestMethod.POST)
    public Object queryGroups(){


        return null;
    }
}
