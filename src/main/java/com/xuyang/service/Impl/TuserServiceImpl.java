package com.xuyang.service.Impl;

import com.xuyang.mapper.TuserMapper;
import com.xuyang.model.Tuser;
import com.xuyang.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuserServiceImpl implements TuserService {

    @Autowired
    private TuserMapper tuserMapper;


    @Override
    public int updateByPrimaryKeySelective(Tuser record) {
        return tuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tuser record) {
        return tuserMapper.updateByPrimaryKey(record);
    }

    @Override
    public Tuser selectByPrimaryKey(Integer userId) {
        return tuserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return tuserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Tuser record) {
        return tuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Tuser record) {
        return tuserMapper.insertSelective(record);
    }

    @Override
    public Tuser selectUserForLogin(Tuser tuser) {
        return tuserMapper.selectUserForLogin(tuser);
    }
}
