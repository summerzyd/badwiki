package com.github.xufengtian14.badwiki.common.response;

import com.github.xufengtian14.badwiki.common.response.BaseRestResponse;

public class ObjectRestResponse<T> extends BaseRestResponse {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
