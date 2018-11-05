/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TglobalFindController
 * Author:   PanYin
 * Date:     2018/11/2 16:04
 * Description:全球发现
 */
package com.xuyang.controller.homepage;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.TdynamicMapper;
import com.xuyang.mapper.TglobalLikeMapper;
import com.xuyang.mapper.TglobalRecipientMapper;
import com.xuyang.model.GlobalAssortmentExample;
import com.xuyang.model.TglobalLikeExample;
import com.xuyang.model.TglobalRecipient;
import com.xuyang.model.TglobalRecipientExample;
import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.DynamicToUserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全球发现〉
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

    @ResponseBody
    @ApiOperation(value = "查询发表的帖子")
    @RequestMapping(value = "/queryToUser",method = RequestMethod.GET)
    public Object queryToUser(){
        PageInfo<DynamicToUser> info = dynamicToUserService.queryToUser(0, 5);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",info);
    }

    @ResponseBody
    @ApiOperation(value = "查询类型")
    @RequestMapping(value = "/queryType",method = RequestMethod.GET)
    public Object queryType(){
        GlobalAssortmentExample example = new GlobalAssortmentExample();
        example.createCriteria().andGlobalIdIsNotNull();
        return XuYangResult.ok(ResultConstant.code_ok,"成功",example);
    }

    @ApiOperation(value = "根据类型查询帖子")
    @ResponseBody
    @RequestMapping(value = "/tocard",method = RequestMethod.POST)
    public Object typeTocard(@RequestBody Integer id,
                             @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                     int pageNum,
                             @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                                         int pageSize){
        PageInfo<DynamicToUser> pageInfo = dynamicToUserService.typeTocard(pageNum, pageSize, id);
        if(pageInfo != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",pageInfo);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
        }
    }

    @ApiOperation(value = "根据文章ID查看文章详情")
    @ResponseBody
    @RequestMapping(value = "/details",method = RequestMethod.POST)
    public Object queryDetails(@RequestBody Integer id){
        /* 查询文章 */
        DynamicToUser dynamicToUser = dynamicToUserService.queryDetails(id);
        /* 查询评论 */
        TglobalRecipientExample example = new TglobalRecipientExample();
        example.createCriteria().andDyIdEqualTo(dynamicToUser.getDyId());
        List<TglobalRecipient> tglobalRecipients = tglobalRecipientMapper.selectByExample(example);
        /* 点赞数 t_global_like*/
        TglobalLikeExample example1 = new TglobalLikeExample();
        example1.createCriteria().andDyIdEqualTo(dynamicToUser.getDyId());
        long l = tglobalLikeMapper.countByExample(example1);
        /* 还有个阅读量-----待定 */
        Map<String,Object> map = new HashMap<>();
        map.put("article",dynamicToUser);//文章
        map.put("comment",tglobalRecipients);//评论
        map.put("assist",l);
        return null;
    }

}
