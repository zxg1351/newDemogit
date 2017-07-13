package com.example.demo.mapper;

import com.example.demo.bean.MBanner;
import com.example.demo.bean.MBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    int countByExample(MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    int deleteByExample(MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    int insert(MBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    int insertSelective(MBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    List<MBanner> selectByExample(MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    int updateByExampleSelective(@Param("record") MBanner record, @Param("example") MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Thu Jul 13 10:33:24 CST 2017
     */
    int updateByExample(@Param("record") MBanner record, @Param("example") MBannerExample example);
}