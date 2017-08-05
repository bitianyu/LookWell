package cn.bdqn.tangcco.lookwell.entity;

/**
 * Created by Administrator on 2017/8/4.
 */
public class Chapter {
    /**
     FieldTypeComment
     chapter_idint(11) NOT NULL
     course_idint(11) NULL
     chapter_namevarchar(20) NULL
     durationint(11) NULL*/
    private Integer chapterId;
    private Course course;
    private String chapterName;
    private Integer duration;

    @Override
    public String toString() {
        return "Chapter{" +
                "chapterId=" + chapterId +
                ", course=" + course +
                ", chapterName='" + chapterName + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Chapter(Integer chapterId, Course course, String chapterName, Integer duration) {
        this.chapterId = chapterId;
        this.course = course;
        this.chapterName = chapterName;
        this.duration = duration;
    }

    public Chapter() {
    }
}
