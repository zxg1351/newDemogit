package com.example.demo.bean;

import java.io.Serializable;

public class MArea implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_area.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_area.m_area_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String mAreaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_area.m_area_name
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private String mAreaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_area.m_city_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private Integer mCityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_area
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_area.id
     *
     * @return the value of m_area.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_area.id
     *
     * @param id the value for m_area.id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_area.m_area_id
     *
     * @return the value of m_area.m_area_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getmAreaId() {
        return mAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_area.m_area_id
     *
     * @param mAreaId the value for m_area.m_area_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setmAreaId(String mAreaId) {
        this.mAreaId = mAreaId == null ? null : mAreaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_area.m_area_name
     *
     * @return the value of m_area.m_area_name
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public String getmAreaName() {
        return mAreaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_area.m_area_name
     *
     * @param mAreaName the value for m_area.m_area_name
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setmAreaName(String mAreaName) {
        this.mAreaName = mAreaName == null ? null : mAreaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_area.m_city_id
     *
     * @return the value of m_area.m_city_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public Integer getmCityId() {
        return mCityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_area.m_city_id
     *
     * @param mCityId the value for m_area.m_city_id
     *
     * @mbggenerated Mon Jul 31 09:02:20 CST 2017
     */
    public void setmCityId(Integer mCityId) {
        this.mCityId = mCityId;
    }
}