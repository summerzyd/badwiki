package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {

    User seleteUserById(@Param("id") Integer id);

//    void updateUser(User user);
//
//    User insertUser(User user);
//
//    void deleteUserById(Integer id);
}
