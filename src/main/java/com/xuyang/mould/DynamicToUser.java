/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: DynamicToUser
 * Author:   PanYin
 * Date:     2018/11/2 15:01
 * Description:  关联全球发现和用户
 */
package com.xuyang.mould;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈 关联全球发现和用户〉
 *
 * @author PanYin
 * @create 2018/11/2
 * @since 1.0.0
 */
public class DynamicToUser {

    private Integer userId;
    private String userNickname;
    private String userHead;
    private Integer dyId;
    private String dyTitle;
    private String dyImage;
    private String dyCont;
    private Date dyCreateTime;

    public Date getDyCreateTime() {
        return dyCreateTime;
    }

    public void setDyCreateTime(Date dyCreateTime) {
        this.dyCreateTime = dyCreateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getDyId() {
        return dyId;
    }

    public void setDyId(Integer dyId) {
        this.dyId = dyId;
    }

    public String getDyTitle() {
        return dyTitle;
    }

    public void setDyTitle(String dyTitle) {
        this.dyTitle = dyTitle;
    }

    public String getDyImage() {
        return dyImage;
    }

    public void setDyImage(String dyImage) {
        this.dyImage = dyImage;
    }

    public String getDyCont() {
        return dyCont;
    }

    public void setDyCont(String dyCont) {
        this.dyCont = dyCont;
    }

    public DynamicToUser(Integer userId, String userNickname, String userHead, Integer dyId, String dyTitle, String dyImage, String dyCont, Date dyCreateTime) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.dyId = dyId;
        this.dyTitle = dyTitle;
        this.dyImage = dyImage;
        this.dyCont = dyCont;
        this.dyCreateTime = dyCreateTime;
    }

    public DynamicToUser() {
    }
}
