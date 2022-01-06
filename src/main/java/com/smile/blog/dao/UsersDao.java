package com.smile.blog.dao;

import java.util.List;
import com.smile.blog.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersDao {
    /**
     * 通过账号和密码查询用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return 对象实例
     */
    List<Users> queryUserByUsernameAndPassword(String username, String password);
}
