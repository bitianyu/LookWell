package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

public class RoleMenu {
    private Integer rolmenId;

    private Integer roleId;

    private Integer menuId;

    private String rolmenDesc;

    private Date createTime;

    private Date updateTime;

    public Integer getRolmenId() {
        return rolmenId;
    }

    public void setRolmenId(Integer rolmenId) {
        this.rolmenId = rolmenId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getRolmenDesc() {
        return rolmenDesc;
    }

    public void setRolmenDesc(String rolmenDesc) {
        this.rolmenDesc = rolmenDesc;
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
        return "RoleMenu{" +
                "rolmenId=" + rolmenId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", rolmenDesc='" + rolmenDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}