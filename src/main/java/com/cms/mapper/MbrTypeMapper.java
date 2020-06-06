package com.cms.mapper;

import com.cms.model.MbrType;
import com.cms.model.MbrTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MbrTypeMapper {
    
    long countByExample(MbrTypeExample example);

    int deleteByExample(MbrTypeExample example);

    int deleteByPrimaryKey(String typeId);

    int insert(MbrType record);

    int insertSelective(MbrType record);

    List<MbrType> selectByExample(MbrTypeExample example);

    MbrType selectByPrimaryKey(String typeId);

    int updateByExampleSelective(@Param("record") MbrType record, @Param("example") MbrTypeExample example);

    int updateByExample(@Param("record") MbrType record, @Param("example") MbrTypeExample example);

    int updateByPrimaryKeySelective(MbrType record);

    int updateByPrimaryKey(MbrType record);
}