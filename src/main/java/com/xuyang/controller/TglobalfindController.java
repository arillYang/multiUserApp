/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TglobalFindController
 * Author:   PanYin
 * Date:     2018/11/2 16:04
 * Description:
 */
package com.xuyang.controller;

import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.DynamicToUserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
@Api(description = "全球发现")
@Controller
@RequestMapping(value = "/find")
public class TglobalfindController {
    @Autowired
    private DynamicToUserService dynamicToUserService;
    @ResponseBody
    @ApiOperation(value = "查询发表的帖子")
    @RequestMapping(value = "/queryToUser",method = RequestMethod.GET)
    public Object queryToUser(){
        List<DynamicToUser> dynamicToUsers = dynamicToUserService.queryToUser();
        return XuYangResult.ok(ResultConstant.code_ok,"成功",dynamicToUsers);
    }

    @ResponseBody
    @ApiOperation(value = "查询类型")
    @RequestMapping(value = "/queryToUser",method = RequestMethod.GET)
    public Object queryType(){
        List<DynamicToUser> dynamicToUsers = dynamicToUserService.queryToUser();
        return XuYangResult.ok(ResultConstant.code_ok,"成功",dynamicToUsers);
    }
}
