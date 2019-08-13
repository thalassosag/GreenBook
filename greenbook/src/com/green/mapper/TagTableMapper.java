package com.green.mapper;

import com.green.pojo.TagTable;
import com.green.pojo.TagTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagTableMapper {
    int countByExample(TagTableExample example);

    int deleteByExample(TagTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagTable record);

    int insertSelective(TagTable record);

    List<TagTable> selectByExample(TagTableExample example);

    TagTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagTable record, @Param("example") TagTableExample example);

    int updateByExample(@Param("record") TagTable record, @Param("example") TagTableExample example);

    int updateByPrimaryKeySelective(TagTable record);

    int updateByPrimaryKey(TagTable record);
}