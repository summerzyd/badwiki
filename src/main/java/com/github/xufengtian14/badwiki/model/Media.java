package com.github.xufengtian14.badwiki.model;

public class Media {
    private Integer id;

    private String name;

    private String path;

    private String url;

    private Boolean isImg;

    public Media() {
    }

    public Media(Integer id, String name, String path, String url, Boolean isImg) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.url = url;
        this.isImg = isImg;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsImg() {
        return isImg;
    }

    public void setIsImg(Boolean isImg) {
        this.isImg = isImg;
    }
}
