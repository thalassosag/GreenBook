package com.green.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
    /**
     * sqlsessionfactory 工厂类变量只要拥有一个即可。
     */
    private static final Class<SqlSessionFactory> LOCK = SqlSessionFactory.class;
    static SqlSessionFactory sqlSessionFactory = null;
    public static void initFactory(){
        if (null == sqlSessionFactory){
            createFactory();
        }
    }

    public static void createFactory(){

        synchronized (LOCK){
            if (null != sqlSessionFactory) {
                return;
            }
            String path = "mybatis-config.xml";
            InputStream is = null;

            try {
                is = Resources.getResourceAsStream(path);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static SqlSession getSqlsession(){
        initFactory();
        return sqlSessionFactory.openSession();
    }
}
