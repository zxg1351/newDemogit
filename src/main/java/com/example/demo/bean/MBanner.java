package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class MBanner implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.m_banner_name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String mBannerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.m_banner_url
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String mBannerUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.m_banner_type
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String mBannerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_banner.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_banner
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.id
     *
     * @return the value of m_banner.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.id
     *
     * @param id the value for m_banner.id
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.m_banner_name
     *
     * @return the value of m_banner.m_banner_name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getmBannerName() {
        return mBannerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.m_banner_name
     *
     * @param mBannerName the value for m_banner.m_banner_name
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setmBannerName(String mBannerName) {
        this.mBannerName = mBannerName == null ? null : mBannerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.m_banner_url
     *
     * @return the value of m_banner.m_banner_url
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getmBannerUrl() {
        return mBannerUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.m_banner_url
     *
     * @param mBannerUrl the value for m_banner.m_banner_url
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setmBannerUrl(String mBannerUrl) {
        this.mBannerUrl = mBannerUrl == null ? null : mBannerUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.m_banner_type
     *
     * @return the value of m_banner.m_banner_type
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getmBannerType() {
        return mBannerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.m_banner_type
     *
     * @param mBannerType the value for m_banner.m_banner_type
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setmBannerType(String mBannerType) {
        this.mBannerType = mBannerType == null ? null : mBannerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.create_time
     *
     * @return the value of m_banner.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.create_time
     *
     * @param createTime the value for m_banner.create_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.create_user
     *
     * @return the value of m_banner.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.create_user
     *
     * @param createUser the value for m_banner.create_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.update_time
     *
     * @return the value of m_banner.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.update_time
     *
     * @param updateTime the value for m_banner.update_time
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.update_user
     *
     * @return the value of m_banner.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.update_user
     *
     * @param updateUser the value for m_banner.update_user
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_banner.del_flag
     *
     * @return the value of m_banner.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_banner.del_flag
     *
     * @param delFlag the value for m_banner.del_flag
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}