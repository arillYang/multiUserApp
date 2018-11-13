/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TglobalgoController
 * Author:   PanYin
 * Date:     2018/11/1 13:42
 * Description: 全球购物
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyang.controller.homepage;

import com.xuyang.mapper.TgoodsMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.model.TgoodsExample;
import com.xuyang.mould.GoodsEvaluate;
import com.xuyang.mould.GoodsToImages;
import com.xuyang.mould.LevelLinkage;
import com.xuyang.service.GoodsEvaluateService;
import com.xuyang.service.GoodsToImagesService;
import com.xuyang.service.LevelLinkageService;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈全球购物〉
 *
 * @author PanYin
 * @create 2018/11/1
 * @since 1.0.0
 */
@Api(description = "全球购物")
@Controller
@RequestMapping(value = "/global")
public class TglobalgoController {
    @Autowired
    private TgoodsService tgoodsService;
    @Autowired
    private TgoodsMapper mapper;
    @Autowired
    private LevelLinkageService levelLinkageService;
    @Autowired
    private GoodsToImagesService goodsToImagesService;
    @Autowired
    private GoodsEvaluateService goodsEvaluateService;

    /**
     * 功能描述: <br>
     * 〈查询世界类型〉
     *
     * @since: 1.0.0
     * @Author: PanYin
     * @Date:
     */
    @ResponseBody
    @ApiOperation(value = "查询全球馆下的商品类型")
    @RequestMapping(value = "/queryglobal", method = RequestMethod.GET)
    public Object queryGlobalType(@RequestParam String statename) {
        List<LevelLinkage> linkages = levelLinkageService.queryAllType(statename);
        if (linkages != null && !linkages.isEmpty()) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", linkages);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

    /**
     * 功能描述: <br>
     * 〈世界类型的新品推荐〉
     *
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ResponseBody
    @ApiOperation(value = "世界类型的新品推荐")
    @RequestMapping(value = "/newglobal", method = RequestMethod.GET)
    public Object newGlobalGoods() {
        List<Tgoods> tgoods = tgoodsService.newGlobalGoods();
        return XuYangResult.ok(ResultConstant.code_ok, "成功", tgoods);
    }

    /**
     * 功能描述: <br>
     * 〈世界类型的精品推荐〉
     *
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ResponseBody
    @ApiOperation(value = "世界类型的精品推荐")
    @RequestMapping(value = "/bestglobal", method = RequestMethod.GET)
    public Object bestGlobalGoods() {
        List<Tgoods> tgoods = tgoodsService.bestGlobalGoods();
        return XuYangResult.ok(ResultConstant.code_ok, "成功", tgoods);
    }

    @ApiOperation(value = "根据类型查询商品")
    @RequestMapping(value = "/queryTypeGoods", method = RequestMethod.POST)
    @ResponseBody
    public Object typeToGoods(@RequestBody Integer id) {
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGtIdEqualTo(id);
        List<Tgoods> tgoods = mapper.selectByExample(example);
        if (tgoods != null && !tgoods.isEmpty()) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", tgoods);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
    }

    @ApiOperation(value = "商品详情")
    @RequestMapping(value = "/queryGoodsdetails", method = RequestMethod.POST)
    @ResponseBody
    public Object queryOneGoods(@RequestBody Integer id) {
        List<GoodsEvaluate> goodsEvaluates = goodsEvaluateService.queryTopEvaluate(id);
        List<GoodsToImages> goodsToImages = goodsToImagesService.queryGoodsToimage(id);
        Map<String, Object> map = new HashMap<>();
        map.put("evaluates", goodsEvaluates);
        map.put("goodsToimg", goodsToImages);
        if (goodsToImages != null && !goodsToImages.isEmpty()) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", map);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
    }

    @ApiOperation(value = "全部评价")
    @ResponseBody
    @RequestMapping(value = "/queryEvaluate", method = RequestMethod.POST)
    public Object queryAllevaluate(@RequestBody Integer id) {
        List<GoodsEvaluate> goodsEvaluates = goodsEvaluateService.queryAllEvaluate(id);
        if (goodsEvaluates != null && !goodsEvaluates.isEmpty()) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", goodsEvaluates);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败", null);
    }

}
