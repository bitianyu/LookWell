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
    private Integer projectId;
    private String projectName;
    private String projectDesc;
    private String projectVersion;
    private String projectStatus;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDesc='" + projectDesc + '\'' +
                ", projectVersion='" + projectVersion + '\'' +
                ", projectStatus='" + projectStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
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

    public Project(Integer projectId, String projectName, String projectDesc, String projectVersion, String projectStatus, Date createTime, Date updateTime) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.projectVersion = projectVersion;
        this.projectStatus = projectStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Project() {
    }
}
