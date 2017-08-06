package cn.bdqn.tangcco.lookwell.entity;

import java.util.List;

/**
 * Created by 99117 on 2017/8/6.
 */
public class PreliminaryPrrangement {
    private Integer paId;
    private List<Grade> gradeList;
    private List<Time> timeList;
    private List<Teacher> teacherList;
    private List<Room> roomList;
    private List<Chapter> chapterList;

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public List<Time> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<Time> timeList) {
        this.timeList = timeList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    @Override
    public String toString() {
        return "PreliminaryPrrangement{" +
                "paId=" + paId +
                ", gradeList=" + gradeList +
                ", timeList=" + timeList +
                ", teacherList=" + teacherList +
                ", roomList=" + roomList +
                ", chapterList=" + chapterList +
                '}';
    }

    public PreliminaryPrrangement(Integer paId, List<Grade> gradeList, List<Time> timeList, List<Teacher> teacherList, List<Room> roomList, List<Chapter> chapterList) {
        this.paId = paId;
        this.gradeList = gradeList;
        this.timeList = timeList;
        this.teacherList = teacherList;
        this.roomList = roomList;
        this.chapterList = chapterList;
    }

    public PreliminaryPrrangement() {

    }
}
