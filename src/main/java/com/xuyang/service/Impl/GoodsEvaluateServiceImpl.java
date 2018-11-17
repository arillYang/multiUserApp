/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GoodsEvaluateServiceImpl
 * Author:   PanYin
 * Date:     2018/11/5 19:37
 * Description: 商品评价实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.GoodsEvaluateMapper;
import com.xuyang.mould.GoodsEvaluate;
import com.xuyang.mould.GoodsToImages;
import com.xuyang.service.GoodsEvaluateService;
import com.xuyang.service.GoodsToImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品评价实现类〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
@Service
public class GoodsEvaluateServiceImpl implements GoodsEvaluateService {
    @Autowired
    private GoodsEvaluateMapper goodsEvaluateMapper;

    @Override
    public List<GoodsEvaluate> queryAllEvaluate(int id) {
        return goodsEvaluateMapper.queryAllEvaluate(id);
    }

    @Override
    public List<GoodsEvaluate> queryTopEvaluate(int id) {
        return goodsEvaluateMapper.queryTopEvaluate(id);
    }

    @Override
    public GoodsEvaluate queryOrderEvaluate(int order_id, int user_id) {
        return goodsEvaluateMapper.queryOrderEvaluate(order_id,user_id);
    }
}
