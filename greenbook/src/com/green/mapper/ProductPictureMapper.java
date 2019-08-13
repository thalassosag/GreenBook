package com.green.mapper;

import com.green.pojo.ProductPicture;
import com.green.pojo.ProductPictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductPictureMapper {
    int countByExample(ProductPictureExample example);

    int deleteByExample(ProductPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductPicture record);

    int insertSelective(ProductPicture record);

    List<ProductPicture> selectByExample(ProductPictureExample example);

    ProductPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    int updateByExample(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    int updateByPrimaryKeySelective(ProductPicture record);

    int updateByPrimaryKey(ProductPicture record);
}