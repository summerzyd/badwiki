package com.github.xufengtian14.badwiki.mapper;

import com.github.xufengtian14.badwiki.model.DocHistory;

import java.util.List;

public interface IDocHistoryMapper {
    List<DocHistory> seleteDocHistory();

    Integer insertDocHistory(DocHistory doc_history);
}
