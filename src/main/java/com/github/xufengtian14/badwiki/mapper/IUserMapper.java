package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {

    User seleteUserById(@Param("id") Integer id);

    Integer updateUserById(User user);

    Integer insertUser(User user);

    Integer deleteUserById(@Param("id") Integer id);
}
