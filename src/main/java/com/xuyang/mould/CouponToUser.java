/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: CouponToUser
 * Author:   PanYin
 * Date:     2018/11/15 9:57
 * Description: 优惠券和用户关联实体类
 */
package com.xuyang.mould;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈优惠券和用户关联实体类〉
 * @author PanYin
 * @create 2018/11/15
 * @since 1.0.0
 */
public class CouponToUser {

    private Integer couponId;   //优惠券ID
    private String couponName;  //优惠券名称
    private String couponType;  //优惠券类型
    private Integer couponMoney;    //优惠券面额
    private String couponDes;       //优惠活动描述
    private Integer couponSendNum;  //发放数量
    private Integer couponReceiveNum;   //领取数量
    private Date couponSendStartTime;   //发放开始时间
    private Date couponSendEndTime;     //发放结束时间
    private Date couponValidStartTime;  //活动开始时间
    private Date couponValidEndTime;    //活动结束时间
    private Date couponCreateTime;      //创建时间
    private String couponFlag;          //有效状态

    private Integer userId;             //用户ID
    private String userNickname;        //用户昵称
    private String userHead;            //用户头像
    private String userPhone;           //用户手机号码

    private Integer cuId;               //中间表ID
    private Date receiveTime;           //领取时间
    private String couponStatus;        //使用状态
    private String dataFalg;            //有效状态

    public CouponToUser(Integer couponId, String couponName, String couponType, Integer couponMoney, String couponDes, Integer couponSendNum, Integer couponReceiveNum, Date couponSendStartTime, Date couponSendEndTime, Date couponValidStartTime, Date couponValidEndTime, Date couponCreateTime, String couponFlag, Integer userId, String userNickname, String userHead, String userPhone, Integer cuId, Date receiveTime, String couponStatus, String dataFalg) {
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponType = couponType;
        this.couponMoney = couponMoney;
        this.couponDes = couponDes;
        this.couponSendNum = couponSendNum;
        this.couponReceiveNum = couponReceiveNum;
        this.couponSendStartTime = couponSendStartTime;
        this.couponSendEndTime = couponSendEndTime;
        this.couponValidStartTime = couponValidStartTime;
        this.couponValidEndTime = couponValidEndTime;
        this.couponCreateTime = couponCreateTime;
        this.couponFlag = couponFlag;
        this.userId = userId;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.userPhone = userPhone;
        this.cuId = cuId;
        this.receiveTime = receiveTime;
        this.couponStatus = couponStatus;
        this.dataFalg = dataFalg;
    }

    public CouponToUser() {
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Integer getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(Integer couponMoney) {
        this.couponMoney = couponMoney;
    }

    public String getCouponDes() {
        return couponDes;
    }

    public void setCouponDes(String couponDes) {
        this.couponDes = couponDes;
    }

    public Integer getCouponSendNum() {
        return couponSendNum;
    }

    public void setCouponSendNum(Integer couponSendNum) {
        this.couponSendNum = couponSendNum;
    }

    public Integer getCouponReceiveNum() {
        return couponReceiveNum;
    }

    public void setCouponReceiveNum(Integer couponReceiveNum) {
        this.couponReceiveNum = couponReceiveNum;
    }

    public Date getCouponSendStartTime() {
        return couponSendStartTime;
    }

    public void setCouponSendStartTime(Date couponSendStartTime) {
        this.couponSendStartTime = couponSendStartTime;
    }

    public Date getCouponSendEndTime() {
        return couponSendEndTime;
    }

    public void setCouponSendEndTime(Date couponSendEndTime) {
        this.couponSendEndTime = couponSendEndTime;
    }

    public Date getCouponValidStartTime() {
        return couponValidStartTime;
    }

    public void setCouponValidStartTime(Date couponValidStartTime) {
        this.couponValidStartTime = couponValidStartTime;
    }

    public Date getCouponValidEndTime() {
        return couponValidEndTime;
    }

    public void setCouponValidEndTime(Date couponValidEndTime) {
        this.couponValidEndTime = couponValidEndTime;
    }

    public Date getCouponCreateTime() {
        return couponCreateTime;
    }

    public void setCouponCreateTime(Date couponCreateTime) {
        this.couponCreateTime = couponCreateTime;
    }

    public String getCouponFlag() {
        return couponFlag;
    }

    public void setCouponFlag(String couponFlag) {
        this.couponFlag = couponFlag;
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getDataFalg() {
        return dataFalg;
    }

    public void setDataFalg(String dataFalg) {
        this.dataFalg = dataFalg;
    }
}
