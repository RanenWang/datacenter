package com.hundsun.ta.datacenter.daointerface;

import com.hundsun.ta.datacenter.dataobject.DatabaseConfigDO;

import java.util.List;

public interface DatabaseConfigDOMapper {
    /**
     * 选择全部数据
     * @return
     */
    List<DatabaseConfigDO> selectAllData();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table database_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table database_config
     *
     * @mbggenerated
     */
    int insert(DatabaseConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table database_config
     *
     * @mbggenerated
     */
    int insertSelective(DatabaseConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table database_config
     *
     * @mbggenerated
     */
    DatabaseConfigDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table database_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DatabaseConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table database_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DatabaseConfigDO record);
}