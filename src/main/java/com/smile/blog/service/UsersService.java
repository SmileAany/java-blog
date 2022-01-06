package com.smile.blog.service;

import java.util.List;
import com.smile.blog.entity.Users;

public interface UsersService {
    /**
     * 通过账号和密码查询用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return 对象实例
     */
    List<Users> queryUserByUsernameAndPassword(String username, String password);
}
