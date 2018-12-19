package com.unistrong.springbootshirodemo.dao;

import com.unistrong.springbootshirodemo.bean.UserRole;

import java.util.List;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
    //通过用户Id查询用户所拥有的所有角色id
    List<Integer> selectRoleIdsByUserId(Integer userId);


}