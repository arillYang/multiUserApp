/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: Tglobalfind
 * Author:   PanYin
 * Date:     2018/11/2 11:48
 * Description: 全球发现
 */
package com.xuyang.controller;

import com.xuyang.mapper.TdynamicMapper;
import com.xuyang.model.Tdynamic;
import com.xuyang.model.TdynamicExample;
import com.xuyang.model.TgtypeExample;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全球发现〉
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
@Api(description = "全球发现")
@RestController
@RequestMapping(value = "/globalfind")
public class TglobalfindController {

    @Autowired
    private TdynamicMapper mapper;

    @ApiOperation(value = "查询动态")
    @RequestMapping(value = "/queryDynamic",produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    @ResponseBody
    public Object queryDynamic(){
        TdynamicExample example=new TdynamicExample();
        TdynamicExample.Criteria criteria = example.createCriteria();
        criteria.andDyIdIsNotNull();
        List<Tdynamic> tdynamics = mapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tdynamics);
    }
}
