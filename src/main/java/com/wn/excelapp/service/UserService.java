package com.wn.excelapp.service;

import com.wn.excelapp.entity.User;
import com.wn.excelapp.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: excelapp
 * @description: testUser
 * @author: JasonWe
 * @create: 2020-09-01 12:04
 **/
@Service
@Slf4j
public class UserService implements UserMapper{


    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(String name, String sex, String phone, String others) {
        //todo  在此处做数据校验
        if(userMapper.addUser(name,sex,phone,others) == 1){
            log.warn("添加用户成功，姓名:{},性别:{},电话:{},其他:{}",name,sex,phone,others);
            return 1;
        }else{
            log.error("添加用户失败！");
            return 0;
        }


    }

    @Override
    public User getUserByName(String name) {
        User user;
        try{
            user = userMapper.getUserByName(name);
        }catch (Exception e){
            user = null;
            e.printStackTrace();

        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public int deleteByName(String name) {
        if(userMapper.deleteByName(name) != 0){
            log.warn("删除用户成功，用户名:{}",name);
            return 1;
        }else{
            log.error("删除用户失败，用户名：{}",name);
            return 0;
        }
    }
}
