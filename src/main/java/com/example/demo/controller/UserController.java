package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users-test")
public class UserController {
    @Autowired
    UserService userService;
    private List<User> listUser= Collections.synchronizedList(new ArrayList<User>());
    /*** * 获取全部用户信息 * @return */
    @GetMapping("/")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    /*** * 新增用户 * @param user * @return */
    @PostMapping("/")
    public String createUser(User user) {
        userService.createUser(user); return "success";
    }

    /*** * 获取指定 id 用户信息 * @param id * @return */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {

        return userService.getUser(id);
    }

    /*** 更新指定 id 用户信息 * @param id * @param user * @return */
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Long id, User user) {
        userService.updateUser(id, user);
        return "success";
    }

    /*** * 删除指定 id 用户 * @param id * @return */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {

        userService.deleteUser(id);
        return "success";
    }
}

