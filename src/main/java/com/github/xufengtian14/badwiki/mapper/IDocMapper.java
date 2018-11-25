package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.Doc;
import org.apache.ibatis.annotations.Param;

public interface IDocMapper {
    Doc seleteDocById(@Param("id") Integer id);

    Integer updateDoc(Doc doc);

    Integer insertDoc(Doc doc);

    Integer deleteDocById(@Param("id") Integer id);
}
