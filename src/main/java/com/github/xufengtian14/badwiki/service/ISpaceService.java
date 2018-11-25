package com.github.xufengtian14.badwiki.service;

import com.github.xufengtian14.badwiki.model.Space;

import java.util.List;

public interface ISpaceService {

    List<Space> selectSpaceByUserId(Integer user_id);

}
