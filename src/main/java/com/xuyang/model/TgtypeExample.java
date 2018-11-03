package com.xuyang.model;

import java.util.ArrayList;
import java.util.List;

public class TgtypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public TgtypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
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
     * This method corresponds to the database table t_gtype
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
     * This method corresponds to the database table t_gtype
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gtype
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
     * This class corresponds to the database table t_gtype
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

        public Criteria andGtIdIsNull() {
            addCriterion("gt_id is null");
            return (Criteria) this;
        }

        public Criteria andGtIdIsNotNull() {
            addCriterion("gt_id is not null");
            return (Criteria) this;
        }

        public Criteria andGtIdEqualTo(Integer value) {
            addCriterion("gt_id =", value, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdNotEqualTo(Integer value) {
            addCriterion("gt_id <>", value, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdGreaterThan(Integer value) {
            addCriterion("gt_id >", value, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gt_id >=", value, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdLessThan(Integer value) {
            addCriterion("gt_id <", value, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdLessThanOrEqualTo(Integer value) {
            addCriterion("gt_id <=", value, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdIn(List<Integer> values) {
            addCriterion("gt_id in", values, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdNotIn(List<Integer> values) {
            addCriterion("gt_id not in", values, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdBetween(Integer value1, Integer value2) {
            addCriterion("gt_id between", value1, value2, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gt_id not between", value1, value2, "gtId");
            return (Criteria) this;
        }

        public Criteria andGtNameIsNull() {
            addCriterion("gt_name is null");
            return (Criteria) this;
        }

        public Criteria andGtNameIsNotNull() {
            addCriterion("gt_name is not null");
            return (Criteria) this;
        }

        public Criteria andGtNameEqualTo(String value) {
            addCriterion("gt_name =", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameNotEqualTo(String value) {
            addCriterion("gt_name <>", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameGreaterThan(String value) {
            addCriterion("gt_name >", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameGreaterThanOrEqualTo(String value) {
            addCriterion("gt_name >=", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameLessThan(String value) {
            addCriterion("gt_name <", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameLessThanOrEqualTo(String value) {
            addCriterion("gt_name <=", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameLike(String value) {
            addCriterion("gt_name like", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameNotLike(String value) {
            addCriterion("gt_name not like", value, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameIn(List<String> values) {
            addCriterion("gt_name in", values, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameNotIn(List<String> values) {
            addCriterion("gt_name not in", values, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameBetween(String value1, String value2) {
            addCriterion("gt_name between", value1, value2, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtNameNotBetween(String value1, String value2) {
            addCriterion("gt_name not between", value1, value2, "gtName");
            return (Criteria) this;
        }

        public Criteria andGtSwitchIsNull() {
            addCriterion("gt_switch is null");
            return (Criteria) this;
        }

        public Criteria andGtSwitchIsNotNull() {
            addCriterion("gt_switch is not null");
            return (Criteria) this;
        }

        public Criteria andGtSwitchEqualTo(String value) {
            addCriterion("gt_switch =", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchNotEqualTo(String value) {
            addCriterion("gt_switch <>", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchGreaterThan(String value) {
            addCriterion("gt_switch >", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("gt_switch >=", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchLessThan(String value) {
            addCriterion("gt_switch <", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchLessThanOrEqualTo(String value) {
            addCriterion("gt_switch <=", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchLike(String value) {
            addCriterion("gt_switch like", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchNotLike(String value) {
            addCriterion("gt_switch not like", value, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchIn(List<String> values) {
            addCriterion("gt_switch in", values, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchNotIn(List<String> values) {
            addCriterion("gt_switch not in", values, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchBetween(String value1, String value2) {
            addCriterion("gt_switch between", value1, value2, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andGtSwitchNotBetween(String value1, String value2) {
            addCriterion("gt_switch not between", value1, value2, "gtSwitch");
            return (Criteria) this;
        }

        public Criteria andWotIdIsNull() {
            addCriterion("wot_id is null");
            return (Criteria) this;
        }

        public Criteria andWotIdIsNotNull() {
            addCriterion("wot_id is not null");
            return (Criteria) this;
        }

        public Criteria andWotIdEqualTo(Integer value) {
            addCriterion("wot_id =", value, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdNotEqualTo(Integer value) {
            addCriterion("wot_id <>", value, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdGreaterThan(Integer value) {
            addCriterion("wot_id >", value, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wot_id >=", value, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdLessThan(Integer value) {
            addCriterion("wot_id <", value, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdLessThanOrEqualTo(Integer value) {
            addCriterion("wot_id <=", value, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdIn(List<Integer> values) {
            addCriterion("wot_id in", values, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdNotIn(List<Integer> values) {
            addCriterion("wot_id not in", values, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdBetween(Integer value1, Integer value2) {
            addCriterion("wot_id between", value1, value2, "wotId");
            return (Criteria) this;
        }

        public Criteria andWotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wot_id not between", value1, value2, "wotId");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameIsNull() {
            addCriterion("gt_typtname is null");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameIsNotNull() {
            addCriterion("gt_typtname is not null");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameEqualTo(String value) {
            addCriterion("gt_typtname =", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameNotEqualTo(String value) {
            addCriterion("gt_typtname <>", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameGreaterThan(String value) {
            addCriterion("gt_typtname >", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameGreaterThanOrEqualTo(String value) {
            addCriterion("gt_typtname >=", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameLessThan(String value) {
            addCriterion("gt_typtname <", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameLessThanOrEqualTo(String value) {
            addCriterion("gt_typtname <=", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameLike(String value) {
            addCriterion("gt_typtname like", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameNotLike(String value) {
            addCriterion("gt_typtname not like", value, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameIn(List<String> values) {
            addCriterion("gt_typtname in", values, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameNotIn(List<String> values) {
            addCriterion("gt_typtname not in", values, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameBetween(String value1, String value2) {
            addCriterion("gt_typtname between", value1, value2, "gtTyptname");
            return (Criteria) this;
        }

        public Criteria andGtTyptnameNotBetween(String value1, String value2) {
            addCriterion("gt_typtname not between", value1, value2, "gtTyptname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_gtype
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
     * This class corresponds to the database table t_gtype
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