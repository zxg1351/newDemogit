package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMUserNameIsNull() {
            addCriterion("m_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMUserNameIsNotNull() {
            addCriterion("m_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMUserNameEqualTo(String value) {
            addCriterion("m_user_name =", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameNotEqualTo(String value) {
            addCriterion("m_user_name <>", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameGreaterThan(String value) {
            addCriterion("m_user_name >", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_user_name >=", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameLessThan(String value) {
            addCriterion("m_user_name <", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameLessThanOrEqualTo(String value) {
            addCriterion("m_user_name <=", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameLike(String value) {
            addCriterion("m_user_name like", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameNotLike(String value) {
            addCriterion("m_user_name not like", value, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameIn(List<String> values) {
            addCriterion("m_user_name in", values, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameNotIn(List<String> values) {
            addCriterion("m_user_name not in", values, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameBetween(String value1, String value2) {
            addCriterion("m_user_name between", value1, value2, "mUserName");
            return (Criteria) this;
        }

        public Criteria andMUserNameNotBetween(String value1, String value2) {
            addCriterion("m_user_name not between", value1, value2, "mUserName");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNull() {
            addCriterion("wx_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNotNull() {
            addCriterion("wx_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdEqualTo(String value) {
            addCriterion("wx_open_id =", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotEqualTo(String value) {
            addCriterion("wx_open_id <>", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThan(String value) {
            addCriterion("wx_open_id >", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wx_open_id >=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThan(String value) {
            addCriterion("wx_open_id <", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("wx_open_id <=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLike(String value) {
            addCriterion("wx_open_id like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotLike(String value) {
            addCriterion("wx_open_id not like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIn(List<String> values) {
            addCriterion("wx_open_id in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotIn(List<String> values) {
            addCriterion("wx_open_id not in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdBetween(String value1, String value2) {
            addCriterion("wx_open_id between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("wx_open_id not between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdIsNull() {
            addCriterion("wb_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdIsNotNull() {
            addCriterion("wb_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdEqualTo(String value) {
            addCriterion("wb_open_id =", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdNotEqualTo(String value) {
            addCriterion("wb_open_id <>", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdGreaterThan(String value) {
            addCriterion("wb_open_id >", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wb_open_id >=", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdLessThan(String value) {
            addCriterion("wb_open_id <", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdLessThanOrEqualTo(String value) {
            addCriterion("wb_open_id <=", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdLike(String value) {
            addCriterion("wb_open_id like", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdNotLike(String value) {
            addCriterion("wb_open_id not like", value, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdIn(List<String> values) {
            addCriterion("wb_open_id in", values, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdNotIn(List<String> values) {
            addCriterion("wb_open_id not in", values, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdBetween(String value1, String value2) {
            addCriterion("wb_open_id between", value1, value2, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andWbOpenIdNotBetween(String value1, String value2) {
            addCriterion("wb_open_id not between", value1, value2, "wbOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIsNull() {
            addCriterion("qq_open_id is null");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIsNotNull() {
            addCriterion("qq_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdEqualTo(String value) {
            addCriterion("qq_open_id =", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotEqualTo(String value) {
            addCriterion("qq_open_id <>", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdGreaterThan(String value) {
            addCriterion("qq_open_id >", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("qq_open_id >=", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLessThan(String value) {
            addCriterion("qq_open_id <", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLessThanOrEqualTo(String value) {
            addCriterion("qq_open_id <=", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdLike(String value) {
            addCriterion("qq_open_id like", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotLike(String value) {
            addCriterion("qq_open_id not like", value, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdIn(List<String> values) {
            addCriterion("qq_open_id in", values, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotIn(List<String> values) {
            addCriterion("qq_open_id not in", values, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdBetween(String value1, String value2) {
            addCriterion("qq_open_id between", value1, value2, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andQqOpenIdNotBetween(String value1, String value2) {
            addCriterion("qq_open_id not between", value1, value2, "qqOpenId");
            return (Criteria) this;
        }

        public Criteria andMUserTelIsNull() {
            addCriterion("m_user_tel is null");
            return (Criteria) this;
        }

        public Criteria andMUserTelIsNotNull() {
            addCriterion("m_user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMUserTelEqualTo(String value) {
            addCriterion("m_user_tel =", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelNotEqualTo(String value) {
            addCriterion("m_user_tel <>", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelGreaterThan(String value) {
            addCriterion("m_user_tel >", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("m_user_tel >=", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelLessThan(String value) {
            addCriterion("m_user_tel <", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelLessThanOrEqualTo(String value) {
            addCriterion("m_user_tel <=", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelLike(String value) {
            addCriterion("m_user_tel like", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelNotLike(String value) {
            addCriterion("m_user_tel not like", value, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelIn(List<String> values) {
            addCriterion("m_user_tel in", values, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelNotIn(List<String> values) {
            addCriterion("m_user_tel not in", values, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelBetween(String value1, String value2) {
            addCriterion("m_user_tel between", value1, value2, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserTelNotBetween(String value1, String value2) {
            addCriterion("m_user_tel not between", value1, value2, "mUserTel");
            return (Criteria) this;
        }

        public Criteria andMUserAccountIsNull() {
            addCriterion("m_user_account is null");
            return (Criteria) this;
        }

        public Criteria andMUserAccountIsNotNull() {
            addCriterion("m_user_account is not null");
            return (Criteria) this;
        }

        public Criteria andMUserAccountEqualTo(String value) {
            addCriterion("m_user_account =", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountNotEqualTo(String value) {
            addCriterion("m_user_account <>", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountGreaterThan(String value) {
            addCriterion("m_user_account >", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("m_user_account >=", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountLessThan(String value) {
            addCriterion("m_user_account <", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountLessThanOrEqualTo(String value) {
            addCriterion("m_user_account <=", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountLike(String value) {
            addCriterion("m_user_account like", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountNotLike(String value) {
            addCriterion("m_user_account not like", value, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountIn(List<String> values) {
            addCriterion("m_user_account in", values, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountNotIn(List<String> values) {
            addCriterion("m_user_account not in", values, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountBetween(String value1, String value2) {
            addCriterion("m_user_account between", value1, value2, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserAccountNotBetween(String value1, String value2) {
            addCriterion("m_user_account not between", value1, value2, "mUserAccount");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordIsNull() {
            addCriterion("m_user_password is null");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordIsNotNull() {
            addCriterion("m_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordEqualTo(String value) {
            addCriterion("m_user_password =", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordNotEqualTo(String value) {
            addCriterion("m_user_password <>", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordGreaterThan(String value) {
            addCriterion("m_user_password >", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("m_user_password >=", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordLessThan(String value) {
            addCriterion("m_user_password <", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("m_user_password <=", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordLike(String value) {
            addCriterion("m_user_password like", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordNotLike(String value) {
            addCriterion("m_user_password not like", value, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordIn(List<String> values) {
            addCriterion("m_user_password in", values, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordNotIn(List<String> values) {
            addCriterion("m_user_password not in", values, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordBetween(String value1, String value2) {
            addCriterion("m_user_password between", value1, value2, "mUserPassword");
            return (Criteria) this;
        }

        public Criteria andMUserPasswordNotBetween(String value1, String value2) {
            addCriterion("m_user_password not between", value1, value2, "mUserPassword");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlIsNull() {
            addCriterion("m_user_imageUrl is null");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlIsNotNull() {
            addCriterion("m_user_imageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlEqualTo(String value) {
            addCriterion("m_user_imageUrl =", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlNotEqualTo(String value) {
            addCriterion("m_user_imageUrl <>", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlGreaterThan(String value) {
            addCriterion("m_user_imageUrl >", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("m_user_imageUrl >=", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlLessThan(String value) {
            addCriterion("m_user_imageUrl <", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlLessThanOrEqualTo(String value) {
            addCriterion("m_user_imageUrl <=", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlLike(String value) {
            addCriterion("m_user_imageUrl like", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlNotLike(String value) {
            addCriterion("m_user_imageUrl not like", value, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlIn(List<String> values) {
            addCriterion("m_user_imageUrl in", values, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlNotIn(List<String> values) {
            addCriterion("m_user_imageUrl not in", values, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlBetween(String value1, String value2) {
            addCriterion("m_user_imageUrl between", value1, value2, "mUserImageurl");
            return (Criteria) this;
        }

        public Criteria andMUserImageurlNotBetween(String value1, String value2) {
            addCriterion("m_user_imageUrl not between", value1, value2, "mUserImageurl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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