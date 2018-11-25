package com.github.xufengtian14.badwiki.model;

public class Space {
    private Integer id;

    private String name;

    private String note;

    public Space() {
    }

    public Space(Integer id, String name, String note) {
        this.id = id;
        this.name = name;
        this.note = note;
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
}
