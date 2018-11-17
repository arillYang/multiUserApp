/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: Quotient
 * Author:   PanYin
 * Date:     2018/11/17 17:45
 * Description: 商推关联中间类
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商推关联中间类〉
 * @author PanYin
 * @create 2018/11/17
 * @since 1.0.0
 */
public class Quotient {
    private Integer quotientId;     //商推ID

    private Integer gId;        //商品ID

    private Integer userId;     //用户ID

    private Date createTime;    //创建时间

    private String spreadImage; //商推内容

    private String spreadContent;   //商推图片


    private Integer qlId;       //商推记录ID

    private Integer numbs;      //购买数量

    private BigDecimal money;   //金额

    private BigDecimal commision;   //佣金

    public Quotient(Integer quotientId, Integer gId, Integer userId, Date createTime, String spreadImage, String spreadContent, Integer qlId, Integer numbs, BigDecimal money, BigDecimal commision) {
        this.quotientId = quotientId;
        this.gId = gId;
        this.userId = userId;
        this.createTime = createTime;
        this.spreadImage = spreadImage;
        this.spreadContent = spreadContent;
        this.qlId = qlId;
        this.numbs = numbs;
        this.money = money;
        this.commision = commision;
    }

    public Quotient() {
    }

    public Integer getQuotientId() {
        return quotientId;
    }

    public void setQuotientId(Integer quotientId) {
        this.quotientId = quotientId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSpreadImage() {
        return spreadImage;
    }

    public void setSpreadImage(String spreadImage) {
        this.spreadImage = spreadImage;
    }

    public String getSpreadContent() {
        return spreadContent;
    }

    public void setSpreadContent(String spreadContent) {
        this.spreadContent = spreadContent;
    }

    public Integer getQlId() {
        return qlId;
    }

    public void setQlId(Integer qlId) {
        this.qlId = qlId;
    }

    public Integer getNumbs() {
        return numbs;
    }

    public void setNumbs(Integer numbs) {
        this.numbs = numbs;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getCommision() {
        return commision;
    }

    public void setCommision(BigDecimal commision) {
        this.commision = commision;
    }
}
