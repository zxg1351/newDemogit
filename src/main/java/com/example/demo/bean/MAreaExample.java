package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class MAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MAreaExample() {
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

        public Criteria andMAreaIdIsNull() {
            addCriterion("m_area_id is null");
            return (Criteria) this;
        }

        public Criteria andMAreaIdIsNotNull() {
            addCriterion("m_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andMAreaIdEqualTo(String value) {
            addCriterion("m_area_id =", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdNotEqualTo(String value) {
            addCriterion("m_area_id <>", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdGreaterThan(String value) {
            addCriterion("m_area_id >", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("m_area_id >=", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdLessThan(String value) {
            addCriterion("m_area_id <", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdLessThanOrEqualTo(String value) {
            addCriterion("m_area_id <=", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdLike(String value) {
            addCriterion("m_area_id like", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdNotLike(String value) {
            addCriterion("m_area_id not like", value, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdIn(List<String> values) {
            addCriterion("m_area_id in", values, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdNotIn(List<String> values) {
            addCriterion("m_area_id not in", values, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdBetween(String value1, String value2) {
            addCriterion("m_area_id between", value1, value2, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaIdNotBetween(String value1, String value2) {
            addCriterion("m_area_id not between", value1, value2, "mAreaId");
            return (Criteria) this;
        }

        public Criteria andMAreaNameIsNull() {
            addCriterion("m_area_name is null");
            return (Criteria) this;
        }

        public Criteria andMAreaNameIsNotNull() {
            addCriterion("m_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andMAreaNameEqualTo(String value) {
            addCriterion("m_area_name =", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameNotEqualTo(String value) {
            addCriterion("m_area_name <>", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameGreaterThan(String value) {
            addCriterion("m_area_name >", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_area_name >=", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameLessThan(String value) {
            addCriterion("m_area_name <", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameLessThanOrEqualTo(String value) {
            addCriterion("m_area_name <=", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameLike(String value) {
            addCriterion("m_area_name like", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameNotLike(String value) {
            addCriterion("m_area_name not like", value, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameIn(List<String> values) {
            addCriterion("m_area_name in", values, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameNotIn(List<String> values) {
            addCriterion("m_area_name not in", values, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameBetween(String value1, String value2) {
            addCriterion("m_area_name between", value1, value2, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMAreaNameNotBetween(String value1, String value2) {
            addCriterion("m_area_name not between", value1, value2, "mAreaName");
            return (Criteria) this;
        }

        public Criteria andMCityIdIsNull() {
            addCriterion("m_city_id is null");
            return (Criteria) this;
        }

        public Criteria andMCityIdIsNotNull() {
            addCriterion("m_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andMCityIdEqualTo(Integer value) {
            addCriterion("m_city_id =", value, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdNotEqualTo(Integer value) {
            addCriterion("m_city_id <>", value, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdGreaterThan(Integer value) {
            addCriterion("m_city_id >", value, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_city_id >=", value, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdLessThan(Integer value) {
            addCriterion("m_city_id <", value, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_city_id <=", value, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdIn(List<Integer> values) {
            addCriterion("m_city_id in", values, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdNotIn(List<Integer> values) {
            addCriterion("m_city_id not in", values, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdBetween(Integer value1, Integer value2) {
            addCriterion("m_city_id between", value1, value2, "mCityId");
            return (Criteria) this;
        }

        public Criteria andMCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_city_id not between", value1, value2, "mCityId");
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