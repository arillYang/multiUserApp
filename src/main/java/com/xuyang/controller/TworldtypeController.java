/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TworldtypeController
 * Author:   PanYin
 * Date:     2018/11/3 16:47
 * Description: 一级分类操作
 */
package com.xuyang.controller;

import com.xuyang.mapper.TworldtypeMapper;
import com.xuyang.model.Tworldtype;
import com.xuyang.model.TworldtypeExample;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈一级分类操作〉
 * @author PanYin
 * @create 2018/11/3
 * @since 1.0.0
 */
@RestController
@Api(description = "worldtypeController",tags = {"商品一级分类操作"})
@RequestMapping(value = "/type")
public class TworldtypeController {
    @Autowired
    private TworldtypeMapper tworldtypeMapper;
    @ResponseBody
    @ApiOperation(value = "增加分类",notes = "需要传递一个对象")
    @RequestMapping(value = "/insertWorld",method = RequestMethod.POST)
    public Object addWorldType(
            @RequestBody@ApiParam(name = "类型对象",value = "传入json格式",required = true)Tworldtype tworldtype){
        int insert = tworldtypeMapper.insert(tworldtype);
        if(insert>0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",insert);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
        }
    }

    @ResponseBody
    @ApiOperation(value = "查询分类",notes = "传递世界馆的标识(不传默认查询全部)")
    @RequestMapping(value = "/selectWorld",method = RequestMethod.POST)
    public Object queryWorld(@RequestBody @ApiParam(required = false) Tworldtype tworldtype){
        TworldtypeExample example = new TworldtypeExample();
        TworldtypeExample.Criteria criteria = example.createCriteria();
        if(tworldtype.getWotTypename() != null && !"".equals(tworldtype.getWotTypename())){
            criteria.andWotIdIsNotNull().andWotTypenameEqualTo(tworldtype.getWotTypename());
        }else{
            criteria.andWotIdIsNotNull();
        }
        List<Tworldtype> tworldtypes = tworldtypeMapper.selectByExample(example);
        if(tworldtypes != null){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",tworldtypes);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
        }
    }

    @ResponseBody
    @ApiOperation(value = "删除分类",notes = "需要传递一个id")
    @RequestMapping(value = "/removeWorld",method = RequestMethod.POST)
    public Object removewWorld(@RequestBody @ApiParam(name = "类型对象",value = "传入int格式",required = true)Integer id){
        int i = tworldtypeMapper.deleteByPrimaryKey(id);
        if(i > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
        }
    }
    @ResponseBody
    @ApiOperation(value = "修改分类",notes = "需要传递一个对象")
    @RequestMapping(value = "/updateWorld",method = RequestMethod.POST)
    public Object updateWorld(
            @RequestBody @ApiParam(name = "类型对象",value = "传入json格式",required = true) Tworldtype tworldtype){
        int i = tworldtypeMapper.updateByPrimaryKeySelective(tworldtype);
        if( i > 0 ){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"失败",null);
        }
    }


}
