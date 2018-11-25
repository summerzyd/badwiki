package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.DocContentBuffer;
import org.apache.ibatis.annotations.Param;

public interface IDocContentBufferMapper {

    DocContentBuffer seleteDocContentBufferByDocId(@Param("doc_id") Integer doc_id);

    Integer updateDocContentBufferByDocId(DocContentBuffer doc_content_buffer);

    Integer insertDocContentBuffer(DocContentBuffer doc_content_buffer);

    Integer deleteDocContentBufferByDocId(@Param("doc_id") Integer doc_id);

}
