package com.github.xufengtian14.badwiki.model;

public class UserRole {
    private Integer id;

    private Integer userId;

    private Integer roleId;

    private Boolean deleted;

    public UserRole() {
    }

    public UserRole(Integer id, Integer userId, Integer roleId, Boolean deleted) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
        this.deleted = deleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
