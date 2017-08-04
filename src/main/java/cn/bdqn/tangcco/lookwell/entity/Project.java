package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/4.
 */
public class Project {
    /**
     FieldTypeComment
     project_idint(11) NOT NULL
     project_namevarchar(20) NULL
     project_descvarchar(30) NULL
     project_versionvarchar(10) NULL
     project_statusvarchar(4) NULL
     create_timedatetime NULL
     update_timedatetime NULL*/
    private Integer ProjectId;
    private String ProjectName;
    private String ProjectDesc;
    private String ProjectVersion;
    private String ProjectStatus;
    private Date CreateTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Project{" +
                "ProjectId=" + ProjectId +
                ", ProjectName='" + ProjectName + '\'' +
                ", ProjectDesc='" + ProjectDesc + '\'' +
                ", ProjectVersion='" + ProjectVersion + '\'' +
                ", ProjectStatus='" + ProjectStatus + '\'' +
                ", CreateTime=" + CreateTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getProjectDesc() {
        return ProjectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        ProjectDesc = projectDesc;
    }

    public String getProjectVersion() {
        return ProjectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        ProjectVersion = projectVersion;
    }

    public String getProjectStatus() {
        return ProjectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        ProjectStatus = projectStatus;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Project(Integer projectId, String projectName, String projectDesc, String projectVersion, String projectStatus, Date createTime, Date updateTime) {
        ProjectId = projectId;
        ProjectName = projectName;
        ProjectDesc = projectDesc;
        ProjectVersion = projectVersion;
        ProjectStatus = projectStatus;
        CreateTime = createTime;
        this.updateTime = updateTime;
    }

    public Project() {
    }
}
