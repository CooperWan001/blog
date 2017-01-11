package cn.cooper.blog.dao;

import cn.cooper.blog.entity.OptionsEntity;
import cn.cooper.blog.entity.OptionsEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionsEntityMapper {
    int countByExample(OptionsEntityExample example);

    int deleteByExample(OptionsEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(OptionsEntity record);

    int insertSelective(OptionsEntity record);

    List<OptionsEntity> selectByExample(OptionsEntityExample example);

    OptionsEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OptionsEntity record, @Param("example") OptionsEntityExample example);

    int updateByExample(@Param("record") OptionsEntity record, @Param("example") OptionsEntityExample example);

    int updateByPrimaryKeySelective(OptionsEntity record);

    int updateByPrimaryKey(OptionsEntity record);
}