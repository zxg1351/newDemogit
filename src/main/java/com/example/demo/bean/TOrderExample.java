package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andTOrderNumberIsNull() {
            addCriterion("t_order_number is null");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberIsNotNull() {
            addCriterion("t_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberEqualTo(String value) {
            addCriterion("t_order_number =", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberNotEqualTo(String value) {
            addCriterion("t_order_number <>", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberGreaterThan(String value) {
            addCriterion("t_order_number >", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("t_order_number >=", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberLessThan(String value) {
            addCriterion("t_order_number <", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("t_order_number <=", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberLike(String value) {
            addCriterion("t_order_number like", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberNotLike(String value) {
            addCriterion("t_order_number not like", value, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberIn(List<String> values) {
            addCriterion("t_order_number in", values, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberNotIn(List<String> values) {
            addCriterion("t_order_number not in", values, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberBetween(String value1, String value2) {
            addCriterion("t_order_number between", value1, value2, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andTOrderNumberNotBetween(String value1, String value2) {
            addCriterion("t_order_number not between", value1, value2, "tOrderNumber");
            return (Criteria) this;
        }

        public Criteria andMClientIdIsNull() {
            addCriterion("m_client_id is null");
            return (Criteria) this;
        }

        public Criteria andMClientIdIsNotNull() {
            addCriterion("m_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andMClientIdEqualTo(Integer value) {
            addCriterion("m_client_id =", value, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdNotEqualTo(Integer value) {
            addCriterion("m_client_id <>", value, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdGreaterThan(Integer value) {
            addCriterion("m_client_id >", value, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_client_id >=", value, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdLessThan(Integer value) {
            addCriterion("m_client_id <", value, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_client_id <=", value, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdIn(List<Integer> values) {
            addCriterion("m_client_id in", values, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdNotIn(List<Integer> values) {
            addCriterion("m_client_id not in", values, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdBetween(Integer value1, Integer value2) {
            addCriterion("m_client_id between", value1, value2, "mClientId");
            return (Criteria) this;
        }

        public Criteria andMClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_client_id not between", value1, value2, "mClientId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Integer value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Integer value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Integer value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Integer value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Integer value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Integer> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Integer> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Integer value1, Integer value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerIsNull() {
            addCriterion("order_designer is null");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerIsNotNull() {
            addCriterion("order_designer is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerEqualTo(Integer value) {
            addCriterion("order_designer =", value, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerNotEqualTo(Integer value) {
            addCriterion("order_designer <>", value, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerGreaterThan(Integer value) {
            addCriterion("order_designer >", value, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_designer >=", value, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerLessThan(Integer value) {
            addCriterion("order_designer <", value, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerLessThanOrEqualTo(Integer value) {
            addCriterion("order_designer <=", value, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerIn(List<Integer> values) {
            addCriterion("order_designer in", values, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerNotIn(List<Integer> values) {
            addCriterion("order_designer not in", values, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerBetween(Integer value1, Integer value2) {
            addCriterion("order_designer between", value1, value2, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderDesignerNotBetween(Integer value1, Integer value2) {
            addCriterion("order_designer not between", value1, value2, "orderDesigner");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantIsNull() {
            addCriterion("order_assistant is null");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantIsNotNull() {
            addCriterion("order_assistant is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantEqualTo(Integer value) {
            addCriterion("order_assistant =", value, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantNotEqualTo(Integer value) {
            addCriterion("order_assistant <>", value, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantGreaterThan(Integer value) {
            addCriterion("order_assistant >", value, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_assistant >=", value, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantLessThan(Integer value) {
            addCriterion("order_assistant <", value, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantLessThanOrEqualTo(Integer value) {
            addCriterion("order_assistant <=", value, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantIn(List<Integer> values) {
            addCriterion("order_assistant in", values, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantNotIn(List<Integer> values) {
            addCriterion("order_assistant not in", values, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantBetween(Integer value1, Integer value2) {
            addCriterion("order_assistant between", value1, value2, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderAssistantNotBetween(Integer value1, Integer value2) {
            addCriterion("order_assistant not between", value1, value2, "orderAssistant");
            return (Criteria) this;
        }

        public Criteria andOrderManagerIsNull() {
            addCriterion("order_manager is null");
            return (Criteria) this;
        }

        public Criteria andOrderManagerIsNotNull() {
            addCriterion("order_manager is not null");
            return (Criteria) this;
        }

        public Criteria andOrderManagerEqualTo(Integer value) {
            addCriterion("order_manager =", value, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerNotEqualTo(Integer value) {
            addCriterion("order_manager <>", value, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerGreaterThan(Integer value) {
            addCriterion("order_manager >", value, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_manager >=", value, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerLessThan(Integer value) {
            addCriterion("order_manager <", value, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerLessThanOrEqualTo(Integer value) {
            addCriterion("order_manager <=", value, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerIn(List<Integer> values) {
            addCriterion("order_manager in", values, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerNotIn(List<Integer> values) {
            addCriterion("order_manager not in", values, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerBetween(Integer value1, Integer value2) {
            addCriterion("order_manager between", value1, value2, "orderManager");
            return (Criteria) this;
        }

        public Criteria andOrderManagerNotBetween(Integer value1, Integer value2) {
            addCriterion("order_manager not between", value1, value2, "orderManager");
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

        public Criteria andOrderTotalMoneyIsNull() {
            addCriterion("order_total_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyIsNotNull() {
            addCriterion("order_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyEqualTo(String value) {
            addCriterion("order_total_money =", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyNotEqualTo(String value) {
            addCriterion("order_total_money <>", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyGreaterThan(String value) {
            addCriterion("order_total_money >", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("order_total_money >=", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyLessThan(String value) {
            addCriterion("order_total_money <", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyLessThanOrEqualTo(String value) {
            addCriterion("order_total_money <=", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyLike(String value) {
            addCriterion("order_total_money like", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyNotLike(String value) {
            addCriterion("order_total_money not like", value, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyIn(List<String> values) {
            addCriterion("order_total_money in", values, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyNotIn(List<String> values) {
            addCriterion("order_total_money not in", values, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyBetween(String value1, String value2) {
            addCriterion("order_total_money between", value1, value2, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTotalMoneyNotBetween(String value1, String value2) {
            addCriterion("order_total_money not between", value1, value2, "orderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyIsNull() {
            addCriterion("order_budget_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyIsNotNull() {
            addCriterion("order_budget_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyEqualTo(String value) {
            addCriterion("order_budget_money =", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyNotEqualTo(String value) {
            addCriterion("order_budget_money <>", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyGreaterThan(String value) {
            addCriterion("order_budget_money >", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("order_budget_money >=", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyLessThan(String value) {
            addCriterion("order_budget_money <", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyLessThanOrEqualTo(String value) {
            addCriterion("order_budget_money <=", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyLike(String value) {
            addCriterion("order_budget_money like", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyNotLike(String value) {
            addCriterion("order_budget_money not like", value, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyIn(List<String> values) {
            addCriterion("order_budget_money in", values, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyNotIn(List<String> values) {
            addCriterion("order_budget_money not in", values, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyBetween(String value1, String value2) {
            addCriterion("order_budget_money between", value1, value2, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderBudgetMoneyNotBetween(String value1, String value2) {
            addCriterion("order_budget_money not between", value1, value2, "orderBudgetMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionIsNull() {
            addCriterion("order_supervision is null");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionIsNotNull() {
            addCriterion("order_supervision is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionEqualTo(String value) {
            addCriterion("order_supervision =", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionNotEqualTo(String value) {
            addCriterion("order_supervision <>", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionGreaterThan(String value) {
            addCriterion("order_supervision >", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionGreaterThanOrEqualTo(String value) {
            addCriterion("order_supervision >=", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionLessThan(String value) {
            addCriterion("order_supervision <", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionLessThanOrEqualTo(String value) {
            addCriterion("order_supervision <=", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionLike(String value) {
            addCriterion("order_supervision like", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionNotLike(String value) {
            addCriterion("order_supervision not like", value, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionIn(List<String> values) {
            addCriterion("order_supervision in", values, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionNotIn(List<String> values) {
            addCriterion("order_supervision not in", values, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionBetween(String value1, String value2) {
            addCriterion("order_supervision between", value1, value2, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderSupervisionNotBetween(String value1, String value2) {
            addCriterion("order_supervision not between", value1, value2, "orderSupervision");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesIsNull() {
            addCriterion("order_furniture_des is null");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesIsNotNull() {
            addCriterion("order_furniture_des is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesEqualTo(String value) {
            addCriterion("order_furniture_des =", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesNotEqualTo(String value) {
            addCriterion("order_furniture_des <>", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesGreaterThan(String value) {
            addCriterion("order_furniture_des >", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesGreaterThanOrEqualTo(String value) {
            addCriterion("order_furniture_des >=", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesLessThan(String value) {
            addCriterion("order_furniture_des <", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesLessThanOrEqualTo(String value) {
            addCriterion("order_furniture_des <=", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesLike(String value) {
            addCriterion("order_furniture_des like", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesNotLike(String value) {
            addCriterion("order_furniture_des not like", value, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesIn(List<String> values) {
            addCriterion("order_furniture_des in", values, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesNotIn(List<String> values) {
            addCriterion("order_furniture_des not in", values, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesBetween(String value1, String value2) {
            addCriterion("order_furniture_des between", value1, value2, "orderFurnitureDes");
            return (Criteria) this;
        }

        public Criteria andOrderFurnitureDesNotBetween(String value1, String value2) {
            addCriterion("order_furniture_des not between", value1, value2, "orderFurnitureDes");
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