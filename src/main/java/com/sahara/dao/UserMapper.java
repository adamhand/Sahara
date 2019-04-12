package com.sahara.dao;

import com.sahara.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);

    @Insert("insert into user (name, gender) values (#{name}, #{gender})")
    int addUser(@Param("name") String name, @Param("gender") String gender);
}
