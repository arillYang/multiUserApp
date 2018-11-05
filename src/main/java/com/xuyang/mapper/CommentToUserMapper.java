package com.xuyang.mapper;

import java.util.List;

public interface CommentToUserMapper {
    /* 根据文章ID查询评论 */
    List<CommentToUserMapper> queryComment(int id);
}
