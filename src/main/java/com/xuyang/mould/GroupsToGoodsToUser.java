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
    private String g_name;              //商品名称
    private BigDecimal g_price;         //商品价格
    private String g_image;             //商品配图
    private Long tenant_sid;            //商家ID

    /* 商品规格 */
    private String format_name;         //规格名称

    /* 商家 */
    private String shop_name;           //店铺名称
    private String user_nickname;       //用户昵称
    private String user_head;           //用户头像

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

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public BigDecimal getG_price() {
        return g_price;
    }

    public void setG_price(BigDecimal g_price) {
        this.g_price = g_price;
    }

    public String getG_image() {
        return g_image;
    }

    public void setG_image(String g_image) {
        this.g_image = g_image;
    }

    public Long getTenant_sid() {
        return tenant_sid;
    }

    public void setTenant_sid(Long tenant_sid) {
        this.tenant_sid = tenant_sid;
    }

    public String getFormat_name() {
        return format_name;
    }

    public void setFormat_name(String format_name) {
        this.format_name = format_name;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_head() {
        return user_head;
    }

    public void setUser_head(String user_head) {
        this.user_head = user_head;
    }

    public GroupsToGoodsToUser() {
    }

    public GroupsToGoodsToUser(Long groupId, String groupNo, String groupTitle, String groupLogo, String groupArea, Date beginTime, Date endTime, Integer maxNum, BigDecimal buyerAmt, BigDecimal minAmt, Integer groupStatus, String remarks, Long createUserId, Date createTime, String groupRemark, Long gbId, Long buyerId, Long itemId, Long orderId, Integer gbNum, BigDecimal gbPrice, BigDecimal gbAmt, Integer gbStatus, Date gbTime, Long goodsId, Long formatId, BigDecimal groupPrice, Integer groupNum, Integer itemStatus, Date itemcreateTime, String g_name, BigDecimal g_price, String g_image, Long tenant_sid, String format_name, String shop_name, String user_nickname, String user_head) {
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
        this.g_name = g_name;
        this.g_price = g_price;
        this.g_image = g_image;
        this.tenant_sid = tenant_sid;
        this.format_name = format_name;
        this.shop_name = shop_name;
        this.user_nickname = user_nickname;
        this.user_head = user_head;
    }
}
