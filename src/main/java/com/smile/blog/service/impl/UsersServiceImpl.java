package com.smile.blog.service.impl;

import java.util.List;
import com.smile.blog.dao.UsersDao;
import com.smile.blog.entity.Users;
import com.smile.blog.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    /**
     * 通过账号和密码查询用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return 对象实例
     */
    @Override
    public List<Users> queryUserByUsernameAndPassword(String username, String password)
    {
        return this.usersDao.queryUserByUsernameAndPassword(username,password);
    }
}
