package com.cms.model;

import java.util.ArrayList;
import java.util.List;

public class MenuInfoExample {
    /**
     
     * This field corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    protected String orderByClause;

    /**
     
     * This field corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    protected boolean distinct;

    /**
     
     * This field corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    protected List<Criteria> oredCriteria;

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public MenuInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
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
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSADMENUINFO
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdIsNull() {
            addCriterion("UPPER_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdIsNotNull() {
            addCriterion("UPPER_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdEqualTo(String value) {
            addCriterion("UPPER_MENU_ID =", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdNotEqualTo(String value) {
            addCriterion("UPPER_MENU_ID <>", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdGreaterThan(String value) {
            addCriterion("UPPER_MENU_ID >", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPPER_MENU_ID >=", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdLessThan(String value) {
            addCriterion("UPPER_MENU_ID <", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdLessThanOrEqualTo(String value) {
            addCriterion("UPPER_MENU_ID <=", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdLike(String value) {
            addCriterion("UPPER_MENU_ID like", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdNotLike(String value) {
            addCriterion("UPPER_MENU_ID not like", value, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdIn(List<String> values) {
            addCriterion("UPPER_MENU_ID in", values, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdNotIn(List<String> values) {
            addCriterion("UPPER_MENU_ID not in", values, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdBetween(String value1, String value2) {
            addCriterion("UPPER_MENU_ID between", value1, value2, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andUpperMenuIdNotBetween(String value1, String value2) {
            addCriterion("UPPER_MENU_ID not between", value1, value2, "upperMenuId");
            return (Criteria) this;
        }

        public Criteria andMenuDepthIsNull() {
            addCriterion("MENU_DEPTH is null");
            return (Criteria) this;
        }

        public Criteria andMenuDepthIsNotNull() {
            addCriterion("MENU_DEPTH is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDepthEqualTo(Integer value) {
            addCriterion("MENU_DEPTH =", value, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthNotEqualTo(Integer value) {
            addCriterion("MENU_DEPTH <>", value, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthGreaterThan(Integer value) {
            addCriterion("MENU_DEPTH >", value, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_DEPTH >=", value, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthLessThan(Integer value) {
            addCriterion("MENU_DEPTH <", value, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_DEPTH <=", value, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthIn(List<Integer> values) {
            addCriterion("MENU_DEPTH in", values, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthNotIn(List<Integer> values) {
            addCriterion("MENU_DEPTH not in", values, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthBetween(Integer value1, Integer value2) {
            addCriterion("MENU_DEPTH between", value1, value2, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_DEPTH not between", value1, value2, "menuDepth");
            return (Criteria) this;
        }

        public Criteria andMenuOdrIsNull() {
            addCriterion("MENU_ODR is null");
            return (Criteria) this;
        }

        public Criteria andMenuOdrIsNotNull() {
            addCriterion("MENU_ODR is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOdrEqualTo(Integer value) {
            addCriterion("MENU_ODR =", value, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrNotEqualTo(Integer value) {
            addCriterion("MENU_ODR <>", value, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrGreaterThan(Integer value) {
            addCriterion("MENU_ODR >", value, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ODR >=", value, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrLessThan(Integer value) {
            addCriterion("MENU_ODR <", value, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ODR <=", value, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrIn(List<Integer> values) {
            addCriterion("MENU_ODR in", values, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrNotIn(List<Integer> values) {
            addCriterion("MENU_ODR not in", values, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ODR between", value1, value2, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuOdrNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ODR not between", value1, value2, "menuOdr");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("MENU_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("MENU_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("MENU_ICON =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("MENU_ICON <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("MENU_ICON >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ICON >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("MENU_ICON <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("MENU_ICON <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("MENU_ICON like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("MENU_ICON not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("MENU_ICON in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("MENU_ICON not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("MENU_ICON between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("MENU_ICON not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIsNull() {
            addCriterion("MENU_NM is null");
            return (Criteria) this;
        }

        public Criteria andMenuNmIsNotNull() {
            addCriterion("MENU_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNmEqualTo(String value) {
            addCriterion("MENU_NM =", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotEqualTo(String value) {
            addCriterion("MENU_NM <>", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmGreaterThan(String value) {
            addCriterion("MENU_NM >", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NM >=", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLessThan(String value) {
            addCriterion("MENU_NM <", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLessThanOrEqualTo(String value) {
            addCriterion("MENU_NM <=", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLike(String value) {
            addCriterion("MENU_NM like", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotLike(String value) {
            addCriterion("MENU_NM not like", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmIn(List<String> values) {
            addCriterion("MENU_NM in", values, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotIn(List<String> values) {
            addCriterion("MENU_NM not in", values, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmBetween(String value1, String value2) {
            addCriterion("MENU_NM between", value1, value2, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotBetween(String value1, String value2) {
            addCriterion("MENU_NM not between", value1, value2, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNull() {
            addCriterion("MENU_LINK is null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNotNull() {
            addCriterion("MENU_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkEqualTo(String value) {
            addCriterion("MENU_LINK =", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotEqualTo(String value) {
            addCriterion("MENU_LINK <>", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThan(String value) {
            addCriterion("MENU_LINK >", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_LINK >=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThan(String value) {
            addCriterion("MENU_LINK <", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThanOrEqualTo(String value) {
            addCriterion("MENU_LINK <=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLike(String value) {
            addCriterion("MENU_LINK like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotLike(String value) {
            addCriterion("MENU_LINK not like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIn(List<String> values) {
            addCriterion("MENU_LINK in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotIn(List<String> values) {
            addCriterion("MENU_LINK not in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkBetween(String value1, String value2) {
            addCriterion("MENU_LINK between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotBetween(String value1, String value2) {
            addCriterion("MENU_LINK not between", value1, value2, "menuLink");
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

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("ISACTIVE =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("ISACTIVE <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("ISACTIVE >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVE >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("ISACTIVE <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVE <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("ISACTIVE like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("ISACTIVE not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("ISACTIVE in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("ISACTIVE not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("ISACTIVE between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("ISACTIVE not between", value1, value2, "isactive");
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

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("ISDEL =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("ISDEL <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("ISDEL >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEL >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("ISDEL <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("ISDEL <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("ISDEL like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("ISDEL not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("ISDEL in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("ISDEL not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("ISDEL between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("ISDEL not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelIsNull() {
            addCriterion("CANNOTDEL is null");
            return (Criteria) this;
        }

        public Criteria andCannotdelIsNotNull() {
            addCriterion("CANNOTDEL is not null");
            return (Criteria) this;
        }

        public Criteria andCannotdelEqualTo(String value) {
            addCriterion("CANNOTDEL =", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelNotEqualTo(String value) {
            addCriterion("CANNOTDEL <>", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelGreaterThan(String value) {
            addCriterion("CANNOTDEL >", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelGreaterThanOrEqualTo(String value) {
            addCriterion("CANNOTDEL >=", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelLessThan(String value) {
            addCriterion("CANNOTDEL <", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelLessThanOrEqualTo(String value) {
            addCriterion("CANNOTDEL <=", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelLike(String value) {
            addCriterion("CANNOTDEL like", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelNotLike(String value) {
            addCriterion("CANNOTDEL not like", value, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelIn(List<String> values) {
            addCriterion("CANNOTDEL in", values, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelNotIn(List<String> values) {
            addCriterion("CANNOTDEL not in", values, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelBetween(String value1, String value2) {
            addCriterion("CANNOTDEL between", value1, value2, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andCannotdelNotBetween(String value1, String value2) {
            addCriterion("CANNOTDEL not between", value1, value2, "cannotdel");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("MENU_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("MENU_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("MENU_DESC =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("MENU_DESC <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("MENU_DESC >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_DESC >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("MENU_DESC <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("MENU_DESC <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("MENU_DESC like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("MENU_DESC not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("MENU_DESC in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("MENU_DESC not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("MENU_DESC between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("MENU_DESC not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconIsNull() {
            addCriterion("MENU_NM_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconIsNotNull() {
            addCriterion("MENU_NM_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconEqualTo(String value) {
            addCriterion("MENU_NM_ICON =", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconNotEqualTo(String value) {
            addCriterion("MENU_NM_ICON <>", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconGreaterThan(String value) {
            addCriterion("MENU_NM_ICON >", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NM_ICON >=", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconLessThan(String value) {
            addCriterion("MENU_NM_ICON <", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconLessThanOrEqualTo(String value) {
            addCriterion("MENU_NM_ICON <=", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconLike(String value) {
            addCriterion("MENU_NM_ICON like", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconNotLike(String value) {
            addCriterion("MENU_NM_ICON not like", value, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconIn(List<String> values) {
            addCriterion("MENU_NM_ICON in", values, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconNotIn(List<String> values) {
            addCriterion("MENU_NM_ICON not in", values, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconBetween(String value1, String value2) {
            addCriterion("MENU_NM_ICON between", value1, value2, "menuNmIcon");
            return (Criteria) this;
        }

        public Criteria andMenuNmIconNotBetween(String value1, String value2) {
            addCriterion("MENU_NM_ICON not between", value1, value2, "menuNmIcon");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_CMSADMENUINFO
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
     * This class corresponds to the database table TB_CMSADMENUINFO
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