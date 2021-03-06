package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MBannerExample() {
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

        public Criteria andMBannerNameIsNull() {
            addCriterion("m_banner_name is null");
            return (Criteria) this;
        }

        public Criteria andMBannerNameIsNotNull() {
            addCriterion("m_banner_name is not null");
            return (Criteria) this;
        }

        public Criteria andMBannerNameEqualTo(String value) {
            addCriterion("m_banner_name =", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameNotEqualTo(String value) {
            addCriterion("m_banner_name <>", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameGreaterThan(String value) {
            addCriterion("m_banner_name >", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_banner_name >=", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameLessThan(String value) {
            addCriterion("m_banner_name <", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameLessThanOrEqualTo(String value) {
            addCriterion("m_banner_name <=", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameLike(String value) {
            addCriterion("m_banner_name like", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameNotLike(String value) {
            addCriterion("m_banner_name not like", value, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameIn(List<String> values) {
            addCriterion("m_banner_name in", values, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameNotIn(List<String> values) {
            addCriterion("m_banner_name not in", values, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameBetween(String value1, String value2) {
            addCriterion("m_banner_name between", value1, value2, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerNameNotBetween(String value1, String value2) {
            addCriterion("m_banner_name not between", value1, value2, "mBannerName");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlIsNull() {
            addCriterion("m_banner_url is null");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlIsNotNull() {
            addCriterion("m_banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlEqualTo(String value) {
            addCriterion("m_banner_url =", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlNotEqualTo(String value) {
            addCriterion("m_banner_url <>", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlGreaterThan(String value) {
            addCriterion("m_banner_url >", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("m_banner_url >=", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlLessThan(String value) {
            addCriterion("m_banner_url <", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("m_banner_url <=", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlLike(String value) {
            addCriterion("m_banner_url like", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlNotLike(String value) {
            addCriterion("m_banner_url not like", value, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlIn(List<String> values) {
            addCriterion("m_banner_url in", values, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlNotIn(List<String> values) {
            addCriterion("m_banner_url not in", values, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlBetween(String value1, String value2) {
            addCriterion("m_banner_url between", value1, value2, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerUrlNotBetween(String value1, String value2) {
            addCriterion("m_banner_url not between", value1, value2, "mBannerUrl");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeIsNull() {
            addCriterion("m_banner_type is null");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeIsNotNull() {
            addCriterion("m_banner_type is not null");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeEqualTo(String value) {
            addCriterion("m_banner_type =", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeNotEqualTo(String value) {
            addCriterion("m_banner_type <>", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeGreaterThan(String value) {
            addCriterion("m_banner_type >", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("m_banner_type >=", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeLessThan(String value) {
            addCriterion("m_banner_type <", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeLessThanOrEqualTo(String value) {
            addCriterion("m_banner_type <=", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeLike(String value) {
            addCriterion("m_banner_type like", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeNotLike(String value) {
            addCriterion("m_banner_type not like", value, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeIn(List<String> values) {
            addCriterion("m_banner_type in", values, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeNotIn(List<String> values) {
            addCriterion("m_banner_type not in", values, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeBetween(String value1, String value2) {
            addCriterion("m_banner_type between", value1, value2, "mBannerType");
            return (Criteria) this;
        }

        public Criteria andMBannerTypeNotBetween(String value1, String value2) {
            addCriterion("m_banner_type not between", value1, value2, "mBannerType");
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