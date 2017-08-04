package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

public class RoleUser {
    private Integer roluseId;

    private Integer userId;

    private Tbuser tbuser;

    private Integer roleId;

    private Role role;

    private String roluseDesc;

    private Date createTime;

    private Date updateTime;

    public Integer getRoluseId() {
        return roluseId;
    }

    public void setRoluseId(Integer roluseId) {
        this.roluseId = roluseId;
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

    public String getRoluseDesc() {
        return roluseDesc;
    }

    public void setRoluseDesc(String roluseDesc) {
        this.roluseDesc = roluseDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RoleUser{" +
                "roluseId=" + roluseId +
                ", userId=" + userId +
                ", tbuser=" + tbuser +
                ", roleId=" + roleId +
                ", role=" + role +
                ", roluseDesc='" + roluseDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}