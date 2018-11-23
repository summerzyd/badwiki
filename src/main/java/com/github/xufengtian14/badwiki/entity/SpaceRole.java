package com.github.xufengtian14.badwiki.entity;

public class SpaceRole {
    private Integer id;

    private Integer spaceId;

    private Integer roleId;

    private Integer spacePremId;

    private Boolean deleted;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getSpacePremId() {
        return spacePremId;
    }

    public void setSpacePremId(Integer spacePremId) {
        this.spacePremId = spacePremId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
