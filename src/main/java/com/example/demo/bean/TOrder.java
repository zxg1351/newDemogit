package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class TOrder implements Serializable {
    private Integer id;

    private String tOrderNumber;

    private Integer mClientId;

    private Integer orderSource;

    private Integer orderDesigner;

    private Integer orderAssistant;

    private Integer orderManager;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String delFlag;

    private String orderTotalMoney;

    private String orderBudgetMoney;

    private String orderType;

    private String orderSupervision;

    private String orderFurnitureDes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettOrderNumber() {
        return tOrderNumber;
    }

    public void settOrderNumber(String tOrderNumber) {
        this.tOrderNumber = tOrderNumber == null ? null : tOrderNumber.trim();
    }

    public Integer getmClientId() {
        return mClientId;
    }

    public void setmClientId(Integer mClientId) {
        this.mClientId = mClientId;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getOrderDesigner() {
        return orderDesigner;
    }

    public void setOrderDesigner(Integer orderDesigner) {
        this.orderDesigner = orderDesigner;
    }

    public Integer getOrderAssistant() {
        return orderAssistant;
    }

    public void setOrderAssistant(Integer orderAssistant) {
        this.orderAssistant = orderAssistant;
    }

    public Integer getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(Integer orderManager) {
        this.orderManager = orderManager;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getOrderTotalMoney() {
        return orderTotalMoney;
    }

    public void setOrderTotalMoney(String orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney == null ? null : orderTotalMoney.trim();
    }

    public String getOrderBudgetMoney() {
        return orderBudgetMoney;
    }

    public void setOrderBudgetMoney(String orderBudgetMoney) {
        this.orderBudgetMoney = orderBudgetMoney == null ? null : orderBudgetMoney.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderSupervision() {
        return orderSupervision;
    }

    public void setOrderSupervision(String orderSupervision) {
        this.orderSupervision = orderSupervision == null ? null : orderSupervision.trim();
    }

    public String getOrderFurnitureDes() {
        return orderFurnitureDes;
    }

    public void setOrderFurnitureDes(String orderFurnitureDes) {
        this.orderFurnitureDes = orderFurnitureDes == null ? null : orderFurnitureDes.trim();
    }
}