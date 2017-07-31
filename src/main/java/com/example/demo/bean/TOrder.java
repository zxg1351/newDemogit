package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class TOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.t_order_number
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String tOrderNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.m_client_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer mClientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_source
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer orderSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_designer
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer orderDesigner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_assistant
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer orderAssistant;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_manager
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer orderManager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.create_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.create_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.update_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.update_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.del_flag
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_total_money
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String orderTotalMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_budget_money
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String orderBudgetMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_type
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String orderType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_supervision
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String orderSupervision;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_furniture_des
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String orderFurnitureDes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.t_order_number
     *
     * @return the value of t_order.t_order_number
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String gettOrderNumber() {
        return tOrderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.t_order_number
     *
     * @param tOrderNumber the value for t_order.t_order_number
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void settOrderNumber(String tOrderNumber) {
        this.tOrderNumber = tOrderNumber == null ? null : tOrderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.m_client_id
     *
     * @return the value of t_order.m_client_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getmClientId() {
        return mClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.m_client_id
     *
     * @param mClientId the value for t_order.m_client_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setmClientId(Integer mClientId) {
        this.mClientId = mClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_source
     *
     * @return the value of t_order.order_source
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getOrderSource() {
        return orderSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_source
     *
     * @param orderSource the value for t_order.order_source
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_designer
     *
     * @return the value of t_order.order_designer
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getOrderDesigner() {
        return orderDesigner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_designer
     *
     * @param orderDesigner the value for t_order.order_designer
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderDesigner(Integer orderDesigner) {
        this.orderDesigner = orderDesigner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_assistant
     *
     * @return the value of t_order.order_assistant
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getOrderAssistant() {
        return orderAssistant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_assistant
     *
     * @param orderAssistant the value for t_order.order_assistant
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderAssistant(Integer orderAssistant) {
        this.orderAssistant = orderAssistant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_manager
     *
     * @return the value of t_order.order_manager
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getOrderManager() {
        return orderManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_manager
     *
     * @param orderManager the value for t_order.order_manager
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderManager(Integer orderManager) {
        this.orderManager = orderManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.create_time
     *
     * @return the value of t_order.create_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.create_time
     *
     * @param createTime the value for t_order.create_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.create_user
     *
     * @return the value of t_order.create_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.create_user
     *
     * @param createUser the value for t_order.create_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.update_time
     *
     * @return the value of t_order.update_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.update_time
     *
     * @param updateTime the value for t_order.update_time
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.update_user
     *
     * @return the value of t_order.update_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.update_user
     *
     * @param updateUser the value for t_order.update_user
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.del_flag
     *
     * @return the value of t_order.del_flag
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.del_flag
     *
     * @param delFlag the value for t_order.del_flag
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_total_money
     *
     * @return the value of t_order.order_total_money
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getOrderTotalMoney() {
        return orderTotalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_total_money
     *
     * @param orderTotalMoney the value for t_order.order_total_money
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderTotalMoney(String orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney == null ? null : orderTotalMoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_budget_money
     *
     * @return the value of t_order.order_budget_money
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getOrderBudgetMoney() {
        return orderBudgetMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_budget_money
     *
     * @param orderBudgetMoney the value for t_order.order_budget_money
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderBudgetMoney(String orderBudgetMoney) {
        this.orderBudgetMoney = orderBudgetMoney == null ? null : orderBudgetMoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_type
     *
     * @return the value of t_order.order_type
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_type
     *
     * @param orderType the value for t_order.order_type
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_supervision
     *
     * @return the value of t_order.order_supervision
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getOrderSupervision() {
        return orderSupervision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_supervision
     *
     * @param orderSupervision the value for t_order.order_supervision
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderSupervision(String orderSupervision) {
        this.orderSupervision = orderSupervision == null ? null : orderSupervision.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_furniture_des
     *
     * @return the value of t_order.order_furniture_des
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getOrderFurnitureDes() {
        return orderFurnitureDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_furniture_des
     *
     * @param orderFurnitureDes the value for t_order.order_furniture_des
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setOrderFurnitureDes(String orderFurnitureDes) {
        this.orderFurnitureDes = orderFurnitureDes == null ? null : orderFurnitureDes.trim();
    }
}