package com.smile.blog.controller;

import com.smile.blog.entity.Users;
import com.smile.blog.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

public class AuthController {
    @Resource
    private UsersService usersService;

    @GetMapping("auth/login")
    public String accountLogin()
    {
        usersService.queryUserByUsernameAndPassword("smile","admin");

        return "";
    }
}
