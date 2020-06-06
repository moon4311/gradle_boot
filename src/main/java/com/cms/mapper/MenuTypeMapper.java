package com.cms.mapper;

import com.cms.model.MenuType;
import com.cms.model.MenuTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MenuTypeMapper {

	long countByExample(MenuTypeExample example);

    int deleteByExample(MenuTypeExample example);

    int insert(MenuType record);

    int insertSelective(MenuType record);

    List<MenuType> selectByExample(MenuTypeExample example);

    int updateByExampleSelective(@Param("record") MenuType record, @Param("example") MenuTypeExample example);

    int updateByExample(@Param("record") MenuType record, @Param("example") MenuTypeExample example);
}