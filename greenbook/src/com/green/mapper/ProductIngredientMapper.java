package com.green.mapper;

import com.green.pojo.ProductIngredient;
import com.green.pojo.ProductIngredientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductIngredientMapper {
    int countByExample(ProductIngredientExample example);

    int deleteByExample(ProductIngredientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductIngredient record);

    int insertSelective(ProductIngredient record);

    List<ProductIngredient> selectByExample(ProductIngredientExample example);

    ProductIngredient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductIngredient record, @Param("example") ProductIngredientExample example);

    int updateByExample(@Param("record") ProductIngredient record, @Param("example") ProductIngredientExample example);

    int updateByPrimaryKeySelective(ProductIngredient record);

    int updateByPrimaryKey(ProductIngredient record);
}