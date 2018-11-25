package com.github.xufengtian14.badwiki.service.impl;

import com.github.xufengtian14.badwiki.mapper.IRoleMapper;
import com.github.xufengtian14.badwiki.model.Role;
import com.github.xufengtian14.badwiki.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    private IRoleMapper roleMapper;

    public List<Role> seleteUserRoleByUserId(Integer user_id){
        List<Role> roles = roleMapper.seleteUserRoleByUserId(user_id);
        return roles;
    }
}
