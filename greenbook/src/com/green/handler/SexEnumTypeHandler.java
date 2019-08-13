package com.green.handler;

import com.green.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 类型转换器
 * T 目标泛型
 * 0:女 1:男
 *
 */
public class SexEnumTypeHandler implements TypeHandler<SexEnum> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int columnIndex, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        //插入数据时，要为性别占位符？

        preparedStatement.setInt(columnIndex,sexEnum.getId());

    }

    @Override
    public SexEnum getResult(ResultSet resultSet, String s) throws SQLException {
        //查询的时候，resultSet是返回的结果集，s是那个列名
        //表中是sex此处就是sex
        int value = resultSet.getInt(s);

        return SexEnum.getSexById(value);
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, int i) throws SQLException {
        //i是索引
        int value = resultSet.getInt(i);

        return SexEnum.getSexById(value);
    }

    @Override
    public SexEnum getResult(CallableStatement callableStatement, int i) throws SQLException {

        //获取存储过程返回的值 i 进行转换
        return null;
    }
}
