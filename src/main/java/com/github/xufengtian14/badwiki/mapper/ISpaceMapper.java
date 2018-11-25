package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.Space;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpaceMapper {
    List<Space> seleteSpace();

    Space seleteSpaceById(@Param("id") Integer id);

    Integer updateSpaceById(Space space);

    Integer insertSpace(Space space);

    Integer deleteSpaceById(@Param("id") Integer id);
}
