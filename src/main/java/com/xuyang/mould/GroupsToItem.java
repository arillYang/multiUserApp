/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GroupsToItem
 * Author:   PanYin
 * Date:     2018/11/6 10:48
 * Description: 团购和团购明细实体表
 */
package com.xuyang.mould;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈团购和团购明细实体表〉
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
public class GroupsToItem {

    private Long groupId;   //主键
    private String groupNo; //团号
    private Long createUserId;  //创建人ID，用户ID
    private Date endTime;       //结束时间
    private String userNickname;    //用户昵称
    private String userHead;        //用户头像
    private Integer maxNum;         //总买家数

    private Integer spareUser;         //还剩多少人拼团
    private Integer sumUser;           //该商品总有多少人拼团

    public GroupsToItem(Long groupId, String groupNo, Long createUserId, Date endTime, String userNickname, String userHead, Integer maxNum, Integer spareUser, Integer sumUser) {
        this.groupId = groupId;
        this.groupNo = groupNo;
        this.createUserId = createUserId;
        this.endTime = endTime;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.maxNum = maxNum;
        this.spareUser = spareUser;
        this.sumUser = sumUser;
    }

    public GroupsToItem() {
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getSpareUser() {
        return spareUser;
    }

    public void setSpareUser(Integer spareUser) {
        this.spareUser = spareUser;
    }

    public Integer getSumUser() {
        return sumUser;
    }

    public void setSumUser(Integer sumUser) {
        this.sumUser = sumUser;
    }
}
