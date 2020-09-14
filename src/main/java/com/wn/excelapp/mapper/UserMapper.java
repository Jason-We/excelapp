package com.wn.excelapp.mapper;

import com.wn.excelapp.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into users(name,sex,phone,others) values(#{name},#{sex},#{phone},#{others})")
    int addUser(@Param("name") String name, @Param("sex") String sex, @Param("phone") String phone, @Param("others") String others);

    @Select("select * from users where name = #{name}")
    User getUserByName(@Param("name") String name);

    @Select("select * from users")
    List<User> getAllUsers();

    @Delete("delete from users where name = #{name}")
    int deleteByName(@Param("name") String name);

}
