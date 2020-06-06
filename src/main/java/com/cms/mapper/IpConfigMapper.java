package com.cms.mapper;

import com.cms.model.IpConfig;
import com.cms.model.IpConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IpConfigMapper {
    
    long countByExample(IpConfigExample example);

    int deleteByExample(IpConfigExample example);

    int insert(IpConfig record);

    int insertSelective(IpConfig record);

    List<IpConfig> selectByExample(IpConfigExample example);

    int updateByExampleSelective(@Param("record") IpConfig record, @Param("example") IpConfigExample example);

    int updateByExample(@Param("record") IpConfig record, @Param("example") IpConfigExample example);
}