package com.smile.blog.dao;

import java.util.List;
import com.smile.blog.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersDao {
    List<Users> queryUserByUsernameAndPassword(String username, String password);
}
