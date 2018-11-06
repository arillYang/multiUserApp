package com.xuyang.mapper;

import com.xuyang.mould.CommentToUser;

import java.util.List;

public interface CommentToUserMapper {
    /* 根据文章ID查询评论 */
    List<CommentToUser> queryComment(int id);
}
