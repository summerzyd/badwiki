package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.entity.Space;

import java.util.List;

public interface SpaceMapper {
    List<Space> seleteSpace();

    Space insertSpace(Space space);

    void deleteSpaceById(Integer id);
}
