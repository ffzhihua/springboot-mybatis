package com.zhihua.demo.controller;

import com.zhihua.demo.domain.mapper.UserMapper;
import com.zhihua.demo.domain.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/5/15
 */
@RestController
public class UserController {
    /**
     *
     */
    @Autowired
    private UserMapper usersMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=usersMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user=usersMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(User user) {
        usersMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(User user) {
        usersMapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        usersMapper.delete(id);
    }
}