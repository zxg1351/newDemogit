package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class MUserMenu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.m_user_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer mUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.m_menu_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer mMenuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_menu.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_user_menu
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.id
     *
     * @return the value of m_user_menu.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.id
     *
     * @param id the value for m_user_menu.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.m_user_id
     *
     * @return the value of m_user_menu.m_user_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getmUserId() {
        return mUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.m_user_id
     *
     * @param mUserId the value for m_user_menu.m_user_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setmUserId(Integer mUserId) {
        this.mUserId = mUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.m_menu_id
     *
     * @return the value of m_user_menu.m_menu_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getmMenuId() {
        return mMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.m_menu_id
     *
     * @param mMenuId the value for m_user_menu.m_menu_id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setmMenuId(Integer mMenuId) {
        this.mMenuId = mMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.create_user
     *
     * @return the value of m_user_menu.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.create_user
     *
     * @param createUser the value for m_user_menu.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.create_time
     *
     * @return the value of m_user_menu.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.create_time
     *
     * @param createTime the value for m_user_menu.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.update_time
     *
     * @return the value of m_user_menu.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.update_time
     *
     * @param updateTime the value for m_user_menu.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.update_user
     *
     * @return the value of m_user_menu.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.update_user
     *
     * @param updateUser the value for m_user_menu.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_menu.del_flag
     *
     * @return the value of m_user_menu.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_menu.del_flag
     *
     * @param delFlag the value for m_user_menu.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}