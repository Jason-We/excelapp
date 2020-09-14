package com.wn.excelapp.controller;

import com.wn.excelapp.entity.User;
import com.wn.excelapp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: excelapp
 * @description: test
 * @author: JasonWe
 * @create: 2020-08-31 15:57
 **/
@RestController
public class HelloTest {

    @Autowired
    private UserServiceImpl usi;

    @GetMapping("/hello")
    private String sayHello(){
        return "Hello Spring boot";
    }

    @PostMapping("/add")
    private String addUser(@RequestBody User user){
        usi.addUser(user.getName(),user.getSex(),user.getPhone(),user.getOthers());
        return "ok";
    }

}
