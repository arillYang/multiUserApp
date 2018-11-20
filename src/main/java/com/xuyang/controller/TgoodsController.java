/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TgoodsController
 * Author:   PanYin
 * Date:     2018/11/3 14:53
 * Description: 商品操作类
 */
package com.xuyang.controller;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.TgoodsMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.model.TgoodsExample;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.TreeMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈商品操作类〉
 *
 * @author PanYin
 * @create 2018/11/3
 * @since 1.0.0
 */
@Api(description = "GoodsController", tags = {"商品操作接口"})
@RestController
@RequestMapping(value = "/goods")
public class TgoodsController {
    @Autowired
    private TgoodsMapper tgoodsMapper;
    @Autowired
    private TgoodsService tgoodsService;

    @ApiOperation(value = "新增商品", notes = "需要传递一个对象")
    @ResponseBody
    @RequestMapping(value = "/increaseGoods", method = RequestMethod.POST)
    public Object addGoods(@RequestBody @ApiParam(name = "商品对象", value = "传入json格式", required = true) Tgoods tgoods) {
        try {
            int insert = tgoodsMapper.insert(tgoods);
            if (insert > 0) {
                return XuYangResult.ok(ResultConstant.code_ok, "添加成功", insert);
            } else {
                return XuYangResult.ok(ResultConstant.code_failue, "添加失败-未添加成功", null);
            }
        } catch (DataIntegrityViolationException e) {
            return XuYangResult.ok(ResultConstant.code_failue, "添加失败-请检查数据是否正确", null);
        } catch (Exception e) {
            System.out.println(e);
            return XuYangResult.ok(ResultConstant.code_failue, "添加失败-未添加成功", "请联系管理员");
        }

    }

    @ApiOperation(value = "移除商品", notes = "传递ID（物理删除）")
    @ResponseBody
    @RequestMapping(value = "/removeGoods", method = RequestMethod.POST)
    public Object removeGoodss(@ApiParam(name = "商品ID", required = true) Integer id) {
        int i = tgoodsMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "删除成功", i);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "删除失败-未能找到数据", i);
        }
    }

    @ApiOperation(value = "移除商品", notes = "传递对象（物理删除）")
    @ResponseBody
    @RequestMapping(value = "/removeGoods2", method = RequestMethod.POST)
    public Object removeGoodss2(@RequestBody @ApiParam(name = "商品对象", required = true, value = "json格式") Tgoods tgoods) {
        int i = tgoodsMapper.deleteByPrimaryKey(tgoods.getgId());
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "删除成功", i);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "删除失败-未能找到数据", i);
        }
    }

    @ApiOperation(value = "查询商品", notes = "所有商品")
    @ResponseBody
    @RequestMapping(value = "/queryGoods", method = RequestMethod.GET)
    public Object queryGoods() {
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGIdIsNotNull();
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok, "成功", tgoods);
    }

    @ApiOperation(value = "分页查询商品(上架/下架)", notes = "分页查询商品")
    @ResponseBody
    @RequestMapping(value = "/pageGoods", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "long", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "展示条数", dataType = "long", paramType = "query", defaultValue = "20")})
    public Object queryPageGoods(Integer pageNum, Integer pageSize,String sale) {
        PageInfo<Tgoods> info = tgoodsService.pagingQueryGoods(pageNum, pageSize,sale);
        return XuYangResult.ok(ResultConstant.code_ok, "查询成功", info);
    }

    @ApiOperation(value = "查询单个商品", notes = "单个商品")
    @ResponseBody
    @RequestMapping(value = "/SingleGoods", method = RequestMethod.GET)
    @ApiImplicitParam(name = "g_id", value = "ID", dataType = "long", paramType = "query")
    public Object querySingleGoods(Integer g_id) {
        Tgoods tgoods = tgoodsMapper.selectByPrimaryKey(g_id);
        if (tgoods != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", tgoods);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "失败-未查询到数据", null);
        }
    }

    /*@ApiOperation(value = "修改商品",notes = "根据ID商品")
    @ResponseBody
    @RequestMapping(value = "/upadateGoods",method = RequestMethod.POST)
    public Object updateGoods(@RequestBody@ApiParam(name = "商品对象",value = "json格式",required = true) Tgoods tgoods){
        int i = tgoodsMapper.updateByPrimaryKey(tgoods);
        if(i>0){
            return XuYangResult.ok(ResultConstant.code_ok,"修改成功",i);
        }else{
            return XuYangResult.ok(ResultConstant.code_failue,"修改失败",null);
        }
    }*/
    @ApiOperation(value = "修改商品", notes = "修改商品")
    @ResponseBody
    @RequestMapping(value = "/updateGoods", method = RequestMethod.POST)
    public Object updateQGoods(@RequestBody @ApiParam(name = "商品对象", value = "json格式", required = true) Tgoods tgoods) {
        int i = tgoodsMapper.updateByPrimaryKeySelective(tgoods);
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "修改成功", i);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "修改失败", null);
        }
    }

    @ApiOperation(value = "下架/上架的商品")
    @ResponseBody
    @RequestMapping(value = "/querySale", method = RequestMethod.POST)
    public Object querySale(@RequestBody String sale){
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGIdIsNotNull().andGSaleEqualTo(sale);
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(example);
        if(tgoods != null){
            XuYangResult.ok(ResultConstant.code_ok, "成功", tgoods);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

}
