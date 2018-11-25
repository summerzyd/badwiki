package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.SpaceRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISpaceRoleMapper {
    List<SpaceRole> selectSpaceRoleBySpaceIdAndRoleId(@Param("space_id") Integer space_id, @Param("role_id") Integer role_id);

//    Integer updateSpaceRoleBySpaceIdAndRoleId(@Param("space_id") Integer space_id, @Param("role_id") Integer role_id);
//
//    Integer insertSpaceRoleBySpaceIdAndRoleId(@Param("space_id") Integer space_id, @Param("role_id") Integer role_id);
//
//    Integer deleteSpaceRoleBySpaceIdAndRoleId(@Param("space_id") Integer space_id, @Param("role_id") Integer role_id);
}
