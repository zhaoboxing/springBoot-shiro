package com.unistrong.springbootshirodemo.dao;

import com.unistrong.springbootshirodemo.bean.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    //通过主键集合查询权限url集合
    List<String> selectPermissionNamesByPrimaryKeys(@Param("permissionIds") List<Integer> permissionIds);
}