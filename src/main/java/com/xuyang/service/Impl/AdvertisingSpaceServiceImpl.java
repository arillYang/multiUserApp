/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: AdvertisingSpaceServiceImpl
 * Author:   PanYin
 * Date:     2018/11/19 11:41
 * Description: 轮播图和banner图的接口实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.AdvertisingSpaceMapper;
import com.xuyang.mould.AdvertisingSpace;
import com.xuyang.service.AdvertisingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈轮播图和banner图的接口实现类〉
 * @author PanYin
 * @create 2018/11/19
 * @since 1.0.0
 */
@Service
public class AdvertisingSpaceServiceImpl implements AdvertisingSpaceService {
    @Autowired
    private AdvertisingSpaceMapper advertisingSpaceMapper;
    @Override
    public List<AdvertisingSpace> queryAdvertising() {
        return advertisingSpaceMapper.queryAdvertising();
    }
}
