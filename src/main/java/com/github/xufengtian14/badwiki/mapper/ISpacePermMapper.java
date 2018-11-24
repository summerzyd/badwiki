package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.SpacePerm;

import java.util.List;

public interface ISpacePermMapper {
    List<SpacePerm> selectSpacePermBySpaceIdAndRoleId(Integer space_id, Integer role_id);
}
