package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.DocTrash;

import java.util.List;

public interface DocTrashMapper {
    List<DocTrash> seleteDocTrashBySpaceId(Integer space_id);

    DocTrash insertDocTrash(DocTrash doc_trash);

    void deleteDocTrashById(Integer id);
}
