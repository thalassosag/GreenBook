package com.green.mapper;

import com.green.pojo.ProductCategoryCascade;
import com.green.pojo.ProductCategoryCascadeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCategoryCascadeMapper {
    int countByExample(ProductCategoryCascadeExample example);

    int deleteByExample(ProductCategoryCascadeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCategoryCascade record);

    int insertSelective(ProductCategoryCascade record);

    List<ProductCategoryCascade> selectByExample(ProductCategoryCascadeExample example);

    ProductCategoryCascade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCategoryCascade record, @Param("example") ProductCategoryCascadeExample example);

    int updateByExample(@Param("record") ProductCategoryCascade record, @Param("example") ProductCategoryCascadeExample example);

    int updateByPrimaryKeySelective(ProductCategoryCascade record);

    int updateByPrimaryKey(ProductCategoryCascade record);
}