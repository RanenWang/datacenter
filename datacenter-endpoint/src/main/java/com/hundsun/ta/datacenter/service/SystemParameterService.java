
package com.hundsun.ta.datacenter.service;

import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;

import java.util.List;

/**
 * @author wangpeng17355
 * @version $Id: SystemParameterService, v0.1 2018年11月15日 5:26 PM wangpeng17355 Exp $
 */
public interface SystemParameterService {

    SystemParameterDO selectByPrimaryKey(int id);

    /**
     * 更新系统参数
     * @param systemParameterDO
     * @return
     */
    int updateByClassAndItem(SystemParameterDO systemParameterDO);

    /**
     * 根据class和item筛选数据
     * @param systemParameterDO
     * @return
     */
    List<SystemParameterDO> selectByClassAndItem(SystemParameterDO systemParameterDO);

    /**
     * 获取nav文件路径
     * @param path
     * @param name
     * @param date
     * @return
     */
    String getNavPath(String path,String name,String date);
    /**
     * 获取navRest文件路径
     * @param path
     * @param name
     * @param date
     * @return
     */
    String getNavRestPath(String path,String name,String date);

    /**
     * 获取系统拆分参数
     * @return
     */
    String getSplitType();

}