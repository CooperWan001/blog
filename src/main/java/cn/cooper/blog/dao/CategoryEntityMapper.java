package cn.cooper.blog.dao;

import cn.cooper.blog.entity.CategoryEntity;
import cn.cooper.blog.entity.CategoryEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryEntityMapper {
    int countByExample(CategoryEntityExample example);

    int deleteByExample(CategoryEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(CategoryEntity record);

    int insertSelective(CategoryEntity record);

    List<CategoryEntity> selectByExample(CategoryEntityExample example);

    CategoryEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CategoryEntity record, @Param("example") CategoryEntityExample example);

    int updateByExample(@Param("record") CategoryEntity record, @Param("example") CategoryEntityExample example);

    int updateByPrimaryKeySelective(CategoryEntity record);

    int updateByPrimaryKey(CategoryEntity record);
}