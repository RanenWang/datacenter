/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author wangpeng17355
 * @version $Id: DataBaseUtil, v0.1 2018年11月17日 2:55 PM wangpeng17355 Exp $
 */
public class DataBaseUtil {

    public static SqlSession getSqlSession(Properties properties) throws IOException {
        // 通过配置文件获取数据库连接信息
        InputStream stream = Resources.getResourceAsStream("META-INF/Configuration.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream,
                properties);
        // 通过sqlSessionFactory打开一个数据库会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
//
}