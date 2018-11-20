/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GlobalReleaseController
 * Author:   PanYin
 * Date:     2018/11/20 16:16
 * Description: 全球发布
 */
package com.xuyang.controller;

import com.xuyang.mapper.TdynamicMapper;
import com.xuyang.model.Tdynamic;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.UploadFileUtil;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.ServerSocket;
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
    @Autowired
    private TdynamicMapper tdynamicMapper;

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


}
