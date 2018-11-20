/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: UploadFileUtil
 * Author:   PanYin
 * Date:     2018/11/20 16:59
 * Description: 上传文件的工具类
 */
package com.xuyang.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈上传文件的工具类〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
public class UploadFileUtil {

    private static Map<String,Object> uplodEx(String suffixName){
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


    public static Map<String,Object> uploadFile(MultipartFile file){
        Map<String,Object> map = new HashMap<>();
        //判断文件是否为空
        if( file.isEmpty() ) {
            map.put("code","400");
            map.put("message","请检查数据，数据不完整");
            return map;
        }
        // 文件后缀
        String suffixName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        Map<String, Object> map1 = uplodEx(suffixName);
        //设置保存路径
        String path = null;
        //重新命名文件
        String fileName = null;
        if( (Boolean)map1.get("ig") ){
            //图片的保存路径
            path = System.getProperty("user.dir")+"/src/main/resources/upload";
            fileName = "images_"+ UUID.randomUUID().toString() + suffixName;
        }else if( (Boolean)map1.get("rs") ){
            //视频的保存路径
            path = System.getProperty("user.dir")+"/src/main/resources/video";
            fileName = "video_"+UUID.randomUUID().toString() + suffixName;
        }else{
            map.put("code","500");
            map.put("message","非法操作");
            return map;
        }//保存的整个路径
        String realPath = path + "/"+ fileName;

        File dest = new File(realPath);
        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }try {
            //保存文件
            file.transferTo(dest);
            map.put("code","200");
            map.put("message","成功");
            map.put("url",realPath);
            return map;
        } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            map.put("code","500");
            map.put("message","错误");
            return map;
        }
    }
}
