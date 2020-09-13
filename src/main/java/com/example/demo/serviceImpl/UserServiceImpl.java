package com.example.demo.serviceImpl;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   // @Autowired
    //private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> getUserList() {

        return  null;//jdbcTemplate.query("select * from users",new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void createUser(User user) {
       // jdbcTemplate.update("insert into users(name,age) values(?,?)",user.getName(),user.getAge());

    }

    @Override
    public User getUser(Long id) {
        return null;//jdbcTemplate.queryForObject("select * from users where id=?",new BeanPropertyRowMapper<>(User.class),id);
    }

    @Override
    public void updateUser(Long id, User user) {
        //jdbcTemplate.update("update users set name=?,age=? where id=?",user.getName(),user.getAge(),id);

    }

    @Override
    public void deleteUser(Long id) {
        //jdbcTemplate.update("delete from users where id=?",id);

    }
}
