package com.shitou.mybatis.demo;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

@Service
public class User2Service {

    @Resource
    private User2Mapper accountMapper;

    public int add(String name, int age) {
        return accountMapper.add(name, age);
    }

    public int update(String name, int age, int id) {
        return accountMapper.update(name, age, id);
    }

    public int delete(int id) {
        return accountMapper.delete(id);
    }

    public User2 findAccount(int id) {
        return accountMapper.findOne(id);
    }

    public List<User2> findAccountList() {
        return accountMapper.findAll();
    }
}