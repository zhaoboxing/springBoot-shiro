package com.unistrong.springbootshirodemo.dao;

import com.unistrong.springbootshirodemo.bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    //通过角色id集合查询所有角色名称
    List<String> slectByPrimaryKeyList(@Param("roleIds") List<Integer> roleIds);
}