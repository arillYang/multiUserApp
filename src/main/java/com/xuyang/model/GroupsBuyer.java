package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GroupsBuyer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.gb_id
     *
     * @mbg.generated
     */
    private Long gbId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.buyer_id
     *
     * @mbg.generated
     */
    private Long buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.group_id
     *
     * @mbg.generated
     */
    private Long groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.item_id
     *
     * @mbg.generated
     */
    private Long itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.order_id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.gb_num
     *
     * @mbg.generated
     */
    private Integer gbNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.gb_price
     *
     * @mbg.generated
     */
    private BigDecimal gbPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.gb_amt
     *
     * @mbg.generated
     */
    private BigDecimal gbAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.gb_status
     *
     * @mbg.generated
     */
    private Integer gbStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_buyer.gb_time
     *
     * @mbg.generated
     */
    private Date gbTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups_buyer
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.gb_id
     *
     * @return the value of groups_buyer.gb_id
     *
     * @mbg.generated
     */
    public Long getGbId() {
        return gbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.gb_id
     *
     * @param gbId the value for groups_buyer.gb_id
     *
     * @mbg.generated
     */
    public void setGbId(Long gbId) {
        this.gbId = gbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.buyer_id
     *
     * @return the value of groups_buyer.buyer_id
     *
     * @mbg.generated
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.buyer_id
     *
     * @param buyerId the value for groups_buyer.buyer_id
     *
     * @mbg.generated
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.group_id
     *
     * @return the value of groups_buyer.group_id
     *
     * @mbg.generated
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.group_id
     *
     * @param groupId the value for groups_buyer.group_id
     *
     * @mbg.generated
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.item_id
     *
     * @return the value of groups_buyer.item_id
     *
     * @mbg.generated
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.item_id
     *
     * @param itemId the value for groups_buyer.item_id
     *
     * @mbg.generated
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.order_id
     *
     * @return the value of groups_buyer.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.order_id
     *
     * @param orderId the value for groups_buyer.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.gb_num
     *
     * @return the value of groups_buyer.gb_num
     *
     * @mbg.generated
     */
    public Integer getGbNum() {
        return gbNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.gb_num
     *
     * @param gbNum the value for groups_buyer.gb_num
     *
     * @mbg.generated
     */
    public void setGbNum(Integer gbNum) {
        this.gbNum = gbNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.gb_price
     *
     * @return the value of groups_buyer.gb_price
     *
     * @mbg.generated
     */
    public BigDecimal getGbPrice() {
        return gbPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.gb_price
     *
     * @param gbPrice the value for groups_buyer.gb_price
     *
     * @mbg.generated
     */
    public void setGbPrice(BigDecimal gbPrice) {
        this.gbPrice = gbPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.gb_amt
     *
     * @return the value of groups_buyer.gb_amt
     *
     * @mbg.generated
     */
    public BigDecimal getGbAmt() {
        return gbAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.gb_amt
     *
     * @param gbAmt the value for groups_buyer.gb_amt
     *
     * @mbg.generated
     */
    public void setGbAmt(BigDecimal gbAmt) {
        this.gbAmt = gbAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.gb_status
     *
     * @return the value of groups_buyer.gb_status
     *
     * @mbg.generated
     */
    public Integer getGbStatus() {
        return gbStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.gb_status
     *
     * @param gbStatus the value for groups_buyer.gb_status
     *
     * @mbg.generated
     */
    public void setGbStatus(Integer gbStatus) {
        this.gbStatus = gbStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_buyer.gb_time
     *
     * @return the value of groups_buyer.gb_time
     *
     * @mbg.generated
     */
    public Date getGbTime() {
        return gbTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_buyer.gb_time
     *
     * @param gbTime the value for groups_buyer.gb_time
     *
     * @mbg.generated
     */
    public void setGbTime(Date gbTime) {
        this.gbTime = gbTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_buyer
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gbId=").append(gbId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", groupId=").append(groupId);
        sb.append(", itemId=").append(itemId);
        sb.append(", orderId=").append(orderId);
        sb.append(", gbNum=").append(gbNum);
        sb.append(", gbPrice=").append(gbPrice);
        sb.append(", gbAmt=").append(gbAmt);
        sb.append(", gbStatus=").append(gbStatus);
        sb.append(", gbTime=").append(gbTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}