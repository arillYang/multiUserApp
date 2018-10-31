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

import com.xuyang.mapper.TgoodsMapper;
import com.xuyang.model.Tgoods;
import com.xuyang.service.TgoodsService;
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

    @Override
    public List<Tgoods> queryNewGoods() {
        return tgoodsMapper.queryNewGoods();
    }

    @Override
    public List<Tgoods> queryBestGoos() {
        return tgoodsMapper.queryBestGoos();
    }
}
