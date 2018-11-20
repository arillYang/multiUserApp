/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GlobalExceptionHandler
 * Author:   PanYin
 * Date:     2018/11/19 16:15
 * Description: 监控上传文件的错误
 */
package com.xuyang.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈监控上传文件的错误〉
 * @author PanYin
 * @create 2018/11/19
 * @since 1.0.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MultipartException.class)
    @ResponseBody
    public Map<String, Object> handleError1(MultipartException e) {
        Map<String, Object> errorResultMap = new HashMap<String, Object>();
        errorResultMap.put("errorCode", "500");
        errorResultMap.put("errorMsg", "上传文件超出大小限制");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        errorResultMap.put("datetime",df.format(new Date()) );
        return errorResultMap;
    }
}
