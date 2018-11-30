/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TglobalFindController
 * Author:   PanYin
 * Date:     2018/11/2 16:04
 * Description:全球发现
 */
package com.xuyang.controller.homepage;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.*;
import com.xuyang.model.*;
import com.xuyang.mould.CommentToUser;
import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.CommentToUserService;
import com.xuyang.service.DynamicToUserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈全球发现〉
 *
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
    @Autowired
    private TglobalRecipientMapper tglobalRecipientMapper;
    @Autowired
    private TglobalLikeMapper tglobalLikeMapper;
    @Autowired
    private CommentToUserService commentToUserService;
    @Autowired
    private TreadingTabMapper treadingTabMapper;

    @ResponseBody
    @ApiOperation(value = "查询发表的帖子")
    @RequestMapping(value = "/queryToUser", method = RequestMethod.GET)
    public Object queryToUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                    int pageSize) {
        PageInfo<DynamicToUser> info = dynamicToUserService.queryToUser(pageNum, pageSize);
        return XuYangResult.ok(ResultConstant.code_ok, "成功", info);
    }

    @ResponseBody
    @ApiOperation(value = "查询类型")
    @RequestMapping(value = "/queryType", method = RequestMethod.GET)
    public Object queryType() {
        GlobalAssortmentExample example = new GlobalAssortmentExample();
        example.createCriteria().andGlobalIdIsNotNull();
        return XuYangResult.ok(ResultConstant.code_ok, "成功", example);
    }

    @ApiOperation(value = "根据类型查询帖子")
    @ResponseBody
    @RequestMapping(value = "/tocard", method = RequestMethod.POST)
    public Object typeTocard(@RequestBody Integer id,
                             @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                     int pageNum,
                             @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                                     int pageSize) {
        PageInfo<DynamicToUser> pageInfo = dynamicToUserService.typeTocard(pageNum, pageSize, id);
        if (pageInfo != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", pageInfo);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
        }
    }

    @ApiOperation(value = "根据文章ID查看文章详情")
    @ResponseBody
    @RequestMapping(value = "/details", method = RequestMethod.POST)
    public Object queryDetails(@RequestBody Integer id) {
        /* 查询文章 */
        DynamicToUser dynamicToUser = dynamicToUserService.queryDetails(id);
        /* 查询评论 */
        List<CommentToUser> comment = commentToUserService.queryComment(id);
        /* 点赞数 t_global_like*/
        TglobalLikeExample example1 = new TglobalLikeExample();
        example1.createCriteria().andDyIdEqualTo(dynamicToUser.getDyId());
        long l = tglobalLikeMapper.countByExample(example1);
        /* 阅读量 */
        TreadingTabExample example = new TreadingTabExample();
        example.createCriteria().andClickIdIsNotNull().andDyIdEqualTo(dynamicToUser.getDyId());
        long l1 = treadingTabMapper.countByExample(example);

        Map<String, Object> map = new HashMap<>();
        map.put("article", dynamicToUser);//文章
        map.put("comment", comment);//评论
        map.put("assist", l);        //点赞数
        map.put("read", l1);          //阅读量
        return XuYangResult.ok(ResultConstant.code_ok, "成功", map);
    }

    @ApiOperation(value = "查询评论")
    @ResponseBody
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object queryComment(@RequestBody Integer Id) {
        TglobalRecipientExample example = new TglobalRecipientExample();
        example.createCriteria().andRecIdIsNotNull().andDyIdEqualTo(Id);
        List<TglobalRecipient> tglobalRecipients = tglobalRecipientMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok, "成功", tglobalRecipients);
    }

}
