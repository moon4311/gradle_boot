package com.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComnCodeExample {
    /**
     
     * This field corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    protected String orderByClause;

    /**
     
     * This field corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    protected boolean distinct;

    /**
     
     * This field corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    protected List<Criteria> oredCriteria;

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public ComnCodeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
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
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSCOMMONCODE
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

        public Criteria andComcdIdIsNull() {
            addCriterion("COMCD_ID is null");
            return (Criteria) this;
        }

        public Criteria andComcdIdIsNotNull() {
            addCriterion("COMCD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComcdIdEqualTo(String value) {
            addCriterion("COMCD_ID =", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdNotEqualTo(String value) {
            addCriterion("COMCD_ID <>", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdGreaterThan(String value) {
            addCriterion("COMCD_ID >", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMCD_ID >=", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdLessThan(String value) {
            addCriterion("COMCD_ID <", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdLessThanOrEqualTo(String value) {
            addCriterion("COMCD_ID <=", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdLike(String value) {
            addCriterion("COMCD_ID like", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdNotLike(String value) {
            addCriterion("COMCD_ID not like", value, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdIn(List<String> values) {
            addCriterion("COMCD_ID in", values, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdNotIn(List<String> values) {
            addCriterion("COMCD_ID not in", values, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdBetween(String value1, String value2) {
            addCriterion("COMCD_ID between", value1, value2, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdIdNotBetween(String value1, String value2) {
            addCriterion("COMCD_ID not between", value1, value2, "comcdId");
            return (Criteria) this;
        }

        public Criteria andComcdCodeIsNull() {
            addCriterion("COMCD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andComcdCodeIsNotNull() {
            addCriterion("COMCD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andComcdCodeEqualTo(String value) {
            addCriterion("COMCD_CODE =", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeNotEqualTo(String value) {
            addCriterion("COMCD_CODE <>", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeGreaterThan(String value) {
            addCriterion("COMCD_CODE >", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMCD_CODE >=", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeLessThan(String value) {
            addCriterion("COMCD_CODE <", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeLessThanOrEqualTo(String value) {
            addCriterion("COMCD_CODE <=", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeLike(String value) {
            addCriterion("COMCD_CODE like", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeNotLike(String value) {
            addCriterion("COMCD_CODE not like", value, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeIn(List<String> values) {
            addCriterion("COMCD_CODE in", values, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeNotIn(List<String> values) {
            addCriterion("COMCD_CODE not in", values, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeBetween(String value1, String value2) {
            addCriterion("COMCD_CODE between", value1, value2, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdCodeNotBetween(String value1, String value2) {
            addCriterion("COMCD_CODE not between", value1, value2, "comcdCode");
            return (Criteria) this;
        }

        public Criteria andComcdNameIsNull() {
            addCriterion("COMCD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andComcdNameIsNotNull() {
            addCriterion("COMCD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andComcdNameEqualTo(String value) {
            addCriterion("COMCD_NAME =", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameNotEqualTo(String value) {
            addCriterion("COMCD_NAME <>", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameGreaterThan(String value) {
            addCriterion("COMCD_NAME >", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMCD_NAME >=", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameLessThan(String value) {
            addCriterion("COMCD_NAME <", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameLessThanOrEqualTo(String value) {
            addCriterion("COMCD_NAME <=", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameLike(String value) {
            addCriterion("COMCD_NAME like", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameNotLike(String value) {
            addCriterion("COMCD_NAME not like", value, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameIn(List<String> values) {
            addCriterion("COMCD_NAME in", values, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameNotIn(List<String> values) {
            addCriterion("COMCD_NAME not in", values, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameBetween(String value1, String value2) {
            addCriterion("COMCD_NAME between", value1, value2, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdNameNotBetween(String value1, String value2) {
            addCriterion("COMCD_NAME not between", value1, value2, "comcdName");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeIsNull() {
            addCriterion("COMCD_PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeIsNotNull() {
            addCriterion("COMCD_PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeEqualTo(String value) {
            addCriterion("COMCD_PARENT_CODE =", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeNotEqualTo(String value) {
            addCriterion("COMCD_PARENT_CODE <>", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeGreaterThan(String value) {
            addCriterion("COMCD_PARENT_CODE >", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMCD_PARENT_CODE >=", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeLessThan(String value) {
            addCriterion("COMCD_PARENT_CODE <", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeLessThanOrEqualTo(String value) {
            addCriterion("COMCD_PARENT_CODE <=", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeLike(String value) {
            addCriterion("COMCD_PARENT_CODE like", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeNotLike(String value) {
            addCriterion("COMCD_PARENT_CODE not like", value, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeIn(List<String> values) {
            addCriterion("COMCD_PARENT_CODE in", values, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeNotIn(List<String> values) {
            addCriterion("COMCD_PARENT_CODE not in", values, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeBetween(String value1, String value2) {
            addCriterion("COMCD_PARENT_CODE between", value1, value2, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdParentCodeNotBetween(String value1, String value2) {
            addCriterion("COMCD_PARENT_CODE not between", value1, value2, "comcdParentCode");
            return (Criteria) this;
        }

        public Criteria andComcdOrderIsNull() {
            addCriterion("COMCD_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andComcdOrderIsNotNull() {
            addCriterion("COMCD_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andComcdOrderEqualTo(Integer value) {
            addCriterion("COMCD_ORDER =", value, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderNotEqualTo(Integer value) {
            addCriterion("COMCD_ORDER <>", value, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderGreaterThan(Integer value) {
            addCriterion("COMCD_ORDER >", value, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMCD_ORDER >=", value, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderLessThan(Integer value) {
            addCriterion("COMCD_ORDER <", value, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderLessThanOrEqualTo(Integer value) {
            addCriterion("COMCD_ORDER <=", value, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderIn(List<Integer> values) {
            addCriterion("COMCD_ORDER in", values, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderNotIn(List<Integer> values) {
            addCriterion("COMCD_ORDER not in", values, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderBetween(Integer value1, Integer value2) {
            addCriterion("COMCD_ORDER between", value1, value2, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("COMCD_ORDER not between", value1, value2, "comcdOrder");
            return (Criteria) this;
        }

        public Criteria andComcdLevelIsNull() {
            addCriterion("COMCD_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andComcdLevelIsNotNull() {
            addCriterion("COMCD_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andComcdLevelEqualTo(Integer value) {
            addCriterion("COMCD_LEVEL =", value, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelNotEqualTo(Integer value) {
            addCriterion("COMCD_LEVEL <>", value, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelGreaterThan(Integer value) {
            addCriterion("COMCD_LEVEL >", value, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMCD_LEVEL >=", value, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelLessThan(Integer value) {
            addCriterion("COMCD_LEVEL <", value, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelLessThanOrEqualTo(Integer value) {
            addCriterion("COMCD_LEVEL <=", value, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelIn(List<Integer> values) {
            addCriterion("COMCD_LEVEL in", values, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelNotIn(List<Integer> values) {
            addCriterion("COMCD_LEVEL not in", values, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelBetween(Integer value1, Integer value2) {
            addCriterion("COMCD_LEVEL between", value1, value2, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andComcdLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("COMCD_LEVEL not between", value1, value2, "comcdLevel");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("ISACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("ISACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Short value) {
            addCriterion("ISACTIVE =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Short value) {
            addCriterion("ISACTIVE <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Short value) {
            addCriterion("ISACTIVE >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Short value) {
            addCriterion("ISACTIVE >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Short value) {
            addCriterion("ISACTIVE <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Short value) {
            addCriterion("ISACTIVE <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Short> values) {
            addCriterion("ISACTIVE in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Short> values) {
            addCriterion("ISACTIVE not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Short value1, Short value2) {
            addCriterion("ISACTIVE between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Short value1, Short value2) {
            addCriterion("ISACTIVE not between", value1, value2, "isactive");
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

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("CREATED_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("CREATED_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(String value) {
            addCriterion("CREATED_USER_ID =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(String value) {
            addCriterion("CREATED_USER_ID <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(String value) {
            addCriterion("CREATED_USER_ID >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_ID >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(String value) {
            addCriterion("CREATED_USER_ID <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_ID <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLike(String value) {
            addCriterion("CREATED_USER_ID like", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotLike(String value) {
            addCriterion("CREATED_USER_ID not like", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<String> values) {
            addCriterion("CREATED_USER_ID in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<String> values) {
            addCriterion("CREATED_USER_ID not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(String value1, String value2) {
            addCriterion("CREATED_USER_ID between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER_ID not between", value1, value2, "createdUserId");
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

        public Criteria andModifiedUserIdIsNull() {
            addCriterion("MODIFIED_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIsNotNull() {
            addCriterion("MODIFIED_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID =", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID <>", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdGreaterThan(String value) {
            addCriterion("MODIFIED_USER_ID >", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID >=", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLessThan(String value) {
            addCriterion("MODIFIED_USER_ID <", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID <=", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLike(String value) {
            addCriterion("MODIFIED_USER_ID like", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotLike(String value) {
            addCriterion("MODIFIED_USER_ID not like", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIn(List<String> values) {
            addCriterion("MODIFIED_USER_ID in", values, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotIn(List<String> values) {
            addCriterion("MODIFIED_USER_ID not in", values, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdBetween(String value1, String value2) {
            addCriterion("MODIFIED_USER_ID between", value1, value2, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_USER_ID not between", value1, value2, "modifiedUserId");
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
     * This class corresponds to the database table TB_CMSCOMMONCODE
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
     * This class corresponds to the database table TB_CMSCOMMONCODE
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