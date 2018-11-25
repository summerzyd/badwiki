package com.github.xufengtian14.badwiki.model;

import java.math.BigInteger;

public class DocContentBuffer {
    private Integer id;

    private Integer docId;

    private Integer saver;

    private BigInteger saveTime;

    private String docName;

    private String docContent;

    public DocContentBuffer() {
    }

    public DocContentBuffer(Integer id, Integer docId, Integer saver, BigInteger saveTime, String docName, String docContent) {
        this.id = id;
        this.docId = docId;
        this.saver = saver;
        this.saveTime = saveTime;
        this.docName = docName;
        this.docContent = docContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getSaver() {
        return saver;
    }

    public void setSaver(Integer saver) {
        this.saver = saver;
    }

    public BigInteger getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(BigInteger saveTime) {
        this.saveTime = saveTime;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocContent() {
        return docContent;
    }

    public void setDocContent(String docContent) {
        this.docContent = docContent;
    }
}
