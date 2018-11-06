/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: CommentToUserServiceImpl
 * Author:   PanYin
 * Date:     2018/11/5 14:37
 * Description: 评论和用户关联表的实现类
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.CommentToUserMapper;
import com.xuyang.mould.CommentToUser;
import com.xuyang.service.CommentToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈评论和用户关联表的实现类〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
@Service
public class CommentToUserServiceImpl implements CommentToUserService {
    @Autowired
    private CommentToUserMapper commentToUserMapper;
    @Override
    public List<CommentToUser> queryComment(int id) {
        return commentToUserMapper.queryComment(id);
    }
}
