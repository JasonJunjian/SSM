package com.ssm.dao;

import com.ssm.model.Sysmenu;
import com.ssm.model.SysmenuExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysmenuMapper {
    int countByExample(SysmenuExample example);

    int deleteByExample(SysmenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    List<Sysmenu> selectByExample(SysmenuExample example);

    Sysmenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByExample(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);
}