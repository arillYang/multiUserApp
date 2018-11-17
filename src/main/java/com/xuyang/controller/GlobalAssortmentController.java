/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GlobalAssortmentController
 * Author:   PanYin
 * Date:     2018/11/16 15:24
 * Description: 全球类型控制器
 */
package com.xuyang.controller;

import com.xuyang.mapper.GlobalAssortmentMapper;
import com.xuyang.model.GlobalAssortment;
import com.xuyang.model.GlobalAssortmentExample;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全球类型控制器〉
 * @author PanYin
 * @create 2018/11/16
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/GlobalAssort")
@Api(description = "GlobalAssortmentController", tags = {"全球发现类型操作接口"})
public class GlobalAssortmentController {
    @Autowired
    private GlobalAssortmentMapper assortmentMapper;

    @ApiOperation(value = "全球发现类型")
    @ResponseBody
    @RequestMapping(value = "/queryGlobalA",method = RequestMethod.GET)
    public Object queryGlobalA(){
        GlobalAssortmentExample example = new GlobalAssortmentExample();
        example.createCriteria().andGlobalIdIsNotNull();
        List<GlobalAssortment> globalAssortments = assortmentMapper.selectByExample(example);
        if( globalAssortments != null ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",globalAssortments);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }

    @ApiOperation(value = "修改发现类型")
    @ResponseBody
    @RequestMapping(value = "/updateGlobalA",method = RequestMethod.POST)
    public Object updateGlobalA(@RequestBody GlobalAssortment assortment){
        //根据ID，修改要修改的值，没有的则不修改
        int i = assortmentMapper.updateByPrimaryKeySelective(assortment);
        if( i >0 ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }

    @ApiOperation(value = "删除全球发现类型")
    @ResponseBody
    @RequestMapping(value = "/delGlobalA",method = RequestMethod.POST)
    public Object delGlobal(@RequestBody Integer id){
        int i = assortmentMapper.deleteByPrimaryKey(id);
        if( i > 0 ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }

    @ApiOperation(value = "添加全球发现类型")
    @ResponseBody
    @RequestMapping(value = "/addGlobalA",method = RequestMethod.POST)
    @ApiImplicitParam(name = "globalAssortment", value = "全球发现实体对象", required = true, dataType = "GlobalAssortment")
    public Object addGlobal(@RequestBody GlobalAssortment globalAssortment){
        int i = assortmentMapper.insert(globalAssortment);
        if( i > 0 ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
    }
}
