package com.xuyang.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TquotientLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.ql_id
     *
     * @mbg.generated
     */
    private Integer qlId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.quotient_id
     *
     * @mbg.generated
     */
    private Integer quotientId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.numbs
     *
     * @mbg.generated
     */
    private Integer numbs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_quotient_log.commision
     *
     * @mbg.generated
     */
    private BigDecimal commision;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_quotient_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.ql_id
     *
     * @return the value of t_quotient_log.ql_id
     *
     * @mbg.generated
     */
    public Integer getQlId() {
        return qlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.ql_id
     *
     * @param qlId the value for t_quotient_log.ql_id
     *
     * @mbg.generated
     */
    public void setQlId(Integer qlId) {
        this.qlId = qlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.quotient_id
     *
     * @return the value of t_quotient_log.quotient_id
     *
     * @mbg.generated
     */
    public Integer getQuotientId() {
        return quotientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.quotient_id
     *
     * @param quotientId the value for t_quotient_log.quotient_id
     *
     * @mbg.generated
     */
    public void setQuotientId(Integer quotientId) {
        this.quotientId = quotientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.user_id
     *
     * @return the value of t_quotient_log.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.user_id
     *
     * @param userId the value for t_quotient_log.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.create_time
     *
     * @return the value of t_quotient_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.create_time
     *
     * @param createTime the value for t_quotient_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.numbs
     *
     * @return the value of t_quotient_log.numbs
     *
     * @mbg.generated
     */
    public Integer getNumbs() {
        return numbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.numbs
     *
     * @param numbs the value for t_quotient_log.numbs
     *
     * @mbg.generated
     */
    public void setNumbs(Integer numbs) {
        this.numbs = numbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.money
     *
     * @return the value of t_quotient_log.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.money
     *
     * @param money the value for t_quotient_log.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_quotient_log.commision
     *
     * @return the value of t_quotient_log.commision
     *
     * @mbg.generated
     */
    public BigDecimal getCommision() {
        return commision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_quotient_log.commision
     *
     * @param commision the value for t_quotient_log.commision
     *
     * @mbg.generated
     */
    public void setCommision(BigDecimal commision) {
        this.commision = commision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quotient_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qlId=").append(qlId);
        sb.append(", quotientId=").append(quotientId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", numbs=").append(numbs);
        sb.append(", money=").append(money);
        sb.append(", commision=").append(commision);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}