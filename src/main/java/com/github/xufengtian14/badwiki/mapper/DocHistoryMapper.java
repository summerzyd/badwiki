package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.entity.DocHistory;

import java.util.List;

public interface DocHistoryMapper {
    List<DocHistory> seleteDocHistory();

    DocHistory insertDocHistory(DocHistory doc_history);
}
