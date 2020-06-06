package com.cms.mapper;

import com.cms.model.Mbr;
import com.cms.model.MbrExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MbrMapper {
    
    long countByExample(MbrExample example);

    int deleteByExample(MbrExample example);

    int deleteByPrimaryKey(String mbrId);

    int insert(Mbr record);

    int insertSelective(Mbr record);

    List<Mbr> selectByExample(MbrExample example);

    Mbr selectByPrimaryKey(String mbrId);

    int updateByExampleSelective(@Param("record") Mbr record, @Param("example") MbrExample example);

    int updateByExample(@Param("record") Mbr record, @Param("example") MbrExample example);

    int updateByPrimaryKeySelective(Mbr record);

    int updateByPrimaryKey(Mbr record);
}