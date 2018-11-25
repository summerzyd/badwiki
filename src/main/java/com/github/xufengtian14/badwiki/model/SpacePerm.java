package com.github.xufengtian14.badwiki.model;

public class SpacePerm {
    private Integer id;

    private String name;

    private String note;

    private Integer spaceAreaId;

    public SpacePerm() {
    }

    public SpacePerm(Integer id, String name, String note, Integer spaceAreaId) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.spaceAreaId = spaceAreaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSpaceAreaId() {
        return spaceAreaId;
    }

    public void setSpaceAreaId(Integer spaceAreaId) {
        this.spaceAreaId = spaceAreaId;
    }
}
