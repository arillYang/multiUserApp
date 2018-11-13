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
import com.xuyang.model.TgtypeExample;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈总二级分类类型〉
 *
 * @author PanYin
 * @create 2018/11/3
 * @since 1.0.0
 */
@RequestMapping(value = "/gtype")
@Api(description = "gtypeController", tags = {"分类操作"})
@RestController
public class TgtypeController {
    @Autowired
    private TgtypeMapper mapper;

    @ApiOperation(value = "增加类型")
    @ResponseBody
    @RequestMapping(value = "/insertType", method = RequestMethod.POST)
    public Object insertGtype(@RequestBody @ApiParam(name = "类型对象", value = "传递json格式", required = true) Tgtype tgtype) {
        int i = mapper.insertSelective(tgtype);
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", i);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
        }
    }

    @ApiOperation(value = "查询类型", notes = "查询全部")
    @ResponseBody
    @RequestMapping(value = "/queryType", method = RequestMethod.GET)
    public Object queryGtype() {
        TgtypeExample example = new TgtypeExample();
        example.createCriteria().andGtIdIsNotNull();
        List<Tgtype> tgtypes = mapper.selectByExample(example);
        if (tgtypes != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", tgtypes);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
        }
    }

    @ApiOperation(value = "查询属于同一个父类的类型", notes = "需要传递父类的标识(根据父类标识查询其下的所有子类)")
    @ResponseBody
    @RequestMapping(value = "/qeuryToType", method = RequestMethod.POST)
    public Object queryTotalType(@RequestBody Tgtype tgtype) {
        TgtypeExample example = new TgtypeExample();
        TgtypeExample.Criteria criteria = example.createCriteria();
        if (tgtype.getWotId() == 0 && (tgtype.getGtTyptname() == null || tgtype.getGtTyptname() == "")) {
            //return XuYangResult.ok(ResultConstant.code_failue,"失败-数据不正确",null);
            criteria.andGtIdIsNotNull();
        }
        if (tgtype.getWotId() != 0) {
            criteria.andGtIdIsNotNull().andWotIdEqualTo(tgtype.getWotId());
        }
        if (tgtype.getGtTyptname() != null && !"".equals(tgtype.getGtTyptname())) {
            criteria.andGtIdIsNotNull().andGtTyptnameEqualTo(tgtype.getGtTyptname());
        }
        List<Tgtype> tgtypes = mapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok, "成功", tgtypes);
    }

    @ApiOperation(value = "移除类型", notes = "物理移除")
    @ResponseBody
    @RequestMapping(value = "/delType", method = RequestMethod.POST)
    public Object removeGtype(@RequestBody Integer tyid) {
        int i = 0;
        if (tyid != 0) {
            i = mapper.deleteByPrimaryKey(tyid);
        }
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", i);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
        }
    }

    @ApiOperation(value = "修改类型", notes = "修改有值的字段")
    @ResponseBody
    @RequestMapping(value = "/updateType", method = RequestMethod.POST)
    public Object updateGtype(@RequestBody Tgtype tgtype) {
        int i = mapper.updateByPrimaryKeySelective(tgtype);
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", i);
        } else {
            return XuYangResult.ok(ResultConstant.code_failue, "失败-未修改成功", null);
        }
    }

}
