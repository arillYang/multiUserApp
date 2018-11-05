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

import com.xuyang.model.Tgoods;
import com.xuyang.model.TworldtypeExample;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈全球购物〉
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
    /**
     * 功能描述: <br>
     * 〈查询世界类型〉
     * @since: 1.0.0
     * @Author: PanYin
     * @Date:
     */
    @ResponseBody
    @ApiOperation(value = "查询世界类型")
    @RequestMapping(value = "/queryglobal",method = RequestMethod.GET)
    public Object queryGlobalType(){
        TworldtypeExample example = new TworldtypeExample();
        example.createCriteria().andWotIdIsNotNull().andWotSwitchEqualTo("开启");
        return XuYangResult.ok(ResultConstant.code_ok,"成功",example);
    }
    /**
     * 功能描述: <br>
     * 〈世界类型的新品推荐〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ResponseBody
    @ApiOperation(value = "世界类型的新品推荐")
    @RequestMapping(value = "/newglobal",method = RequestMethod.GET)
    public Object newGlobalGoods(){
        List<Tgoods> tgoods = tgoodsService.newGlobalGoods();
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
    }

    /**
     * 功能描述: <br>
     * 〈世界类型的精品推荐〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @ResponseBody
    @ApiOperation(value = "世界类型的精品推荐")
    @RequestMapping(value = "/bestglobal",method = RequestMethod.GET)
    public Object bestGlobalGoods(){
        List<Tgoods> tgoods = tgoodsService.bestGlobalGoods();
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
    }
}
