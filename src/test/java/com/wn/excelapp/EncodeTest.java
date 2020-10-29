package com.wn.excelapp;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: excelapp
 * @description: 使用jasypt生成数据库密码
 * @author: JasonWe
 * @create: 2020-10-29 21:28
 **/
@SpringBootTest
public class EncodeTest {

    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void encryptPwd() {
        //加密密码
        String pwd = stringEncryptor.encrypt("a");
        System.out.println("密码 加密：  "+ pwd);

        String rpwd = stringEncryptor.encrypt("");
        System.out.println("用户名 加密： "+ rpwd);
    }

}