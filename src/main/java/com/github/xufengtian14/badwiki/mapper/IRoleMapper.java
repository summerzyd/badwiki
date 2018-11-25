package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRoleMapper {
    Role seleteRoleById(@Param("id") Integer id);

    Integer updateRoleById(Role role);

    Integer insertRole(Role role);

    Integer deleteRoleById(@Param("id") Integer id);

    List<Role> seleteUserRoleByUserId( @Param("user_id") Integer user_id );
}
