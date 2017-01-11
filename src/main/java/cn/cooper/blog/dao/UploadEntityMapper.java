package cn.cooper.blog.dao;

import cn.cooper.blog.entity.UploadEntity;
import cn.cooper.blog.entity.UploadEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadEntityMapper {
    int countByExample(UploadEntityExample example);

    int deleteByExample(UploadEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(UploadEntity record);

    int insertSelective(UploadEntity record);

    List<UploadEntity> selectByExample(UploadEntityExample example);

    UploadEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UploadEntity record, @Param("example") UploadEntityExample example);

    int updateByExample(@Param("record") UploadEntity record, @Param("example") UploadEntityExample example);

    int updateByPrimaryKeySelective(UploadEntity record);

    int updateByPrimaryKey(UploadEntity record);
}