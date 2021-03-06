package cn.cooper.blog.dao;

import cn.cooper.blog.entity.TagEntity;
import cn.cooper.blog.entity.TagEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagEntityMapper {
    int countByExample(TagEntityExample example);

    int deleteByExample(TagEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TagEntity record);

    int insertSelective(TagEntity record);

    List<TagEntity> selectByExample(TagEntityExample example);

    TagEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TagEntity record, @Param("example") TagEntityExample example);

    int updateByExample(@Param("record") TagEntity record, @Param("example") TagEntityExample example);

    int updateByPrimaryKeySelective(TagEntity record);

    int updateByPrimaryKey(TagEntity record);
}