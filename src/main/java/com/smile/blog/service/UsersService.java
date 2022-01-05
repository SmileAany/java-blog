package com.smile.blog.service;

import java.util.List;
import com.smile.blog.entity.Users;

public interface UsersService {
    List<Users> queryUserByUsernameAndPassword(String username, String password);
}
