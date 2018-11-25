package com.github.xufengtian14.badwiki.model;

import java.math.BigInteger;

public class DocHistory {
    private Integer id;

    private Integer spaceId;

    private Integer docId;

    private Integer docOperationTypeId;

    private Integer operator;

    private BigInteger operateTime;

    public DocHistory() {
    }

    public DocHistory(Integer id, Integer spaceId, Integer docId, Integer docOperationTypeId, Integer operator, BigInteger operateTime) {
        this.id = id;
        this.spaceId = spaceId;
        this.docId = docId;
        this.docOperationTypeId = docOperationTypeId;
        this.operator = operator;
        this.operateTime = operateTime;
    }

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

    public Integer getDocOperationTypeId() {
        return docOperationTypeId;
    }

    public void setDocOperationTypeId(Integer docOperationTypeId) {
        this.docOperationTypeId = docOperationTypeId;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public BigInteger getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(BigInteger operateTime) {
        this.operateTime = operateTime;
    }
}
