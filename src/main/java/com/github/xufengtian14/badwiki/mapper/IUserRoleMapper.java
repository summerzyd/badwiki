package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserRoleMapper {
    List<UserRole> selectUserRoleByUserId(@Param("user_id") Integer user_id);

    List<UserRole> selectUserRoleByRoleId(@Param("role_id") Integer role_id);

}
