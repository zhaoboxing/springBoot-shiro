package com.unistrong.springbootshirodemo.dao;

import com.unistrong.springbootshirodemo.bean.RolePermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    //通过角色id查询权限id
    Set<Integer> selectPermissionIdsByRoleIds(@Param("roleIds")List<Integer> roleIds);
}