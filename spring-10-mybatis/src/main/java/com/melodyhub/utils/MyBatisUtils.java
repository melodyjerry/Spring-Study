package com.melodyhub.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    String resource = "mybatis-config.xml";
//    Resources.getResourceAsStream(resource);
}
