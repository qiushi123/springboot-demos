package com.shitou.springbootdemos.mybatis.repository;

import com.shitou.springbootdemos.mybatis.bean.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by qcl on 2019-07-18
 * 微信：2501902696
 * desc:
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void save() {
        User user = new User();
        user.setName("zzzz");
        user.setAge(18);
        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1, userMapper.save(user));
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(1);
        user.setAge(20);
        // 返回更新的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1, userMapper.update(user));
    }

    @Test
    public void deleteById() {
        Assert.assertEquals(1, userMapper.deleteById(1));
    }

    @Test
    public void selectById() {
        Assert.assertNotNull(userMapper.selectById(1));
    }

}