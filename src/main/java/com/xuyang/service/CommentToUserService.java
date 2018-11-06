package com.xuyang.service;

import com.xuyang.mapper.CommentToUserMapper;
import com.xuyang.mould.CommentToUser;

import java.util.List;

public interface CommentToUserService {
    /* 根据文章ID查询评论和用户信息 */
    List<CommentToUser> queryComment(int id);
}
