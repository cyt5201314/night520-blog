package com.night520.service;

import com.night520.pojo.User;

public interface UserService {
    User getByUserName(String username);

    void register(String username, String password);
}
