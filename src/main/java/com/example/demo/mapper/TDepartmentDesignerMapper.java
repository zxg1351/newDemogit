package com.example.demo.mapper;

import com.example.demo.bean.TDepartmentDesigner;
import com.example.demo.bean.TDepartmentDesignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDepartmentDesignerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int countByExample(TDepartmentDesignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int deleteByExample(TDepartmentDesignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int insert(TDepartmentDesigner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int insertSelective(TDepartmentDesigner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    List<TDepartmentDesigner> selectByExample(TDepartmentDesignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int updateByExampleSelective(@Param("record") TDepartmentDesigner record, @Param("example") TDepartmentDesignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department_designer
     *
     * @mbggenerated Tue Aug 01 08:44:54 CST 2017
     */
    int updateByExample(@Param("record") TDepartmentDesigner record, @Param("example") TDepartmentDesignerExample example);
}