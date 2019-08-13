package com.green;

import com.green.mapper.UserMapper;
import com.green.pojo.User;
import com.green.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

public class main {
    public static void main(String[] args) {

        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlsession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.selectByPrimaryKey(1);
            System.out.println(user);

        }catch (Exception e){

        }finally {
            if (sqlSession!=null)
                sqlSession.close();
        }


    }
}
