package com.xuyang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TreadingTabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public TreadingTabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
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
     * This method corresponds to the database table t_readingtab
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
     * This method corresponds to the database table t_readingtab
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_readingtab
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
     * This class corresponds to the database table t_readingtab
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

        public Criteria andClickIdIsNull() {
            addCriterion("click_id is null");
            return (Criteria) this;
        }

        public Criteria andClickIdIsNotNull() {
            addCriterion("click_id is not null");
            return (Criteria) this;
        }

        public Criteria andClickIdEqualTo(Integer value) {
            addCriterion("click_id =", value, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdNotEqualTo(Integer value) {
            addCriterion("click_id <>", value, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdGreaterThan(Integer value) {
            addCriterion("click_id >", value, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_id >=", value, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdLessThan(Integer value) {
            addCriterion("click_id <", value, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdLessThanOrEqualTo(Integer value) {
            addCriterion("click_id <=", value, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdIn(List<Integer> values) {
            addCriterion("click_id in", values, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdNotIn(List<Integer> values) {
            addCriterion("click_id not in", values, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdBetween(Integer value1, Integer value2) {
            addCriterion("click_id between", value1, value2, "clickId");
            return (Criteria) this;
        }

        public Criteria andClickIdNotBetween(Integer value1, Integer value2) {
            addCriterion("click_id not between", value1, value2, "clickId");
            return (Criteria) this;
        }

        public Criteria andDyIdIsNull() {
            addCriterion("dy_id is null");
            return (Criteria) this;
        }

        public Criteria andDyIdIsNotNull() {
            addCriterion("dy_id is not null");
            return (Criteria) this;
        }

        public Criteria andDyIdEqualTo(Integer value) {
            addCriterion("dy_id =", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdNotEqualTo(Integer value) {
            addCriterion("dy_id <>", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdGreaterThan(Integer value) {
            addCriterion("dy_id >", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dy_id >=", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdLessThan(Integer value) {
            addCriterion("dy_id <", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdLessThanOrEqualTo(Integer value) {
            addCriterion("dy_id <=", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdIn(List<Integer> values) {
            addCriterion("dy_id in", values, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdNotIn(List<Integer> values) {
            addCriterion("dy_id not in", values, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdBetween(Integer value1, Integer value2) {
            addCriterion("dy_id between", value1, value2, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dy_id not between", value1, value2, "dyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDyUrlIsNull() {
            addCriterion("dy_url is null");
            return (Criteria) this;
        }

        public Criteria andDyUrlIsNotNull() {
            addCriterion("dy_url is not null");
            return (Criteria) this;
        }

        public Criteria andDyUrlEqualTo(String value) {
            addCriterion("dy_url =", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlNotEqualTo(String value) {
            addCriterion("dy_url <>", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlGreaterThan(String value) {
            addCriterion("dy_url >", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dy_url >=", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlLessThan(String value) {
            addCriterion("dy_url <", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlLessThanOrEqualTo(String value) {
            addCriterion("dy_url <=", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlLike(String value) {
            addCriterion("dy_url like", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlNotLike(String value) {
            addCriterion("dy_url not like", value, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlIn(List<String> values) {
            addCriterion("dy_url in", values, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlNotIn(List<String> values) {
            addCriterion("dy_url not in", values, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlBetween(String value1, String value2) {
            addCriterion("dy_url between", value1, value2, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andDyUrlNotBetween(String value1, String value2) {
            addCriterion("dy_url not between", value1, value2, "dyUrl");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeIsNull() {
            addCriterion("click_createtime is null");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeIsNotNull() {
            addCriterion("click_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeEqualTo(Date value) {
            addCriterion("click_createtime =", value, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeNotEqualTo(Date value) {
            addCriterion("click_createtime <>", value, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeGreaterThan(Date value) {
            addCriterion("click_createtime >", value, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("click_createtime >=", value, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeLessThan(Date value) {
            addCriterion("click_createtime <", value, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("click_createtime <=", value, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeIn(List<Date> values) {
            addCriterion("click_createtime in", values, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeNotIn(List<Date> values) {
            addCriterion("click_createtime not in", values, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeBetween(Date value1, Date value2) {
            addCriterion("click_createtime between", value1, value2, "clickCreatetime");
            return (Criteria) this;
        }

        public Criteria andClickCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("click_createtime not between", value1, value2, "clickCreatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_readingtab
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
     * This class corresponds to the database table t_readingtab
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