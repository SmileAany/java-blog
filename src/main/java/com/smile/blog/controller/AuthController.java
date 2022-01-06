package com.smile.blog.controller;

import java.util.List;
import javax.annotation.Resource;
import com.smile.blog.entity.Users;
import com.smile.blog.service.UsersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Resource
    private UsersService usersService;

    /**
     * 用户登录
     * @return
     */
    @PostMapping("/auth/login")
    public List<Users> accountLogin()
    {
        return usersService.queryUserByUsernameAndPassword("smile","admin");
    }
}
