/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: ShoppingToGoodsToUser
 * Author:   PanYin
 * Date:     2018/11/6 14:45
 * Description: 购物车关联用户和商品表
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈购物车关联用户和商品表〉
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
public class ShoppingToGoodsToUser {
    private Integer carId;      //购物车ID
    private Integer userId;     //用户ID
    private Integer goodsId;        //商品ID
    private Integer num;        //数量
    private Integer status;        //状态
    private Date createTime;    //创建时间
    private Date updateTime;    //修改时间
    private String gtName;      //商品类型
    private Integer gtId;       //类型ID（商品）
    private String gName;       //商品名称
    private BigDecimal gPrice;  //商品价格
    private String gImage;      //商品图片

    public ShoppingToGoodsToUser(Integer carId, Integer userId, Integer goodsId, Integer num, Integer status, Date createTime, Date updateTime, String gtName, Integer gtId, String gName, BigDecimal gPrice, String gImage) {
        this.carId = carId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.num = num;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.gtName = gtName;
        this.gtId = gtId;
        this.gName = gName;
        this.gPrice = gPrice;
        this.gImage = gImage;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    public ShoppingToGoodsToUser() {
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public BigDecimal getgPrice() {
        return gPrice;
    }

    public void setgPrice(BigDecimal gPrice) {
        this.gPrice = gPrice;
    }

    public String getgImage() {
        return gImage;
    }

    public void setgImage(String gImage) {
        this.gImage = gImage;
    }
}
