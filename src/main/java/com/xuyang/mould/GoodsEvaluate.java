/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GoodsEvaluate
 * Author:   PanYin
 * Date:     2018/11/5 18:19
 * Description: 商品和评论关联表
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品和评论关联表〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
public class GoodsEvaluate {
    private Integer gaId;       //评论ID
    private Integer gId;        //商品ID
    private Integer userId;     //用户ID
    private Integer formatId;   //商品规格id

    private String gName;       //商品名称
    private BigDecimal gPrice;  //商品价格

    private String userNickname;    //用户昵称
    private String userHead;        //用户头像

    private Integer gScore;     //商品评分
    private Integer gServiceSocre;      //服务评论
    private String gaContent;       //评论内容
    private String isShow;      //是否显示
    private Date createTime;        //评论时间
    private String appraisesAnnex;      //评论图片

    private String formatName;      //规格名称

    public GoodsEvaluate(Integer gaId, Integer gId, Integer userId, Integer formatId, String gName, BigDecimal gPrice, String userNickname, String userHead, Integer gScore, Integer gServiceSocre, String gaContent, String isShow, Date createTime, String appraisesAnnex, String formatName) {
        this.gaId = gaId;
        this.gId = gId;
        this.userId = userId;
        this.formatId = formatId;
        this.gName = gName;
        this.gPrice = gPrice;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.gScore = gScore;
        this.gServiceSocre = gServiceSocre;
        this.gaContent = gaContent;
        this.isShow = isShow;
        this.createTime = createTime;
        this.appraisesAnnex = appraisesAnnex;
        this.formatName = formatName;
    }

    public GoodsEvaluate() {
    }

    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
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

    public Integer getFormatId() {
        return formatId;
    }

    public void setFormatId(Integer formatId) {
        this.formatId = formatId;
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

    public Integer getgScore() {
        return gScore;
    }

    public void setgScore(Integer gScore) {
        this.gScore = gScore;
    }

    public Integer getgServiceSocre() {
        return gServiceSocre;
    }

    public void setgServiceSocre(Integer gServiceSocre) {
        this.gServiceSocre = gServiceSocre;
    }

    public String getGaContent() {
        return gaContent;
    }

    public void setGaContent(String gaContent) {
        this.gaContent = gaContent;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAppraisesAnnex() {
        return appraisesAnnex;
    }

    public void setAppraisesAnnex(String appraisesAnnex) {
        this.appraisesAnnex = appraisesAnnex;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }
}
