package com.yzy.controller;

import com.yzy.mapper.UserMapper;
import com.yzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/UserList")
    public List<User> queryUserList() {
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    @GetMapping("/user/{id}")
    public User queryUserById(@PathVariable("id") int id) {
        return userMapper.queryUserById(id);
    }
    @GetMapping("/user/add")
    public String addUser(User user){
        userMapper.addUser(new User(60,"阿花","333333"));
        return "success";
    }
    @GetMapping("/user/update")
    public String updateUser(){
    userMapper.updateUser(new User(60,"小王","qwqwqw"));
    return "success";
    }
    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userMapper.deleteUserById(id);
        return "删除"+id+"成功";
    }
}
