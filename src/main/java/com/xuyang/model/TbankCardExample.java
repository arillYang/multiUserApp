package com.xuyang.model;

import java.util.ArrayList;
import java.util.List;

public class TbankCardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public TbankCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
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
     * This method corresponds to the database table t_bank_card
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
     * This method corresponds to the database table t_bank_card
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bank_card
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
     * This class corresponds to the database table t_bank_card
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

        public Criteria andBankCardIdIsNull() {
            addCriterion("bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNotNull() {
            addCriterion("bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdEqualTo(Integer value) {
            addCriterion("bank_card_id =", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotEqualTo(Integer value) {
            addCriterion("bank_card_id <>", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThan(Integer value) {
            addCriterion("bank_card_id >", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_card_id >=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThan(Integer value) {
            addCriterion("bank_card_id <", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_card_id <=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIn(List<Integer> values) {
            addCriterion("bank_card_id in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotIn(List<Integer> values) {
            addCriterion("bank_card_id not in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_id between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_id not between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNull() {
            addCriterion("bank_card_number is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNotNull() {
            addCriterion("bank_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberEqualTo(String value) {
            addCriterion("bank_card_number =", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotEqualTo(String value) {
            addCriterion("bank_card_number <>", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThan(String value) {
            addCriterion("bank_card_number >", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_number >=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThan(String value) {
            addCriterion("bank_card_number <", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_card_number <=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLike(String value) {
            addCriterion("bank_card_number like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotLike(String value) {
            addCriterion("bank_card_number not like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIn(List<String> values) {
            addCriterion("bank_card_number in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotIn(List<String> values) {
            addCriterion("bank_card_number not in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberBetween(String value1, String value2) {
            addCriterion("bank_card_number between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotBetween(String value1, String value2) {
            addCriterion("bank_card_number not between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankIsNull() {
            addCriterion("bank_card_openbank is null");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankIsNotNull() {
            addCriterion("bank_card_openbank is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankEqualTo(String value) {
            addCriterion("bank_card_openbank =", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankNotEqualTo(String value) {
            addCriterion("bank_card_openbank <>", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankGreaterThan(String value) {
            addCriterion("bank_card_openbank >", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_openbank >=", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankLessThan(String value) {
            addCriterion("bank_card_openbank <", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankLessThanOrEqualTo(String value) {
            addCriterion("bank_card_openbank <=", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankLike(String value) {
            addCriterion("bank_card_openbank like", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankNotLike(String value) {
            addCriterion("bank_card_openbank not like", value, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankIn(List<String> values) {
            addCriterion("bank_card_openbank in", values, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankNotIn(List<String> values) {
            addCriterion("bank_card_openbank not in", values, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankBetween(String value1, String value2) {
            addCriterion("bank_card_openbank between", value1, value2, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardOpenbankNotBetween(String value1, String value2) {
            addCriterion("bank_card_openbank not between", value1, value2, "bankCardOpenbank");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressIsNull() {
            addCriterion("bank_card_address is null");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressIsNotNull() {
            addCriterion("bank_card_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressEqualTo(String value) {
            addCriterion("bank_card_address =", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotEqualTo(String value) {
            addCriterion("bank_card_address <>", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressGreaterThan(String value) {
            addCriterion("bank_card_address >", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_address >=", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressLessThan(String value) {
            addCriterion("bank_card_address <", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_card_address <=", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressLike(String value) {
            addCriterion("bank_card_address like", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotLike(String value) {
            addCriterion("bank_card_address not like", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressIn(List<String> values) {
            addCriterion("bank_card_address in", values, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotIn(List<String> values) {
            addCriterion("bank_card_address not in", values, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressBetween(String value1, String value2) {
            addCriterion("bank_card_address between", value1, value2, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotBetween(String value1, String value2) {
            addCriterion("bank_card_address not between", value1, value2, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andTenantSidIsNull() {
            addCriterion("tenant_sid is null");
            return (Criteria) this;
        }

        public Criteria andTenantSidIsNotNull() {
            addCriterion("tenant_sid is not null");
            return (Criteria) this;
        }

        public Criteria andTenantSidEqualTo(String value) {
            addCriterion("tenant_sid =", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidNotEqualTo(String value) {
            addCriterion("tenant_sid <>", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidGreaterThan(String value) {
            addCriterion("tenant_sid >", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_sid >=", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidLessThan(String value) {
            addCriterion("tenant_sid <", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidLessThanOrEqualTo(String value) {
            addCriterion("tenant_sid <=", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidLike(String value) {
            addCriterion("tenant_sid like", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidNotLike(String value) {
            addCriterion("tenant_sid not like", value, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidIn(List<String> values) {
            addCriterion("tenant_sid in", values, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidNotIn(List<String> values) {
            addCriterion("tenant_sid not in", values, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidBetween(String value1, String value2) {
            addCriterion("tenant_sid between", value1, value2, "tenantSid");
            return (Criteria) this;
        }

        public Criteria andTenantSidNotBetween(String value1, String value2) {
            addCriterion("tenant_sid not between", value1, value2, "tenantSid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bank_card
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
     * This class corresponds to the database table t_bank_card
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