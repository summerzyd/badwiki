package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.DocTrash;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDocTrashMapper {
    List<DocTrash> seleteDocTrashBySpaceId(@Param("space_id") Integer space_id);

    Integer insertDocTrash(DocTrash doc_trash);

    Integer deleteDocTrashById(@Param("id") Integer id);
}
