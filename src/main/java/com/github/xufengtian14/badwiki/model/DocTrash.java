package com.github.xufengtian14.badwiki.model;

import java.math.BigInteger;

public class DocTrash {
    private Integer id;

    private Integer spaceId;

    private Integer docId;

    private String[] docPath;

    private Integer deleter;

    private BigInteger deleteTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String[] getDocPath() {
        return docPath;
    }

    public void setDocPath(String[] docPath) {
        this.docPath = docPath;
    }

    public Integer getDeleter() {
        return deleter;
    }

    public void setDeleter(Integer deleter) {
        this.deleter = deleter;
    }

    public BigInteger getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(BigInteger deleteTime) {
        this.deleteTime = deleteTime;
    }
}
