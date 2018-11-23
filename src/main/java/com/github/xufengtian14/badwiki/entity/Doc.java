package com.github.xufengtian14.badwiki.entity;

import java.math.BigInteger;

public class Doc {
    private Integer id;

    private Integer spaceId;

    private String name;

    private Integer size;

    private Integer parentId;

    private Boolean hasChild;

    private Integer editor;

    private BigInteger editeTime;

    private Boolean deleted;

    private Integer creator;

    private BigInteger createTime;

    private Integer modifier;

    private BigInteger modifyTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public Integer getEditor() {
        return editor;
    }

    public void setEditor(Integer editor) {
        this.editor = editor;
    }

    public BigInteger getEditeTime() {
        return editeTime;
    }

    public void setEditeTime(BigInteger editeTime) {
        this.editeTime = editeTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public BigInteger getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigInteger createTime) {
        this.createTime = createTime;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public BigInteger getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(BigInteger modifyTime) {
        this.modifyTime = modifyTime;
    }
}
