package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.DocContent;
import org.apache.ibatis.annotations.Param;

public interface IDocContentMapper {

    DocContent seleteDocContentByDocId(@Param("doc_id") Integer doc_id);

    Integer updateDocContentByDocId(DocContent doc_content);

    Integer insertDocContent(DocContent doc_content);

    Integer deleteDocContentByDocId(@Param("doc_id") Integer doc_id);
}
