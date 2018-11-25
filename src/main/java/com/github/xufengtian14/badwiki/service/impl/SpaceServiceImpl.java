package com.github.xufengtian14.badwiki.service.impl;

import com.github.xufengtian14.badwiki.mapper.ISpaceMapper;
import com.github.xufengtian14.badwiki.mapper.IUserMapper;
import com.github.xufengtian14.badwiki.model.Role;
import com.github.xufengtian14.badwiki.model.Space;
import com.github.xufengtian14.badwiki.service.ISpaceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpaceServiceImpl implements ISpaceService {

    private IUserMapper userMapper;

    private ISpaceMapper spaceMapper;

    @Override
    public List<Space> selectSpaceByUserId(Integer user_id){
        List<Space> spaces = new ArrayList<>();
//        List<Role> userMapper.selectUserRoleByUserId(user_id);
        return spaces;
    }
}
