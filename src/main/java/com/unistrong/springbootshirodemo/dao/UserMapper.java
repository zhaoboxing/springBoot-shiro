package com.unistrong.springbootshirodemo.dao;

import com.unistrong.springbootshirodemo.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //根据账号查询有无此人
    User selectByAccount(String account);
}