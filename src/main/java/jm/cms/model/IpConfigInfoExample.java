package jm.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IpConfigInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public IpConfigInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
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
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
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

        public Criteria andCmsTypeIsNull() {
            addCriterion("CMS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmsTypeIsNotNull() {
            addCriterion("CMS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmsTypeEqualTo(String value) {
            addCriterion("CMS_TYPE =", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeNotEqualTo(String value) {
            addCriterion("CMS_TYPE <>", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeGreaterThan(String value) {
            addCriterion("CMS_TYPE >", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CMS_TYPE >=", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeLessThan(String value) {
            addCriterion("CMS_TYPE <", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeLessThanOrEqualTo(String value) {
            addCriterion("CMS_TYPE <=", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeLike(String value) {
            addCriterion("CMS_TYPE like", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeNotLike(String value) {
            addCriterion("CMS_TYPE not like", value, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeIn(List<String> values) {
            addCriterion("CMS_TYPE in", values, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeNotIn(List<String> values) {
            addCriterion("CMS_TYPE not in", values, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeBetween(String value1, String value2) {
            addCriterion("CMS_TYPE between", value1, value2, "cmsType");
            return (Criteria) this;
        }

        public Criteria andCmsTypeNotBetween(String value1, String value2) {
            addCriterion("CMS_TYPE not between", value1, value2, "cmsType");
            return (Criteria) this;
        }

        public Criteria andIpAddrIsNull() {
            addCriterion("IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andIpAddrIsNotNull() {
            addCriterion("IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddrEqualTo(String value) {
            addCriterion("IP_ADDR =", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotEqualTo(String value) {
            addCriterion("IP_ADDR <>", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThan(String value) {
            addCriterion("IP_ADDR >", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDR >=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThan(String value) {
            addCriterion("IP_ADDR <", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDR <=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLike(String value) {
            addCriterion("IP_ADDR like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotLike(String value) {
            addCriterion("IP_ADDR not like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrIn(List<String> values) {
            addCriterion("IP_ADDR in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotIn(List<String> values) {
            addCriterion("IP_ADDR not in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrBetween(String value1, String value2) {
            addCriterion("IP_ADDR between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotBetween(String value1, String value2) {
            addCriterion("IP_ADDR not between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpBandIsNull() {
            addCriterion("IP_BAND is null");
            return (Criteria) this;
        }

        public Criteria andIpBandIsNotNull() {
            addCriterion("IP_BAND is not null");
            return (Criteria) this;
        }

        public Criteria andIpBandEqualTo(String value) {
            addCriterion("IP_BAND =", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandNotEqualTo(String value) {
            addCriterion("IP_BAND <>", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandGreaterThan(String value) {
            addCriterion("IP_BAND >", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandGreaterThanOrEqualTo(String value) {
            addCriterion("IP_BAND >=", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandLessThan(String value) {
            addCriterion("IP_BAND <", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandLessThanOrEqualTo(String value) {
            addCriterion("IP_BAND <=", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandLike(String value) {
            addCriterion("IP_BAND like", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandNotLike(String value) {
            addCriterion("IP_BAND not like", value, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandIn(List<String> values) {
            addCriterion("IP_BAND in", values, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandNotIn(List<String> values) {
            addCriterion("IP_BAND not in", values, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandBetween(String value1, String value2) {
            addCriterion("IP_BAND between", value1, value2, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpBandNotBetween(String value1, String value2) {
            addCriterion("IP_BAND not between", value1, value2, "ipBand");
            return (Criteria) this;
        }

        public Criteria andIpDescIsNull() {
            addCriterion("IP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andIpDescIsNotNull() {
            addCriterion("IP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andIpDescEqualTo(String value) {
            addCriterion("IP_DESC =", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescNotEqualTo(String value) {
            addCriterion("IP_DESC <>", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescGreaterThan(String value) {
            addCriterion("IP_DESC >", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescGreaterThanOrEqualTo(String value) {
            addCriterion("IP_DESC >=", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescLessThan(String value) {
            addCriterion("IP_DESC <", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescLessThanOrEqualTo(String value) {
            addCriterion("IP_DESC <=", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescLike(String value) {
            addCriterion("IP_DESC like", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescNotLike(String value) {
            addCriterion("IP_DESC not like", value, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescIn(List<String> values) {
            addCriterion("IP_DESC in", values, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescNotIn(List<String> values) {
            addCriterion("IP_DESC not in", values, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescBetween(String value1, String value2) {
            addCriterion("IP_DESC between", value1, value2, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andIpDescNotBetween(String value1, String value2) {
            addCriterion("IP_DESC not between", value1, value2, "ipDesc");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("MBR_ID not between", value1, value2, "mbrId");
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
     * This class corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated do_not_delete_during_merge Sat Jun 06 11:44:28 KST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSIPCONFIGINFO
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
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