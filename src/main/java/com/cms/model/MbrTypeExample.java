package com.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MbrTypeExample {
    /**
     
     * This field corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    protected String orderByClause;

    /**
     
     * This field corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    protected boolean distinct;

    /**
     
     * This field corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    protected List<Criteria> oredCriteria;

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public MbrTypeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("TYPE_ID like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("TYPE_ID not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNmIsNull() {
            addCriterion("TYPE_NM is null");
            return (Criteria) this;
        }

        public Criteria andTypeNmIsNotNull() {
            addCriterion("TYPE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNmEqualTo(String value) {
            addCriterion("TYPE_NM =", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmNotEqualTo(String value) {
            addCriterion("TYPE_NM <>", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmGreaterThan(String value) {
            addCriterion("TYPE_NM >", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NM >=", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmLessThan(String value) {
            addCriterion("TYPE_NM <", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NM <=", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmLike(String value) {
            addCriterion("TYPE_NM like", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmNotLike(String value) {
            addCriterion("TYPE_NM not like", value, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmIn(List<String> values) {
            addCriterion("TYPE_NM in", values, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmNotIn(List<String> values) {
            addCriterion("TYPE_NM not in", values, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmBetween(String value1, String value2) {
            addCriterion("TYPE_NM between", value1, value2, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeNmNotBetween(String value1, String value2) {
            addCriterion("TYPE_NM not between", value1, value2, "typeNm");
            return (Criteria) this;
        }

        public Criteria andTypeLvIsNull() {
            addCriterion("TYPE_LV is null");
            return (Criteria) this;
        }

        public Criteria andTypeLvIsNotNull() {
            addCriterion("TYPE_LV is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLvEqualTo(String value) {
            addCriterion("TYPE_LV =", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvNotEqualTo(String value) {
            addCriterion("TYPE_LV <>", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvGreaterThan(String value) {
            addCriterion("TYPE_LV >", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_LV >=", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvLessThan(String value) {
            addCriterion("TYPE_LV <", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvLessThanOrEqualTo(String value) {
            addCriterion("TYPE_LV <=", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvLike(String value) {
            addCriterion("TYPE_LV like", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvNotLike(String value) {
            addCriterion("TYPE_LV not like", value, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvIn(List<String> values) {
            addCriterion("TYPE_LV in", values, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvNotIn(List<String> values) {
            addCriterion("TYPE_LV not in", values, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvBetween(String value1, String value2) {
            addCriterion("TYPE_LV between", value1, value2, "typeLv");
            return (Criteria) this;
        }

        public Criteria andTypeLvNotBetween(String value1, String value2) {
            addCriterion("TYPE_LV not between", value1, value2, "typeLv");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("CREATED is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("CREATED =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("CREATED <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("CREATED >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("CREATED <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("CREATED <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("CREATED in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("CREATED not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("CREATED between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("CREATED not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("MODIFIED =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("MODIFIED <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("MODIFIED >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("MODIFIED <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("MODIFIED in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("MODIFIED not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("MODIFIED between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Short value) {
            addCriterion("ISDEL =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Short value) {
            addCriterion("ISDEL <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Short value) {
            addCriterion("ISDEL >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Short value) {
            addCriterion("ISDEL >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Short value) {
            addCriterion("ISDEL <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Short value) {
            addCriterion("ISDEL <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Short> values) {
            addCriterion("ISDEL in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Short> values) {
            addCriterion("ISDEL not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Short value1, Short value2) {
            addCriterion("ISDEL between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Short value1, Short value2) {
            addCriterion("ISDEL not between", value1, value2, "isdel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSMBRTYPE
     *
     * @mbg.generated do_not_delete_during_merge Sat Jun 06 19:23:16 KST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSMBRTYPE
     *
     
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