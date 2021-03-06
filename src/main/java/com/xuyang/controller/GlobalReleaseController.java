/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GlobalReleaseController
 * Author:   PanYin
 * Date:     2018/11/20 16:16
 * Description: 全球发布
 */
package com.xuyang.controller;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.TdynamicMapper;
import com.xuyang.mapper.TglobalLikeMapper;
import com.xuyang.mapper.TglobalRecipientMapper;
import com.xuyang.model.Tdynamic;
import com.xuyang.model.TglobalLikeExample;
import com.xuyang.model.TglobalRecipient;
import com.xuyang.model.TglobalRecipientExample;
import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.DynamicToUserService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.UploadFileUtil;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全球发布〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
@Api(description = "GlobalReleaseController", tags = {"全球发布"})
@RestController
@RequestMapping(value = "/release")
public class GlobalReleaseController {
    //文章表
    @Autowired
    private TdynamicMapper tdynamicMapper;
    //文章用户关联
    @Autowired
    private DynamicToUserService dynamicToUserService;
    //评论
    @Autowired
    private TglobalRecipientMapper tglobalRecipientMapper;
    @Autowired
    private TglobalLikeMapper tglobalLikeMapper;
    @ApiOperation(value = "添加全球发布-上传文件")
    @RequestMapping(value = "/addUpload",method = RequestMethod.POST)
    @ResponseBody
    public Object addUpload(@RequestParam(value = "file",required = false)MultipartFile file){
        Map<String, Object> map = UploadFileUtil.uploadFile(file);
        /*for (Map.Entry entry : map.entrySet()) {
            String name = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(name+"-------------"+value);
        }*/
        if(map.get("code")=="200"){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",map);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败-上传失败",map.get("message"));
        }
    }
    @ApiOperation(value = "添加全球发布-提交数据")
    @RequestMapping(value = "/addRelese",method = RequestMethod.POST)
    @ResponseBody
    public Object addRelese(@RequestBody Tdynamic tdynamic,@RequestParam("url") String url){
        if(tdynamic == null){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-参数错误",null);
        }
        tdynamic.setDyImage(url);
        int insert = tdynamicMapper.insert(tdynamic);
        if(insert > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tdynamic);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-添加失败",null);
    }

    @ApiOperation(value = "查询全球发现")
    @RequestMapping(value = "/queryGlobal",method = RequestMethod.POST)
    @ResponseBody
    public Object queryGlobal(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                    int pageSize){
        PageInfo<DynamicToUser> dynamicToUserPageInfo = dynamicToUserService.queryToUser(pageNum, pageSize);
        if(dynamicToUserPageInfo != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",dynamicToUserPageInfo);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @ApiOperation(value = "全球发现的详情")
    @RequestMapping(value = "/Globaldetails",method = RequestMethod.POST)
    @ResponseBody
    public Object queryGlobaldetails(@RequestBody Integer dy_id){
        Tdynamic tdynamic = tdynamicMapper.selectByPrimaryKey(dy_id);
        TglobalRecipientExample example = new TglobalRecipientExample();
        example.createCriteria().andRecIdIsNotNull().andDyIdEqualTo(dy_id);
        List<TglobalRecipient> tglobalRecipients = tglobalRecipientMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        if(tdynamic != null){
            map.put("namic",tdynamic);
            map.put("recipient",tglobalRecipients);
            return XuYangResult.ok(ResultConstant.code_ok,"成功",map);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

    @ApiOperation(value = "删除全球发现的文章和评论点赞信息")
    @RequestMapping(value = "/delGlobal",method = RequestMethod.POST)
    @ResponseBody
    public Object delGlobal(@RequestBody Integer dy_id){
        int i = tdynamicMapper.deleteByPrimaryKey(dy_id);
        TglobalRecipientExample example = new TglobalRecipientExample();
        example.createCriteria().andRecIdIsNotNull().andDyIdEqualTo(dy_id);
        int i1 = tglobalRecipientMapper.deleteByExample(example);
        TglobalLikeExample likeExample = new TglobalLikeExample();
        likeExample.createCriteria().andLikeIdIsNotNull().andDyIdEqualTo(dy_id);
        int i2 = tglobalLikeMapper.deleteByExample(likeExample);
        if(i > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }

}
