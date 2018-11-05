/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TgtypeController
 * Author:   PanYin
 * Date:     2018/11/3 18:10
 * Description: 总二级分类类型
 */
package com.xuyang.controller;

import com.xuyang.mapper.TgtypeMapper;
import com.xuyang.model.Tgtype;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈总二级分类类型〉
 * @author PanYin
 * @create 2018/11/3
 * @since 1.0.0
 */
@RequestMapping(value = "/gtype")
@Api(description = "gtypeController",tags = {"分类操作"})
@RestController
public class TgtypeController {
    @Autowired
    private TgtypeMapper mapper;

    @ApiOperation(value = "增加类型")
    @ResponseBody
    @RequestMapping(value = "/insertType",method = RequestMethod.POST)
    public Object insertGtype(@RequestBody @ApiParam(name = "类型对象",value = "传递json格式",required = true) Tgtype tgtype){
        int i = mapper.insertSelective(tgtype);
        if( i > 0 ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
        }
    }
}
