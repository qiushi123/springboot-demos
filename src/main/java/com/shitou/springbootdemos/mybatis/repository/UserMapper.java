package com.shitou.springbootdemos.mybatis.repository;

import com.shitou.springbootdemos.mybatis.bean.User;

import java.util.List;

/**
 * user表对应的mapper
 */
public interface UserMapper {
    //新增用户

    int save(User user);

    //更新用户信息
    int update(User user);

    //根据id删除
    int deleteById(int id);

    //根据id查询
    User selectById(int id);

    //查询所有用户信息
    List<User> selectAll();
}