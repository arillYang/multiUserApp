/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: LevelLinkageServiceImpl
 * Author:   PanYin
 * Date:     2018/11/5 16:08
 * Description: 类型一级二级数据层实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.LevelLinkageMapper;
import com.xuyang.mould.LevelLinkage;
import com.xuyang.service.LevelLinkageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈类型一级二级数据层实现类〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
@Service
public class LevelLinkageServiceImpl implements LevelLinkageService {
    @Autowired
    private LevelLinkageMapper levelLinkageMapper;
    @Override
    public List<LevelLinkage> queryAllType(String statename) {
        return levelLinkageMapper.queryAllType(statename);
    }
}
