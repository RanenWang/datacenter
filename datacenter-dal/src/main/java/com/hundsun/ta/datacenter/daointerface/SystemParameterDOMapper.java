package com.hundsun.ta.datacenter.daointerface;

import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;

public interface SystemParameterDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_parameter
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_parameter
     *
     * @mbggenerated
     */
    int insert(SystemParameterDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_parameter
     *
     * @mbggenerated
     */
    int insertSelective(SystemParameterDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_parameter
     *
     * @mbggenerated
     */
    SystemParameterDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_parameter
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemParameterDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_parameter
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemParameterDO record);
}