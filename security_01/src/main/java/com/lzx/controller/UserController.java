package com.lzx.controller;

import com.lzx.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("{id:\\d+}")
    public User query() throws Exception {
        User user = new User();
        user.setUsername("yun");
        user.setBirthday(new Date());
        user.setPassword("123456");
        return user;
    }
}


