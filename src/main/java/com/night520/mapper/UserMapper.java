package com.night520.mapper;

import com.night520.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE username = #{username}")
    User selectByUserName(String username);

    @Insert("INSERT INTO user(username, password) VALUES(#{username}, #{password})")
    void insert(String username, String password);
}
