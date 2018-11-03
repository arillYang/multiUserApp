package com.xuyang.service.Impl;

import com.xuyang.service.TworldTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TworldTypeServiceImpl implements TworldTypeService {

    @Autowired
    private TworldtypeMapper tworldTypeMapper;


    @Override
    public int deleteByPrimaryKey(Integer wotId) {
        return 0;
    }

    @Override
    public int insert(Tworldtype record) {

        return tworldTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(Tworldtype record) {
        return 0;
    }

    @Override
    public Tworldtype selectByPrimaryKey(Integer wotId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Tworldtype record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Tworldtype record) {
        return 0;
    }

}
