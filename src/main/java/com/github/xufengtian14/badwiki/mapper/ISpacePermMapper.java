package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.SpacePerm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpacePermMapper {
    List<SpacePerm> selectSpacePerm();
}
