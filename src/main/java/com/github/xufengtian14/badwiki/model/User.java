package com.github.xufengtian14.badwiki.model;

public class User {
    private Integer id;

    private String name;

    private String email;

    private String password;

    private Integer loginTypeId;

    private Boolean activated;

    private Boolean enabled;

    private Boolean deleted;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Integer loginTypeId, Boolean activated, Boolean enabled, Boolean deleted) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.loginTypeId = loginTypeId;
        this.activated = activated;
        this.enabled = enabled;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginTypeId() {
        return loginTypeId;
    }

    public void setLoginTypeId(Integer loginTypeId) {
        this.loginTypeId = loginTypeId;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
