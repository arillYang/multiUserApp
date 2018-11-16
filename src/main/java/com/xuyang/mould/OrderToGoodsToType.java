/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: OrderToGoodsToType
 * Author:   PanYin
 * Date:     2018/11/16 10:22
 * Description: 订单详情
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈订单详情〉
 * @author PanYin
 * @create 2018/11/16
 * @since 1.0.0
 */
public class OrderToGoodsToType {
    private Integer orderId;    //订单ID
    private String orderNo;     //订单编号
    private Integer userId;     //用户ID
    private Date orderCreatetime;   //创建时间
    private String orderState;      //订单状态
    private BigDecimal orderTotalMoney; //商品总价格
    private BigDecimal orderDeliverMoney;   //运费
    private String orderPaytype;        //支付类型
    private String orderIsself;     //是否自提
    private String orderIspay;      //是否支付
    private String orderDeliverType;    //配送方式
    private String orderUserName;       //收货人姓名
    private String orderUserAddress;       //收货地址
    private String orderUsertel;        //收货人电话
    private String orderPhone;      //收货人手机号码
    private String orderPostCode;       //邮编
    private String orderIsinvoice;      //是否要发票
    private String orderInvoiceClient;      //发票开头
    private String orderIsappraises;        //是否点评
    private String orderIsrefund;       //是否退款
    private String orderRefundRemark;       //退款说明
    private String orderSrc;        //订单来源
    private String orderGlag;       //订单标示
    private String orderPayfrom;        //支付来源
    private BigDecimal orderRealTotalMoney;     //实际订单金额
    private String orderFrom;       //订单来源
    private String orderCouponMoney;        //优惠券金额
    private String tenantSid;       //商家ID

    private String userNickname;    //用户昵称
    private String userHead;        //用户头像
    private String userPhone;       //用户账号

    private String gName;       //商品名称
    private BigDecimal gPrice;  //商品价格
    private String gAgio;       //商品折扣
    private String gSpec;       //商品单位
    private BigDecimal gMarketPrice;        //商品市场价
    private Integer gStock;     //商品库存
    private Integer gSaleCount;     //销量
    private String gSale;       //是否上架
    private String gHot;        //是否为热销
    private String gBest;       //是否精品
    private String gNews;       //是否新品
    private Integer gtId;       //类型Id
    private String gDesc;       //商品描述
    private String gFlag;       //审核状态
    private Date gCreatetime;   //添加时间
    private String gImage;      //商品配图
    private String gThums;      //商品缩略图
    private Integer formatId;   //商品规格ID

    private Integer ogId;       //订单商品ID
    private Integer goodsNums;      //商品数量
    private BigDecimal goodsPrice;  //商品价格
    private String gtName;      //商品类型名称

