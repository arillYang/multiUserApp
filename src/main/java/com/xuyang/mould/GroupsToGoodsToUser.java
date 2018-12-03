/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: GroupsToGoodsToUser
 * Author:   PanYin
 * Date:     2018/11/30 17:23
 * Description: 团购关联实体类
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈团购关联实体类〉
 * @author PanYin
 * @create 2018/11/30
 * @since 1.0.0
 */
public class GroupsToGoodsToUser {

    /*  团购实体  */
    private Long groupId;               //团购主键
    private String groupNo;             //团号
    private String groupTitle;          //团购标题
    private String groupLogo;           //团购logo

    private String groupArea;           //团购区域
    private Date beginTime;             //开始时间
    private Date endTime;               //结束时间
    private Integer maxNum;             //最大买家数
    private BigDecimal buyerAmt;        //买家起团金额
    private BigDecimal minAmt;          //最低开团金额
    private Integer groupStatus;        //状态0 发布-未审核 1 审核通过 2 审核未通过 3 团成 4 未团成 5 时间到失效
    private String remarks;             //描述
    private Long createUserId;          //创建人
    private Date createTime;            //创建时间
    private String groupRemark;         //审核备注

    /* 团购买家实体 */
    private Long gbId;                  //主键ID
    private Long buyerId;               //买家ID
    private Long itemId;                //团购明细ID
    private Long orderId;               //订单ID
    private Integer gbNum;              //团购数量
    private BigDecimal gbPrice;         //团购价格
    private BigDecimal gbAmt;           //团购金额
    private Integer gbStatus;           //状态(1完成 -1取消)
    private Date gbTime;                //团购时间

    /* 团购明细实体 */
    private Long goodsId;               //商品ID
    private Long formatId;              //商品规格ID
    private BigDecimal groupPrice;      //团购价格
    private Integer groupNum;           //团购数量
    private Integer itemStatus;         //状态(1在用 -1停用)
    private Date itemcreateTime;        //创建时间

    /* 商品 */
    private String gName;             //商品名称
    private BigDecimal gPrice;         //商品价格
    private String gImage;             //商品配图

    /* 商品规格 */
    private String formatName;         //规格名称

    /* 商家 */
    private String shopName;          //店铺名称
    private String userNickname;       //用户昵称
    private String userHead;           //用户头像
    private String tenantSid;            //商家ID

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

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public String getGroupLogo() {
        return groupLogo;
    }

    public void setGroupLogo(String groupLogo) {
        this.groupLogo = groupLogo;
    }

    public String getGroupArea() {
        return groupArea;
    }

    public void setGroupArea(String groupArea) {
        this.groupArea = groupArea;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public BigDecimal getBuyerAmt() {
        return buyerAmt;
    }

    public void setBuyerAmt(BigDecimal buyerAmt) {
        this.buyerAmt = buyerAmt;
    }

    public BigDecimal getMinAmt() {
        return minAmt;
    }

    public void setMinAmt(BigDecimal minAmt) {
        this.minAmt = minAmt;
    }

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGroupRemark() {
        return groupRemark;
    }

    public void setGroupRemark(String groupRemark) {
        this.groupRemark = groupRemark;
    }

    public Long getGbId() {
        return gbId;
    }

    public void setGbId(Long gbId) {
        this.gbId = gbId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getGbNum() {
        return gbNum;
    }

    public void setGbNum(Integer gbNum) {
        this.gbNum = gbNum;
    }

    public BigDecimal getGbPrice() {
        return gbPrice;
    }

    public void setGbPrice(BigDecimal gbPrice) {
        this.gbPrice = gbPrice;
    }

    public BigDecimal getGbAmt() {
        return gbAmt;
    }

    public void setGbAmt(BigDecimal gbAmt) {
        this.gbAmt = gbAmt;
    }

    public Integer getGbStatus() {
        return gbStatus;
    }

    public void setGbStatus(Integer gbStatus) {
        this.gbStatus = gbStatus;
    }

    public Date getGbTime() {
        return gbTime;
    }

    public void setGbTime(Date gbTime) {
        this.gbTime = gbTime;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getFormatId() {
        return formatId;
    }

    public void setFormatId(Long formatId) {
        this.formatId = formatId;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Date getItemcreateTime() {
        return itemcreateTime;
    }

    public void setItemcreateTime(Date itemcreateTime) {
        this.itemcreateTime = itemcreateTime;
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

    public String getTenantSid() {
        return tenantSid;
    }

    public void setTenantSid(String tenantSid) {
        this.tenantSid = tenantSid;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public GroupsToGoodsToUser() {
    }

    public GroupsToGoodsToUser(Long groupId, String groupNo, String groupTitle, String groupLogo, String groupArea, Date beginTime, Date endTime, Integer maxNum, BigDecimal buyerAmt, BigDecimal minAmt, Integer groupStatus, String remarks, Long createUserId, Date createTime, String groupRemark, Long gbId, Long buyerId, Long itemId, Long orderId, Integer gbNum, BigDecimal gbPrice, BigDecimal gbAmt, Integer gbStatus, Date gbTime, Long goodsId, Long formatId, BigDecimal groupPrice, Integer groupNum, Integer itemStatus, Date itemcreateTime, String gName, BigDecimal gPrice, String gImage, String tenantSid, String formatName, String shopName, String userNickname, String userHead) {
        this.groupId = groupId;
        this.groupNo = groupNo;
        this.groupTitle = groupTitle;
        this.groupLogo = groupLogo;
        this.groupArea = groupArea;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.maxNum = maxNum;
        this.buyerAmt = buyerAmt;
        this.minAmt = minAmt;
        this.groupStatus = groupStatus;
        this.remarks = remarks;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.groupRemark = groupRemark;
        this.gbId = gbId;
        this.buyerId = buyerId;
        this.itemId = itemId;
        this.orderId = orderId;
        this.gbNum = gbNum;
        this.gbPrice = gbPrice;
        this.gbAmt = gbAmt;
        this.gbStatus = gbStatus;
        this.gbTime = gbTime;
        this.goodsId = goodsId;
        this.formatId = formatId;
        this.groupPrice = groupPrice;
        this.groupNum = groupNum;
        this.itemStatus = itemStatus;
        this.itemcreateTime = itemcreateTime;
        this.gName = gName;
        this.gPrice = gPrice;
        this.gImage = gImage;
        this.tenantSid = tenantSid;
        this.formatName = formatName;
        this.shopName = shopName;
        this.userNickname = userNickname;
        this.userHead = userHead;
    }
}
