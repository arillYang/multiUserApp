package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GroupsItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.item_id
     *
     * @mbg.generated
     */
    private Long itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.group_id
     *
     * @mbg.generated
     */
    private Long groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.goods_id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.format_id
     *
     * @mbg.generated
     */
    private Long formatId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.group_price
     *
     * @mbg.generated
     */
    private BigDecimal groupPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.group_num
     *
     * @mbg.generated
     */
    private Integer groupNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.item_status
     *
     * @mbg.generated
     */
    private Integer itemStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.create_user_id
     *
     * @mbg.generated
     */
    private Long createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groups_item.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups_item
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.item_id
     *
     * @return the value of groups_item.item_id
     *
     * @mbg.generated
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.item_id
     *
     * @param itemId the value for groups_item.item_id
     *
     * @mbg.generated
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.group_id
     *
     * @return the value of groups_item.group_id
     *
     * @mbg.generated
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.group_id
     *
     * @param groupId the value for groups_item.group_id
     *
     * @mbg.generated
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.goods_id
     *
     * @return the value of groups_item.goods_id
     *
     * @mbg.generated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.goods_id
     *
     * @param goodsId the value for groups_item.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.format_id
     *
     * @return the value of groups_item.format_id
     *
     * @mbg.generated
     */
    public Long getFormatId() {
        return formatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.format_id
     *
     * @param formatId the value for groups_item.format_id
     *
     * @mbg.generated
     */
    public void setFormatId(Long formatId) {
        this.formatId = formatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.group_price
     *
     * @return the value of groups_item.group_price
     *
     * @mbg.generated
     */
    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.group_price
     *
     * @param groupPrice the value for groups_item.group_price
     *
     * @mbg.generated
     */
    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.group_num
     *
     * @return the value of groups_item.group_num
     *
     * @mbg.generated
     */
    public Integer getGroupNum() {
        return groupNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.group_num
     *
     * @param groupNum the value for groups_item.group_num
     *
     * @mbg.generated
     */
    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.item_status
     *
     * @return the value of groups_item.item_status
     *
     * @mbg.generated
     */
    public Integer getItemStatus() {
        return itemStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.item_status
     *
     * @param itemStatus the value for groups_item.item_status
     *
     * @mbg.generated
     */
    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.create_user_id
     *
     * @return the value of groups_item.create_user_id
     *
     * @mbg.generated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.create_user_id
     *
     * @param createUserId the value for groups_item.create_user_id
     *
     * @mbg.generated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groups_item.create_time
     *
     * @return the value of groups_item.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groups_item.create_time
     *
     * @param createTime the value for groups_item.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups_item
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", groupId=").append(groupId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", formatId=").append(formatId);
        sb.append(", groupPrice=").append(groupPrice);
        sb.append(", groupNum=").append(groupNum);
        sb.append(", itemStatus=").append(itemStatus);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}