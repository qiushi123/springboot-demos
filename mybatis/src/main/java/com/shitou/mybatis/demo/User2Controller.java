package com.shitou.mybatis.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mybatis")
public class User2Controller {

    @Resource
    User2Service accountService;

    @GetMapping("/list")
    public List<User2> getAccounts() {
        return accountService.findAccountList();
    }

    @GetMapping("/findone")
    public User2 getAccountById(@RequestParam("id") int id) {
        return accountService.findAccount(id);
    }

    @GetMapping("/update")
    public String updateAccount(@RequestParam("id") int id,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "age") int age) {
        int t = accountService.update(name, age, id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        int t = accountService.delete(id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }

    @GetMapping("/add")
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "age") int age) {
        int t = accountService.add(name, age);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }


}