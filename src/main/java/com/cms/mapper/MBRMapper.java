package com.cms.mapper;

import com.cms.model.MBR;
import com.cms.model.MBRExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MBRMapper {
    
    long countByExample(MBRExample example);

    int deleteByExample(MBRExample example);

    int deleteByPrimaryKey(String mbrId);

    int insert(MBR record);

    int insertSelective(MBR record);

    List<MBR> selectByExample(MBRExample example);

    MBR selectByPrimaryKey(String mbrId);

    int updateByExampleSelective(@Param("record") MBR record, @Param("example") MBRExample example);

    int updateByExample(@Param("record") MBR record, @Param("example") MBRExample example);

    int updateByPrimaryKeySelective(MBR record);

    int updateByPrimaryKey(MBR record);
}