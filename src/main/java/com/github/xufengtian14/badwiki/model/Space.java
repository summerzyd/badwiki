package com.github.xufengtian14.badwiki.model;

public class Space {
    private Integer id;

    private String name;

    private String note;

    private Boolean enabled;

    public Space() {
    }

    public Space(Integer id, String name, String note, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.enabled = enabled;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
