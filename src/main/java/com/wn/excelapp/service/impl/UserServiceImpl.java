package com.wn.excelapp.service.impl;

import com.wn.excelapp.entity.User;
import com.wn.excelapp.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: excelapp
 * @description: impl
 * @author: JasonWe
 * @create: 2020-08-31 17:47
 **/
@Service
public class UserServiceImpl implements UserService1 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(String name, String sex, String phone, String others) {
        jdbcTemplate.update("insert into users (name,sex,phone,others) values(?,?,?,?)",name,sex,phone,others);
    }

    @Override
    public String getUserByName(String name) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
