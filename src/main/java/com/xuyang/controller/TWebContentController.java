/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: WebContentController
 * Author:   PanYin
 * Date:     2018/11/19 10:46
 * Description: 网站内容管理
 */
package com.xuyang.controller;

import com.xuyang.mapper.TadvertisingMapper;
import com.xuyang.mapper.TadvertisingSpaceMapper;
import com.xuyang.model.Tadvertising;
import com.xuyang.model.TadvertisingSpace;
import com.xuyang.mould.AdvertisingSpace;
import com.xuyang.service.AdvertisingSpaceService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈网站内容管理〉
 * @author PanYin
 * @create 2018/11/19
 * @since 1.0.0
 */
@RestController
@Api(description = "WebContentController",tags = {"网站内容控制器"})
@RequestMapping(value = "/web")
public class TWebContentController {
    @Autowired
    private AdvertisingSpaceService spaceService;
    @Autowired
    private TadvertisingMapper tadvertisingMapper;
    @Autowired
    private TadvertisingSpaceMapper tadvertisingSpaceMapper;


    private Map<String,Object> uplodEx(String suffixName){
        Map<String,Object> map = new HashMap<>();
        //定义正则表达试
        String video = "^.(mp4|rmvb|flv|mpeg|avi|rm|mpeg1|mpeg2|mpeg3|mpeg4|mov|mtv|wmv|3gp|amv|dmv|flv|png|jpg|gif)";
        String img = "^.(png|jpg|gif)";

        //编译正则表达式
        Pattern pattern = Pattern.compile(video);
        Pattern patternimg = Pattern.compile(img);

        //验证
        Matcher matcher = pattern.matcher(suffixName);
        Matcher matcherimg = patternimg.matcher(suffixName);
        boolean rs = matcher.matches();
        boolean ig = matcherimg.matches();
        if( !matcherimg.matches() && !rs){
            map.put("code","400");
            map.put("message","格式错误");
            map.put("ig",ig);
            map.put("rs",rs);
            return map;
        }
        map.put("code","200");
        map.put("message","成功");
        map.put("ig",ig);
        map.put("rs",rs);
        return map;
    }
    /**
     * 功能描述: <br>
     * 〈查询轮播图和banner图〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ApiOperation(value = "查询轮播和banner图")
    @ResponseBody
    @RequestMapping(value = "/queryAdvertising",method = RequestMethod.POST)
    public Object queryAdvertising(){
        List<AdvertisingSpace> advertisingSpaces = spaceService.queryAdvertising();
        if(advertisingSpaces !=  null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",advertisingSpaces);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-没有数据",null);
    }
    @ApiOperation(value = "编辑")
    @ResponseBody
    @RequestMapping(value = "/updateAdvertising",method = RequestMethod.POST)
    public Object updateAdvertising(@RequestBody Tadvertising tadvertising,
                                    @RequestBody TadvertisingSpace tadvertisingSpace){
        int i = tadvertisingMapper.updateByPrimaryKeySelective(tadvertising);
        int i1 = tadvertisingSpaceMapper.updateByPrimaryKeySelective(tadvertisingSpace);
        if(i>0 && i1>0){
            return XuYangResult.ok(ResultConstant.code_ok,"修改成功",i);
        }else if(i>0 && !(i1 > 0)){
            return XuYangResult.ok(ResultConstant.code_ok,"图片修改成功-位置未修改",i);
        }else if(!(i>0) && i1 > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"图片未修改-位置修改成功",i);
        }else{
            return XuYangResult.ok(ResultConstant.code_ok,"未修改",i);
        }
    }
    @ApiOperation(value = "上传文件(单个-图片/视频)")
    @ResponseBody
    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public Object fileupload(@RequestParam("file") MultipartFile file, Map<String, Object> map){
        //判断文件是否为空
        if(file.isEmpty()) {
            map.put("code","400");
            map.put("message","上传资源为空");
            return XuYangResult.ok(400,"失败-false",map);
        }
        // 文件后缀
        String suffixName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        Map<String, Object> map1 = this.uplodEx(suffixName);
        if(map1.get("code").toString() != "200"){
            return XuYangResult.ok(400,"失败-false",map1.get("message"));
        }
        //设置保存路径
        String path = null;
        //重新命名文件
        String fileName = null;
        if( (Boolean)map1.get("ig") ){
            //图片的保存路径
            path = System.getProperty("user.dir")+"/src/main/resources/upload";
            fileName = "images_"+UUID.randomUUID().toString() + suffixName;
        }else if( (Boolean)map1.get("rs") ){
            //视频的保存路径
            path = System.getProperty("user.dir")+"/src/main/resources/video";
            fileName = "video_"+UUID.randomUUID().toString() + suffixName;
        }else{
            map.put("code","500");
            map.put("message","非法操作");
            return XuYangResult.ok(ResultConstant.code_failue,"失败-false",map);
        }
        String type = file.getContentType();

        //保存的整个路径
        String realPath = path + "/"+ fileName;

        File dest = new File(realPath);
        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
            map.put("code","200");
            map.put("message","成功");
            return XuYangResult.ok(ResultConstant.code_ok,"成功",map);
        } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return XuYangResult.ok(ResultConstant.code_failue,"失败-false",map);
        }
    }
    @ApiOperation(value = "上传文件(多个-图片/视频)")
    @ResponseBody
    @PostMapping(value = "/uploadFiles",consumes = "multipart/*",headers = "content-type=multipart/form-date")
    public Object uploadFiles(@RequestParam("file") MultipartFile[] files){
        if (files.length < 0) {
            return XuYangResult.ok(ResultConstant.code_failue,"请选择文件",null);
        }
        for (int i=0; i<files.length; i++) {
            if (!files[i].isEmpty()) {
                try {
                    //获取后缀
                    String suffixName = files[i].getOriginalFilename().substring(
                            files[i].getOriginalFilename().lastIndexOf("."));
                    Map<String, Object> map = this.uplodEx(suffixName);
                    if(map.get("code").toString() != "200"){
                        return XuYangResult.ok(400,"失败-false",map.get("message"));
                    }
                    //设置保存路径
                    String path = null;
                    //重新命名文件
                    String fileName = null;
                    if( (Boolean)map.get("ig") ){
                        //图片的保存路径
                        path = System.getProperty("user.dir")+"/src/main/resources/upload";
                        fileName = "images_"+UUID.randomUUID().toString() + suffixName;
                    }else if( (Boolean)map.get("rs") ){
                        //视频的保存路径
                        path = System.getProperty("user.dir")+"/src/main/resources/video";
                        fileName = "video_"+UUID.randomUUID().toString() + suffixName;
                    }else{
                        map.put("code","500");
                        map.put("message","非法操作");
                        return XuYangResult.ok(ResultConstant.code_failue,"失败-false",map);
                    }
                    //保存的整个路径
                    String realPath = path + "/"+ fileName;
                    File dest = new File(realPath);
                    //判断文件父目录是否存在
                    if(!dest.getParentFile().exists()){
                        dest.getParentFile().mkdir();
                    }
                    //保存文件
                    files[i].transferTo(dest);
                } catch (IllegalStateException | IOException e) {
                    return XuYangResult.ok(ResultConstant.code_failue,"上传失败，第 " + i + " 个文件 => "
                            + e.getMessage(),null);

                }
            } else {
                return XuYangResult.ok(ResultConstant.code_failue,"上传失败，第 " + i
                        + "个文件是空的.",null);
            }
        }
        return XuYangResult.ok(ResultConstant.code_failue,"系统错误，请联系管理员",null);
    }



}
