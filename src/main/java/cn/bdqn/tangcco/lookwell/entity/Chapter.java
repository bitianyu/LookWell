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
    private Integer ChapterId;
    private Course course;
    private String ChapterName;
    private Integer duration;

    @Override
    public String toString() {
        return "Chapter{" +
                "ChapterId=" + ChapterId +
                ", course=" + course +
                ", ChapterName='" + ChapterName + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Integer getChapterId() {
        return ChapterId;
    }

    public void setChapterId(Integer chapterId) {
        ChapterId = chapterId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getChapterName() {
        return ChapterName;
    }

    public void setChapterName(String chapterName) {
        ChapterName = chapterName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Chapter(Integer chapterId, Course course, String chapterName, Integer duration) {
        ChapterId = chapterId;
        this.course = course;
        ChapterName = chapterName;
        this.duration = duration;
    }

    public Chapter() {
    }
}
