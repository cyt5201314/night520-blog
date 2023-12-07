package com.night520.service.impl;

import com.night520.mapper.UserMapper;
import com.night520.pojo.User;
import com.night520.service.UserService;
import com.night520.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getByUserName(String username) {
        return userMapper.selectByUserName(username);
    }

    @Override
    public void register(String username, String password) {
        String md5Pwd = Md5Util.getMD5String(password);
        userMapper.insert(username, md5Pwd);
    }
}
