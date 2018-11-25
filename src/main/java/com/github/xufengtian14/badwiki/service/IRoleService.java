package com.github.xufengtian14.badwiki.service;

import com.github.xufengtian14.badwiki.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> seleteUserRoleByUserId(Integer user_id);
}
