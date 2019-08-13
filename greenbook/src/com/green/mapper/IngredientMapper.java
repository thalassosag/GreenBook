package com.green.mapper;

import com.green.pojo.Ingredient;
import com.green.pojo.IngredientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IngredientMapper {
    int countByExample(IngredientExample example);

    int deleteByExample(IngredientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ingredient record);

    int insertSelective(Ingredient record);

    List<Ingredient> selectByExample(IngredientExample example);

    Ingredient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ingredient record, @Param("example") IngredientExample example);

    int updateByExample(@Param("record") Ingredient record, @Param("example") IngredientExample example);

    int updateByPrimaryKeySelective(Ingredient record);

    int updateByPrimaryKey(Ingredient record);
}