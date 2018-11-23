package com.github.xufengtian14.badwiki.common.response;

public class BaseRestResponse {
    private int status = 200;
    private String message = "处理成功";

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
