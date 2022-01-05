package com.smile.blog.mapper;

import java.util.List;
import com.smile.blog.entity.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    List<Users> queryUserByUsernameAndPassword(String username, String password);
}
