package com.example.demo.service;


import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
//获取全部用户数据
public List<User> getUserList();
//新增用户数据
public void createUser(User user);
//获取指定 id 用户信息
public User getUser(Long id);
// 更新指定 id 信息
public void updateUser(Long id,User user);
//删除指定 id
public void deleteUser(Long id); }

