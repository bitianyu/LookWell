package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

/**
 * Created by ASUS on 2017/8/4.
 */
public class Room {
    private Integer roomId;
    private String roomName;
    private String roomDesc;
    private String roomStatus;
    private Date createTime;
    private Date updateTime;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
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

    public Room() {
    }

    public Room(Integer roomId, String roomName, String roomDesc, String roomStatus, Date createTime, Date updateTime) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomDesc = roomDesc;
        this.roomStatus = roomStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomDesc='" + roomDesc + '\'' +
                ", roomStatus='" + roomStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
