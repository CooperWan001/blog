package cn.cooper.blog.dao;

import cn.cooper.blog.entity.LinkEntity;
import cn.cooper.blog.entity.LinkEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkEntityMapper {
    int countByExample(LinkEntityExample example);

    int deleteByExample(LinkEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(LinkEntity record);

    int insertSelective(LinkEntity record);

    List<LinkEntity> selectByExample(LinkEntityExample example);

    LinkEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LinkEntity record, @Param("example") LinkEntityExample example);

    int updateByExample(@Param("record") LinkEntity record, @Param("example") LinkEntityExample example);

    int updateByPrimaryKeySelective(LinkEntity record);

    int updateByPrimaryKey(LinkEntity record);
}