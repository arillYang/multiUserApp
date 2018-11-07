/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: BusinessController
 * Author:   PanYin
 * Date:     2018/11/6 16:52
 * Description: 商家控制器
 */
package com.xuyang.controller.business;

import com.xuyang.mapper.TuserMapper;
import com.xuyang.model.TmoneyExample;
import com.xuyang.model.Tuser;
import com.xuyang.model.TuserExample;
import com.xuyang.service.TuserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商家控制器〉
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
@RestController
@Api(description = "/商家控制器")
@RequestMapping(value = "/")
public class BusinessController {
    /* 导航模块 */
    @Autowired
    private TuserService tuserService;
    //我的账户
    @ApiOperation(value = "我的账户")
    @ResponseBody
    @RequestMapping(value = "/account",method = RequestMethod.POST)
    public Object queryMyAccount(@RequestBody Integer id){
        //查询店铺名称，金额
        Tuser tuser = tuserService.selectByPrimaryKey(id);
        //资金表
        TmoneyExample example = new TmoneyExample();
        example.createCriteria().andMoneyIdIsNotNull().andUserIdEqualTo(id);
        return tuser;
    }
}
