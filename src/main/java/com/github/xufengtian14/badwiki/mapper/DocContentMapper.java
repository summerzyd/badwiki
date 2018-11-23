package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.entity.DocContent;

public interface DocContentMapper  {

    DocContent seleteDocContentByDocId(Integer doc_id);

    void updateDocContent(DocContent doc_content);

    DocContent insertDocContent(DocContent doc_content);

    void deleteDocContentByDocId(Integer doc_id);
}
