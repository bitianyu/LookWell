package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

/**
 * Created by ASUS on 2017/8/4.
 */
public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private String teacherDesc;
    private Date createTime;
    private Date updateTime;
    private String teacherStatus;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherDesc() {
        return teacherDesc;
    }

    public void setTeacherDesc(String teacherDesc) {
        this.teacherDesc = teacherDesc;
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

    public String getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(String teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public Teacher() {
    }

    public Teacher(Integer teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public Teacher(Integer teacherId, String teacherName, String teacherDesc, Date createTime, Date updateTime, String teacherStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherDesc = teacherDesc;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.teacherStatus = teacherStatus;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherDesc='" + teacherDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", teacherStatus='" + teacherStatus + '\'' +
                '}';
    }
}
