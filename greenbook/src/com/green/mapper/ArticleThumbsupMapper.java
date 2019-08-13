package com.green.mapper;

import com.green.pojo.ArticleThumbsup;
import com.green.pojo.ArticleThumbsupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleThumbsupMapper {
    int countByExample(ArticleThumbsupExample example);

    int deleteByExample(ArticleThumbsupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleThumbsup record);

    int insertSelective(ArticleThumbsup record);

    List<ArticleThumbsup> selectByExample(ArticleThumbsupExample example);

    ArticleThumbsup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleThumbsup record, @Param("example") ArticleThumbsupExample example);

    int updateByExample(@Param("record") ArticleThumbsup record, @Param("example") ArticleThumbsupExample example);

    int updateByPrimaryKeySelective(ArticleThumbsup record);

    int updateByPrimaryKey(ArticleThumbsup record);
}