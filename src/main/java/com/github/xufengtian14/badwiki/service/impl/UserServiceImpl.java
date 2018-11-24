package com.github.xufengtian14.badwiki.service.impl;

import com.github.xufengtian14.badwiki.mapper.IUserMapper;
import com.github.xufengtian14.badwiki.model.User;
import com.github.xufengtian14.badwiki.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public User seleteUserById(Integer id){
        User user = userMapper.seleteUserById(id);
        return user;
    }
}
