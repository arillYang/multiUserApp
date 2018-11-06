package com.xuyang.service;

import com.xuyang.mould.GoodsEvaluate;

import java.util.List;

public interface GoodsEvaluateService {
    //某件商品的全部评价
    List<GoodsEvaluate> queryAllEvaluate(int id);
    //某件商品的前两条好评
    List<GoodsEvaluate> queryTopEvaluate(int id);
}
