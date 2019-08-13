package com.green.mapper;

import com.green.pojo.ProductTag;
import com.green.pojo.ProductTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductTagMapper {
    int countByExample(ProductTagExample example);

    int deleteByExample(ProductTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductTag record);

    int insertSelective(ProductTag record);

    List<ProductTag> selectByExample(ProductTagExample example);

    ProductTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductTag record, @Param("example") ProductTagExample example);

    int updateByExample(@Param("record") ProductTag record, @Param("example") ProductTagExample example);

    int updateByPrimaryKeySelective(ProductTag record);

    int updateByPrimaryKey(ProductTag record);
}