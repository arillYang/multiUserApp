/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TgroupdiscountController
 * Author:   PanYin
 * Date:     2018/11/2 10:38
 * Description: 团购优惠
 */
package com.xuyang.controller.homepage;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.TgtypeMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.model.Tgtype;
import com.xuyang.model.TgtypeExample;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈团购优惠〉
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
@Api(description = "团购优惠")
@RestController
@RequestMapping(value = "/group")
public class TgroupdiscountController {
    //商品类型service
    @Autowired
    private TgtypeMapper tgtypeMapper;
    //商品service
    @Autowired
    private TgoodsService tgoodsService;

    @ApiOperation(value = "查询类型")
    @RequestMapping(value = "/queryType",produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    @ResponseBody
    public Object queryGroupType(){
        TgtypeExample example=new TgtypeExample();
        TgtypeExample.Criteria criteria = example.createCriteria();
        criteria.andGtIdIsNotNull();
        List<Tgtype> tgtypes = tgtypeMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"",tgtypes);
    }

    @ApiOperation(value = "查询商品")
    @ResponseBody
    @RequestMapping(value = "/bestArrivals",method = RequestMethod.GET)
    public Object queryBestGoos(
                    @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                int pageNum,
                    @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                                int pageSize){
        PageInfo<Tgoods> info = tgoodsService.pagingQueryGoods(pageNum, pageSize);
        if(info == null){
            return XuYangResult.ok(ResultConstant.code_failue,"没有数据",null);
        }else{
            return XuYangResult.ok(ResultConstant.code_ok,"成功",info);
        }
    }


}
