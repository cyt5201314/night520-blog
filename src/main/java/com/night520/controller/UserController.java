package com.night520.controller;

import com.night520.pojo.Result;
import com.night520.pojo.User;
import com.night520.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result registerr(String username, String password) {
        // すでに存在するユーザ名かをチェックする
        User user = userService.getByUserName(username);
        if (user == null) {
            userService.register(username, password);
        } else {
            return Result.error("すでに存在するユーザ名です");
        }
        return Result.success();
    }
}
