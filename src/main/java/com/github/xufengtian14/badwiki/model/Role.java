package com.github.xufengtian14.badwiki.model;

public class Role {
    private Integer id;

    private String name;

    private String note;

    private Boolean deleted;

    public Role() {
    }

    public Role(Integer id, String name, String note, Boolean deleted) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.deleted = deleted;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
