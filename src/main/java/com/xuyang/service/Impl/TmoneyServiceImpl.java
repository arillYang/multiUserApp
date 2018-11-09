/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: TmoneyServiceImpl
 * Author:   PanYin
 * Date:     2018/11/7 10:23
 * Description: 资金数据实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.TmoneyMapper;
import com.xuyang.model.Tmoney;
import com.xuyang.model.TmoneyExample;
import com.xuyang.service.TmoneyService;
import org.apache.tomcat.util.descriptor.web.WebXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈资金数据实现类〉
 * @author PanYin
 * @create 2018/11/7
 * @since 1.0.0
 */
@Service
public class TmoneyServiceImpl implements TmoneyService {
    @Autowired
    private TmoneyMapper mapper;
    @Override
    public long countByExample(TmoneyExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TmoneyExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer moneyId) {
        return mapper.deleteByPrimaryKey(moneyId);
    }

    @Override
    public int insert(Tmoney record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Tmoney record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Tmoney> selectByExample(TmoneyExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Tmoney selectByPrimaryKey(Integer moneyId) {
        return mapper.selectByPrimaryKey(moneyId);
    }

    @Override
    public int updateByExampleSelective(Tmoney record, TmoneyExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Tmoney record, TmoneyExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Tmoney record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tmoney record) {
        return mapper.updateByPrimaryKey(record);
    }
}
