package com.wn.excelapp.service;

import com.wn.excelapp.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService1 {

    void addUser(String name,String sex,String phone,String others);

    String getUserByName(String name);

    List<User> getAllUsers();
}
