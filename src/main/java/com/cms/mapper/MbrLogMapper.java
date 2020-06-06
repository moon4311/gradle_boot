package com.cms.mapper;

import com.cms.model.MbrLog;
import com.cms.model.MbrLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MbrLogMapper {

    long countByExample(MbrLogExample example);

    int deleteByExample(MbrLogExample example);

    int deleteByPrimaryKey(String mbrlogId);

    int insert(MbrLog record);

    int insertSelective(MbrLog record);

    List<MbrLog> selectByExample(MbrLogExample example);

    MbrLog selectByPrimaryKey(String mbrlogId);

    int updateByExampleSelective(@Param("record") MbrLog record, @Param("example") MbrLogExample example);

    int updateByExample(@Param("record") MbrLog record, @Param("example") MbrLogExample example);

    int updateByPrimaryKeySelective(MbrLog record);

    int updateByPrimaryKey(MbrLog record);
}