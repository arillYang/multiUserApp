/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GoodsToImages
 * Author:   PanYin
 * Date:     2018/11/5 16:59
 * Description: 商品和商品图片关联实体
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品和商品图片关联实体〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
public class GoodsToImages {
    private Integer gId;        //商品ID
    private String gName;       //商品名称
    private BigDecimal gPrice;  //商品价格
    private String gAgio;       //商品折扣
    private String gSpec;       //商品单位
    private String tenantSid;   //店铺ID(商家)
    private BigDecimal gMarketPrice;    //商品市场价
    private Integer gStock;     //商品库存
    private Integer gSaleCount;     //销量
    private String gSale;       //是否上架
    private String gHot;        //是否为热销
    private String gBest;       //是否精品
    private String gNews;       //是否新品
    private Integer gtId;       //类型Id
    private String gDesc;       //商品描述
    private String gFlag;       //逻辑删除
    private Date gCreatetime;   //添加时间
    private String gImage;      //商品配图
    private String gThums;      //商品缩略图
    private Integer formatId;   //商品规格ID
    private Integer gimageId;   //商品参数图ID
    private String imageParameter;  //商品参数图
    private String imageDetails;    //商品详情图
    private Integer giId;           //商品图片id
    private String giImage;         //商品图片
    private String giThumbs;        //商品缩略图

    public GoodsToImages(Integer gId, String gName, BigDecimal gPrice, String gAgio, String gSpec, String tenantSid, BigDecimal gMarketPrice, Integer gStock, Integer gSaleCount, String gSale, String gHot, String gBest, String gNews, Integer gtId, String gDesc, String gFlag, Date gCreatetime, String gImage, String gThums, Integer formatId, Integer gimageId, String imageParameter, String imageDetails, Integer giId, String giImage, String giThumbs) {
        this.gId = gId;
        this.gName = gName;
        this.gPrice = gPrice;
        this.gAgio = gAgio;
        this.gSpec = gSpec;
        this.tenantSid = tenantSid;
        this.gMarketPrice = gMarketPrice;
        this.gStock = gStock;
        this.gSaleCount = gSaleCount;
        this.gSale = gSale;
        this.gHot = gHot;
        this.gBest = gBest;
        this.gNews = gNews;
        this.gtId = gtId;
        this.gDesc = gDesc;
        this.gFlag = gFlag;
        this.gCreatetime = gCreatetime;
        this.gImage = gImage;
        this.gThums = gThums;
        this.formatId = formatId;
        this.gimageId = gimageId;
        this.imageParameter = imageParameter;
        this.imageDetails = imageDetails;
        this.giId = giId;
        this.giImage = giImage;
        this.giThumbs = giThumbs;
    }

    public GoodsToImages() {
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

    public String getgAgio() {
        return gAgio;
    }

    public void setgAgio(String gAgio) {
        this.gAgio = gAgio;
    }

    public String getgSpec() {
        return gSpec;
    }

    public void setgSpec(String gSpec) {
        this.gSpec = gSpec;
    }

    public String getTenantSid() {
        return tenantSid;
    }

    public void setTenantSid(String tenantSid) {
        this.tenantSid = tenantSid;
    }

    public BigDecimal getgMarketPrice() {
        return gMarketPrice;
    }

    public void setgMarketPrice(BigDecimal gMarketPrice) {
        this.gMarketPrice = gMarketPrice;
    }

    public Integer getgStock() {
        return gStock;
    }

    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    public Integer getgSaleCount() {
        return gSaleCount;
    }

    public void setgSaleCount(Integer gSaleCount) {
        this.gSaleCount = gSaleCount;
    }

    public String getgSale() {
        return gSale;
    }

    public void setgSale(String gSale) {
        this.gSale = gSale;
    }

    public String getgHot() {
        return gHot;
    }

    public void setgHot(String gHot) {
        this.gHot = gHot;
    }

    public String getgBest() {
        return gBest;
    }

    public void setgBest(String gBest) {
        this.gBest = gBest;
    }

    public String getgNews() {
        return gNews;
    }

    public void setgNews(String gNews) {
        this.gNews = gNews;
    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getgDesc() {
        return gDesc;
    }

    public void setgDesc(String gDesc) {
        this.gDesc = gDesc;
    }

    public String getgFlag() {
        return gFlag;
    }

    public void setgFlag(String gFlag) {
        this.gFlag = gFlag;
    }

    public Date getgCreatetime() {
        return gCreatetime;
    }

    public void setgCreatetime(Date gCreatetime) {
        this.gCreatetime = gCreatetime;
    }

    public String getgImage() {
        return gImage;
    }

    public void setgImage(String gImage) {
        this.gImage = gImage;
    }

    public String getgThums() {
        return gThums;
    }

    public void setgThums(String gThums) {
        this.gThums = gThums;
    }

    public Integer getFormatId() {
        return formatId;
    }

    public void setFormatId(Integer formatId) {
        this.formatId = formatId;
    }

    public Integer getGimageId() {
        return gimageId;
    }

    public void setGimageId(Integer gimageId) {
        this.gimageId = gimageId;
    }

    public String getImageParameter() {
        return imageParameter;
    }

    public void setImageParameter(String imageParameter) {
        this.imageParameter = imageParameter;
    }

    public String getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imageDetails = imageDetails;
    }

    public Integer getGiId() {
        return giId;
    }

    public void setGiId(Integer giId) {
        this.giId = giId;
    }

    public String getGiImage() {
        return giImage;
    }

    public void setGiImage(String giImage) {
        this.giImage = giImage;
    }

    public String getGiThumbs() {
        return giThumbs;
    }

    public void setGiThumbs(String giThumbs) {
        this.giThumbs = giThumbs;
    }
}
