package com.shitou.springbootdemos.mybatis;

import com.shitou.springbootdemos.mybatis.bean.User;
import com.shitou.springbootdemos.mybatis.repository.UserMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by qcl on 2019-07-18
 * 微信：2501902696
 * desc:
 */
@RestController
public class MybatisUserController {

    @Resource
    UserMapper mapper;

    @GetMapping("save")
    public String save() {
        User user = new User();
        user.setName("编程小石头");
        user.setAge(18);
        int save = mapper.save(user);
        return "" + save;
    }

    @GetMapping("getAll")
    public List<User> getAll() {
        List<User> users = mapper.selectAll();
        return users;
    }
}
