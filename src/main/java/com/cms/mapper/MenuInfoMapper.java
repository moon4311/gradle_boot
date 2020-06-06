package com.cms.mapper;

import com.cms.model.MenuInfo;
import com.cms.model.MenuInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MenuInfoMapper {
	
    long countByExample(MenuInfoExample example);

    int deleteByExample(MenuInfoExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(MenuInfo record);

    int insertSelective(MenuInfo record);

    List<MenuInfo> selectByExample(MenuInfoExample example);

    MenuInfo selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

    int updateByExample(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

    int updateByPrimaryKeySelective(MenuInfo record);

    int updateByPrimaryKey(MenuInfo record);
}