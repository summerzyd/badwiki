package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.entity.Role;

public interface RoleMapper {
    Role seleteRoleById(Integer id);

    void updateRole(Role role);

    Role insertRole(Role role);

    void deleteRoleById(Integer id);
}
