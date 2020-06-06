package com.cms.mapper;

import com.cms.model.VisitLog;
import com.cms.model.VisitLogExample;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VisitLogMapper {
 
    long countByExample(VisitLogExample example);

    int deleteByExample(VisitLogExample example);

    int deleteByPrimaryKey(BigDecimal seqNo);

    int insert(VisitLog record);

    int insertSelective(VisitLog record);

    List<VisitLog> selectByExample(VisitLogExample example);

    VisitLog selectByPrimaryKey(BigDecimal seqNo);

    int updateByExampleSelective(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByExample(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByPrimaryKeySelective(VisitLog record);

    int updateByPrimaryKey(VisitLog record);
}