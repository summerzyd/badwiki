package com.github.xufengtian14.badwiki.service;

import com.github.xufengtian14.badwiki.model.User;

public interface IUserService {

    User seleteUserById(Integer id);

    Integer updateUserById(User user);
}
