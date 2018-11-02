package com.xuyang.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public GroupsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table groups
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNoIsNull() {
            addCriterion("group_no is null");
            return (Criteria) this;
        }

        public Criteria andGroupNoIsNotNull() {
            addCriterion("group_no is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNoEqualTo(String value) {
            addCriterion("group_no =", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotEqualTo(String value) {
            addCriterion("group_no <>", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoGreaterThan(String value) {
            addCriterion("group_no >", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("group_no >=", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoLessThan(String value) {
            addCriterion("group_no <", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoLessThanOrEqualTo(String value) {
            addCriterion("group_no <=", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoLike(String value) {
            addCriterion("group_no like", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotLike(String value) {
            addCriterion("group_no not like", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoIn(List<String> values) {
            addCriterion("group_no in", values, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotIn(List<String> values) {
            addCriterion("group_no not in", values, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoBetween(String value1, String value2) {
            addCriterion("group_no between", value1, value2, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotBetween(String value1, String value2) {
            addCriterion("group_no not between", value1, value2, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupTitleIsNull() {
            addCriterion("group_title is null");
            return (Criteria) this;
        }

        public Criteria andGroupTitleIsNotNull() {
            addCriterion("group_title is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTitleEqualTo(String value) {
            addCriterion("group_title =", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotEqualTo(String value) {
            addCriterion("group_title <>", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleGreaterThan(String value) {
            addCriterion("group_title >", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleGreaterThanOrEqualTo(String value) {
            addCriterion("group_title >=", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleLessThan(String value) {
            addCriterion("group_title <", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleLessThanOrEqualTo(String value) {
            addCriterion("group_title <=", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleLike(String value) {
            addCriterion("group_title like", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotLike(String value) {
            addCriterion("group_title not like", value, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleIn(List<String> values) {
            addCriterion("group_title in", values, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotIn(List<String> values) {
            addCriterion("group_title not in", values, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleBetween(String value1, String value2) {
            addCriterion("group_title between", value1, value2, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupTitleNotBetween(String value1, String value2) {
            addCriterion("group_title not between", value1, value2, "groupTitle");
            return (Criteria) this;
        }

        public Criteria andGroupLogoIsNull() {
            addCriterion("group_logo is null");
            return (Criteria) this;
        }

        public Criteria andGroupLogoIsNotNull() {
            addCriterion("group_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupLogoEqualTo(String value) {
            addCriterion("group_logo =", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotEqualTo(String value) {
            addCriterion("group_logo <>", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoGreaterThan(String value) {
            addCriterion("group_logo >", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoGreaterThanOrEqualTo(String value) {
            addCriterion("group_logo >=", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoLessThan(String value) {
            addCriterion("group_logo <", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoLessThanOrEqualTo(String value) {
            addCriterion("group_logo <=", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoLike(String value) {
            addCriterion("group_logo like", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotLike(String value) {
            addCriterion("group_logo not like", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoIn(List<String> values) {
            addCriterion("group_logo in", values, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotIn(List<String> values) {
            addCriterion("group_logo not in", values, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoBetween(String value1, String value2) {
            addCriterion("group_logo between", value1, value2, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotBetween(String value1, String value2) {
            addCriterion("group_logo not between", value1, value2, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupAreaIsNull() {
            addCriterion("group_area is null");
            return (Criteria) this;
        }

        public Criteria andGroupAreaIsNotNull() {
            addCriterion("group_area is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAreaEqualTo(String value) {
            addCriterion("group_area =", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaNotEqualTo(String value) {
            addCriterion("group_area <>", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaGreaterThan(String value) {
            addCriterion("group_area >", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaGreaterThanOrEqualTo(String value) {
            addCriterion("group_area >=", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaLessThan(String value) {
            addCriterion("group_area <", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaLessThanOrEqualTo(String value) {
            addCriterion("group_area <=", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaLike(String value) {
            addCriterion("group_area like", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaNotLike(String value) {
            addCriterion("group_area not like", value, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaIn(List<String> values) {
            addCriterion("group_area in", values, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaNotIn(List<String> values) {
            addCriterion("group_area not in", values, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaBetween(String value1, String value2) {
            addCriterion("group_area between", value1, value2, "groupArea");
            return (Criteria) this;
        }

        public Criteria andGroupAreaNotBetween(String value1, String value2) {
            addCriterion("group_area not between", value1, value2, "groupArea");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNull() {
            addCriterion("max_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNotNull() {
            addCriterion("max_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumEqualTo(Integer value) {
            addCriterion("max_num =", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotEqualTo(Integer value) {
            addCriterion("max_num <>", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThan(Integer value) {
            addCriterion("max_num >", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_num >=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThan(Integer value) {
            addCriterion("max_num <", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("max_num <=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIn(List<Integer> values) {
            addCriterion("max_num in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotIn(List<Integer> values) {
            addCriterion("max_num not in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("max_num between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("max_num not between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtIsNull() {
            addCriterion("buyer_amt is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtIsNotNull() {
            addCriterion("buyer_amt is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtEqualTo(BigDecimal value) {
            addCriterion("buyer_amt =", value, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtNotEqualTo(BigDecimal value) {
            addCriterion("buyer_amt <>", value, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtGreaterThan(BigDecimal value) {
            addCriterion("buyer_amt >", value, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buyer_amt >=", value, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtLessThan(BigDecimal value) {
            addCriterion("buyer_amt <", value, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buyer_amt <=", value, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtIn(List<BigDecimal> values) {
            addCriterion("buyer_amt in", values, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtNotIn(List<BigDecimal> values) {
            addCriterion("buyer_amt not in", values, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyer_amt between", value1, value2, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andBuyerAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyer_amt not between", value1, value2, "buyerAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtIsNull() {
            addCriterion("min_amt is null");
            return (Criteria) this;
        }

        public Criteria andMinAmtIsNotNull() {
            addCriterion("min_amt is not null");
            return (Criteria) this;
        }

        public Criteria andMinAmtEqualTo(BigDecimal value) {
            addCriterion("min_amt =", value, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtNotEqualTo(BigDecimal value) {
            addCriterion("min_amt <>", value, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtGreaterThan(BigDecimal value) {
            addCriterion("min_amt >", value, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_amt >=", value, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtLessThan(BigDecimal value) {
            addCriterion("min_amt <", value, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_amt <=", value, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtIn(List<BigDecimal> values) {
            addCriterion("min_amt in", values, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtNotIn(List<BigDecimal> values) {
            addCriterion("min_amt not in", values, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_amt between", value1, value2, "minAmt");
            return (Criteria) this;
        }

        public Criteria andMinAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_amt not between", value1, value2, "minAmt");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIsNull() {
            addCriterion("group_status is null");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIsNotNull() {
            addCriterion("group_status is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStatusEqualTo(Byte value) {
            addCriterion("group_status =", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotEqualTo(Byte value) {
            addCriterion("group_status <>", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusGreaterThan(Byte value) {
            addCriterion("group_status >", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("group_status >=", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusLessThan(Byte value) {
            addCriterion("group_status <", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusLessThanOrEqualTo(Byte value) {
            addCriterion("group_status <=", value, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusIn(List<Byte> values) {
            addCriterion("group_status in", values, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotIn(List<Byte> values) {
            addCriterion("group_status not in", values, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusBetween(Byte value1, Byte value2) {
            addCriterion("group_status between", value1, value2, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andGroupStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("group_status not between", value1, value2, "groupStatus");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table groups
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table groups
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}