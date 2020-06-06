package com.cms.mapper;

import com.cms.model.ComnCode;
import com.cms.model.ComnCodeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ComnCodeMapper {

	long countByExample(ComnCodeExample example);

    int deleteByExample(ComnCodeExample example);

    int deleteByPrimaryKey(String comcdId);

    int insert(ComnCode record);

    int insertSelective(ComnCode record);

    List<ComnCode> selectByExample(ComnCodeExample example);

    ComnCode selectByPrimaryKey(String comcdId);

    int updateByExampleSelective(@Param("record") ComnCode record, @Param("example") ComnCodeExample example);

    int updateByExample(@Param("record") ComnCode record, @Param("example") ComnCodeExample example);

    int updateByPrimaryKeySelective(ComnCode record);

    int updateByPrimaryKey(ComnCode record);
}