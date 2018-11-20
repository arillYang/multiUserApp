/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TgoodsServiceImpl
 * Author:   Administrator
 * Date:     2018/10/31 16:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.TgoodsMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.model.TgoodsExample;
import com.xuyang.model.Tuser;
import com.xuyang.service.TgoodsService;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018/10/31
 * @since 1.0.0
 */
@Service
public class TgoodsServiceImpl implements TgoodsService {
    @Autowired
    private TgoodsMapper tgoodsMapper;
    /**
     * 功能描述: <br>
     * 〈全球的新品商品〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @Override
    public List<Tgoods> newGlobalGoods() {
        return tgoodsMapper.newGlobalGoods();
    }
    /**
     * 功能描述: <br>
     * 〈全球的精品商品〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @Override
    public List<Tgoods> bestGlobalGoods() {
        return tgoodsMapper.bestGlobalGoods();
    }
    /**
     * 功能描述: <br>
     * 〈分页查询〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    @Override
    public PageInfo<Tgoods>  pagingQueryGoods(int pageNum, int pageSize,String sale) {
        PageHelper.startPage(pageNum, pageSize);
        List<Tgoods> tgoods = tgoodsMapper.pagingQueryGoods(sale);
        PageInfo result = new PageInfo(tgoods);
        return result;
    }
}
