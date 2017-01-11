package cn.cooper.blog.dao;

import cn.cooper.blog.entity.PostEntity;
import cn.cooper.blog.entity.PostEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostEntityMapper {
    int countByExample(PostEntityExample example);

    int deleteByExample(PostEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(PostEntity record);

    int insertSelective(PostEntity record);

    List<PostEntity> selectByExampleWithBLOBs(PostEntityExample example);

    List<PostEntity> selectByExample(PostEntityExample example);

    PostEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PostEntity record, @Param("example") PostEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") PostEntity record, @Param("example") PostEntityExample example);

    int updateByExample(@Param("record") PostEntity record, @Param("example") PostEntityExample example);

    int updateByPrimaryKeySelective(PostEntity record);

    int updateByPrimaryKeyWithBLOBs(PostEntity record);

    int updateByPrimaryKey(PostEntity record);
}