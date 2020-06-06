package com.cms.mapper;

import com.cms.model.MbrSess;
import com.cms.model.MbrSessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MbrSessMapper {
   
    long countByExample(MbrSessExample example);

    int deleteByExample(MbrSessExample example);

    int insert(MbrSess record);

    int insertSelective(MbrSess record);

    List<MbrSess> selectByExample(MbrSessExample example);

    int updateByExampleSelective(@Param("record") MbrSess record, @Param("example") MbrSessExample example);

    int updateByExample(@Param("record") MbrSess record, @Param("example") MbrSessExample example);
}