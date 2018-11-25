package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.Media;
import org.apache.ibatis.annotations.Param;

public interface IMediaMapper {
    Media seleteMediaById(@Param("id") Integer id);

    Integer insertMedia(Media role);

    Integer deleteMediaById(@Param("id") Integer id);
}
