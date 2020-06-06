package com.cms.mapper;

import com.cms.model.IpConfigInfo;
import com.cms.model.IpConfigInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IpConfigInfoMapper {

	long countByExample(IpConfigInfoExample example);

    int deleteByExample(IpConfigInfoExample example);

    int insert(IpConfigInfo record);

    int insertSelective(IpConfigInfo record);

    List<IpConfigInfo> selectByExample(IpConfigInfoExample example);

    int updateByExampleSelective(@Param("record") IpConfigInfo record, @Param("example") IpConfigInfoExample example);

    int updateByExample(@Param("record") IpConfigInfo record, @Param("example") IpConfigInfoExample example);
}