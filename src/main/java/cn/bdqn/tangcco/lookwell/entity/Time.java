package cn.bdqn.tangcco.lookwell.entity;

/**
 * Created by HP on 2017/8/4.
 */
public class Time {
    private Integer timeId;
    private String week;
    private String timeQuantum;

    public Time(Integer timeId, String week, String timeQuantum) {
        this.timeId = timeId;
        this.week = week;
        this.timeQuantum = timeQuantum;
    }

    @Override
    public String toString() {
        return "Time{" +
                "timeId=" + timeId +
                ", week='" + week + '\'' +
                ", timeQuantum='" + timeQuantum + '\'' +
                '}';
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTimeQuantum() {
        return timeQuantum;
    }

    public void setTimeQuantum(String timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public Time() {

    }
}
