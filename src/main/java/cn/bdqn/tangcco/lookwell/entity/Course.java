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
    private Integer CourseId;
    private Project project;
    private String CourseName;
    private String CourseDesc;
    private Date CreateTime;
    private Date UpdateTime;


    @Override
    public String toString() {
        return "Course{" +
                "CourseId=" + CourseId +
                ", project=" + project +
                ", CourseName='" + CourseName + '\'' +
                ", CourseDesc='" + CourseDesc + '\'' +
                ", CreateTime=" + CreateTime +
                ", UpdateTime=" + UpdateTime +
                '}';
    }

    public Integer getCourseId() {
        return CourseId;
    }

    public void setCourseId(Integer courseId) {
        CourseId = courseId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseDesc() {
        return CourseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        CourseDesc = courseDesc;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

    public Course(Integer courseId, Project project, String courseName, String courseDesc, Date createTime, Date updateTime) {
        CourseId = courseId;
        this.project = project;
        CourseName = courseName;
        CourseDesc = courseDesc;
        CreateTime = createTime;
        UpdateTime = updateTime;
    }

    public Course() {
    }
}