    public OrderToGoodsToType(Integer orderId, String orderNo, Integer userId, Date orderCreatetime, String orderState, BigDecimal orderTotalMoney, BigDecimal orderDeliverMoney, String orderPaytype, String orderIsself, String orderIspay, String orderDeliverType, String orderUserName, String orderUserAddress, String orderUsertel, String orderPhone, String orderPostCode, String orderIsinvoice, String orderInvoiceClient, String orderIsappraises, String orderIsrefund, String orderRefundRemark, String orderSrc, String orderGlag, String orderPayfrom, BigDecimal orderRealTotalMoney, String orderFrom, String orderCouponMoney, String tenantSid, String userNickname, String userHead, String userPhone, String gName, BigDecimal gPrice, String gAgio, String gSpec, BigDecimal gMarketPrice, Integer gStock, Integer gSaleCount, String gSale, String gHot, String gBest, String gNews, Integer gtId, String gDesc, String gFlag, Date gCreatetime, String gImage, String gThums, Integer formatId, Integer ogId, Integer goodsNums, BigDecimal goodsPrice, String gtName) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.orderCreatetime = orderCreatetime;
        this.orderState = orderState;
        this.orderTotalMoney = orderTotalMoney;
        this.orderDeliverMoney = orderDeliverMoney;
        this.orderPaytype = orderPaytype;
        this.orderIsself = orderIsself;
        this.orderIspay = orderIspay;
        this.orderDeliverType = orderDeliverType;
        this.orderUserName = orderUserName;
        this.orderUserAddress = orderUserAddress;
        this.orderUsertel = orderUsertel;
        this.orderPhone = orderPhone;
        this.orderPostCode = orderPostCode;
        this.orderIsinvoice = orderIsinvoice;
        this.orderInvoiceClient = orderInvoiceClient;
        this.orderIsappraises = orderIsappraises;
        this.orderIsrefund = orderIsrefund;
        this.orderRefundRemark = orderRefundRemark;
        this.orderSrc = orderSrc;
        this.orderGlag = orderGlag;
        this.orderPayfrom = orderPayfrom;
        this.orderRealTotalMoney = orderRealTotalMoney;
        this.orderFrom = orderFrom;
        this.orderCouponMoney = orderCouponMoney;
        this.tenantSid = tenantSid;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.userPhone = userPhone;
        this.gName = gName;
        this.gPrice = gPrice;
        this.gAgio = gAgio;
        this.gSpec = gSpec;
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
        this.ogId = ogId;
        this.goodsNums = goodsNums;
        this.goodsPrice = goodsPrice;
        this.gtName = gtName;
    }

    public OrderToGoodsToType() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public BigDecimal getOrderTotalMoney() {
        return orderTotalMoney;
    }

    public void setOrderTotalMoney(BigDecimal orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney;
    }

    public BigDecimal getOrderDeliverMoney() {
        return orderDeliverMoney;
    }

    public void setOrderDeliverMoney(BigDecimal orderDeliverMoney) {
        this.orderDeliverMoney = orderDeliverMoney;
    }

    public String getOrderPaytype() {
        return orderPaytype;
    }

    public void setOrderPaytype(String orderPaytype) {
        this.orderPaytype = orderPaytype;
    }

    public String getOrderIsself() {
        return orderIsself;
    }

    public void setOrderIsself(String orderIsself) {
        this.orderIsself = orderIsself;
    }

    public String getOrderIspay() {
        return orderIspay;
    }

    public void setOrderIspay(String orderIspay) {
        this.orderIspay = orderIspay;
    }

    public String getOrderDeliverType() {
        return orderDeliverType;
    }

    public void setOrderDeliverType(String orderDeliverType) {
        this.orderDeliverType = orderDeliverType;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName;
    }

    public String getOrderUserAddress() {
        return orderUserAddress;
    }

    public void setOrderUserAddress(String orderUserAddress) {
        this.orderUserAddress = orderUserAddress;
    }

    public String getOrderUsertel() {
        return orderUsertel;
    }

    public void setOrderUsertel(String orderUsertel) {
        this.orderUsertel = orderUsertel;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderPostCode() {
        return orderPostCode;
    }

    public void setOrderPostCode(String orderPostCode) {
        this.orderPostCode = orderPostCode;
    }

    public String getOrderIsinvoice() {
        return orderIsinvoice;
    }

    public void setOrderIsinvoice(String orderIsinvoice) {
        this.orderIsinvoice = orderIsinvoice;
    }

    public String getOrderInvoiceClient() {
        return orderInvoiceClient;
    }

    public void setOrderInvoiceClient(String orderInvoiceClient) {
        this.orderInvoiceClient = orderInvoiceClient;
    }

    public String getOrderIsappraises() {
        return orderIsappraises;
    }

    public void setOrderIsappraises(String orderIsappraises) {
        this.orderIsappraises = orderIsappraises;
    }

    public String getOrderIsrefund() {
        return orderIsrefund;
    }

    public void setOrderIsrefund(String orderIsrefund) {
        this.orderIsrefund = orderIsrefund;
    }

    public String getOrderRefundRemark() {
        return orderRefundRemark;
    }

    public void setOrderRefundRemark(String orderRefundRemark) {
        this.orderRefundRemark = orderRefundRemark;
    }

    public String getOrderSrc() {
        return orderSrc;
    }

    public void setOrderSrc(String orderSrc) {
        this.orderSrc = orderSrc;
    }

    public String getOrderGlag() {
        return orderGlag;
    }

    public void setOrderGlag(String orderGlag) {
        this.orderGlag = orderGlag;
    }

    public String getOrderPayfrom() {
        return orderPayfrom;
    }

    public void setOrderPayfrom(String orderPayfrom) {
        this.orderPayfrom = orderPayfrom;
    }

    public BigDecimal getOrderRealTotalMoney() {
        return orderRealTotalMoney;
    }

    public void setOrderRealTotalMoney(BigDecimal orderRealTotalMoney) {
        this.orderRealTotalMoney = orderRealTotalMoney;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getOrderCouponMoney() {
        return orderCouponMoney;
    }

    public void setOrderCouponMoney(String orderCouponMoney) {
        this.orderCouponMoney = orderCouponMoney;
    }

    public String getTenantSid() {
        return tenantSid;
    }

    public void setTenantSid(String tenantSid) {
        this.tenantSid = tenantSid;
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

    public Integer getOgId() {
        return ogId;
    }

    public void setOgId(Integer ogId) {
        this.ogId = ogId;
    }

    public Integer getGoodsNums() {
        return goodsNums;
    }

    public void setGoodsNums(Integer goodsNums) {
        this.goodsNums = goodsNums;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }
}
