package cn.cooper.blog.dao;

import cn.cooper.blog.entity.CommentEntity;
import cn.cooper.blog.entity.CommentEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentEntityMapper {
    int countByExample(CommentEntityExample example);

    int deleteByExample(CommentEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommentEntity record);

    int insertSelective(CommentEntity record);

    List<CommentEntity> selectByExample(CommentEntityExample example);

    CommentEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommentEntity record, @Param("example") CommentEntityExample example);

    int updateByExample(@Param("record") CommentEntity record, @Param("example") CommentEntityExample example);

    int updateByPrimaryKeySelective(CommentEntity record);

    int updateByPrimaryKey(CommentEntity record);
}