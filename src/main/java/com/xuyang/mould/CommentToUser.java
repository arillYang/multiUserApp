/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: CommentToUser
 * Author:   PanYin
 * Date:     2018/11/5 14:13
 * Description: 评论和用户关联实体
 */
package com.xuyang.mould;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈评论和用户关联实体〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
public class CommentToUser {

    private Integer recId;  //评论ID
    private Integer userId; //用户ID
    private String recContent;  //评论内容
    private Date recTime;   //评论时间
    private String userNickname;    //用户昵称
    private String userHead;    //用户头像
    private Integer dy_id;      //文章ID

    public CommentToUser() {
    }

    public CommentToUser(Integer recId, Integer userId, String recContent, Date recTime, String userNickname, String userHead, Integer dy_id) {
        this.recId = recId;
        this.userId = userId;
        this.recContent = recContent;
        this.recTime = recTime;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.dy_id = dy_id;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRecContent() {
        return recContent;
    }

    public void setRecContent(String recContent) {
        this.recContent = recContent;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public Integer getDy_id() {
        return dy_id;
    }

    public void setDy_id(Integer dy_id) {
        this.dy_id = dy_id;
    }
}
