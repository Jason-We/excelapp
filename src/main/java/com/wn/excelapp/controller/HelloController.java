package com.wn.excelapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: excelapp
 * @description: test
 * @author: JasonWe
 * @create: 2020-08-31 17:15
 **/
@RestController
public class HelloController {

    @GetMapping("/")
    public String test(){
        return "index  !!!!";
    }

}
