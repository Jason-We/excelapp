package com.wn.excelapp.controller;

import com.wn.excelapp.entity.User;
import com.wn.excelapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: excelapp
 * @description: testUser
 * @author: JasonWe
 * @create: 2020-09-01 12:03
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    //1.这种方式需要写成key:value形式  ： localhost:8080/user/get/?name=tom
    @GetMapping("/get")
    public User getUserByName(@RequestParam("name")String name){
        return userService.getUserByName(name);
    }

    //2.这种方式直接在url路径上写name值  ：localhost:8080/user/get/tom
    @RequestMapping("/get/{name}")
    public User GetUser(@PathVariable String name){
        return userService.getUserByName(name);
    }


    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    private int addUser(@RequestBody User user){
        return userService.addUser(user.getName(),user.getSex(),user.getPhone(),user.getOthers());
    }

    @DeleteMapping("/del")
    private int deleteByName(@RequestParam("name")String name){
        return userService.deleteByName(name);
    }

}
