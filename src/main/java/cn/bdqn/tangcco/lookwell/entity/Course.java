package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/4.
 */
public class Course {
    /**FieldTypeComment
     course_idint(11) NOT NULL
     project_idint(11) NULL
     course_namevarchar(50) NULL
     course_descvarchar(30) NULL
     create_timedatetime NULL
     update_timedatetime NULL*/
    private Integer courseId;
    private Project project;
    private String courseName;
    private String courseDesc;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", project=" + project +
                ", courseName='" + courseName + '\'' +
                ", courseDesc='" + courseDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
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

    public Course(Integer courseId, Project project, String courseName, String courseDesc, Date createTime, Date updateTime) {
        this.courseId = courseId;
        this.project = project;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Course() {
    }
}
