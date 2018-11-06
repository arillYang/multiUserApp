/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GoodsToImagesServiceImpl
 * Author:   PanYin
 * Date:     2018/11/5 18:03
 * Description: 商品及商品图片数据实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.GoodsToImagesMapper;
import com.xuyang.mould.GoodsToImages;
import com.xuyang.service.GoodsToImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品及商品图片数据实现类〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
@Service
public class GoodsToImagesServiceImpl implements GoodsToImagesService {
    @Autowired
    private GoodsToImagesMapper mapper;
    @Override
    public List<GoodsToImages> queryGoodsToimage(int id) {
        return mapper.queryGoodsToimage(id);
    }
}
