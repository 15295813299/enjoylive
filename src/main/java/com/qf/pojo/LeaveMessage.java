package com.qf.pojo;

import java.sql.Timestamp;

public class LeaveMessage {
    private long leaveMessageId;
    private long userInfoId;
    private Integer leaveMessageToUser;
    private String leaveMessageText;
    private Timestamp leaveMessageTime;
    private String flag;

    public long getLeaveMessageId() {
        return leaveMessageId;
    }

    public void setLeaveMessageId(long leaveMessageId) {
        this.leaveMessageId = leaveMessageId;
    }

    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getLeaveMessageToUser() {
        return leaveMessageToUser;
    }

    public void setLeaveMessageToUser(Integer leaveMessageToUser) {
        this.leaveMessageToUser = leaveMessageToUser;
    }

    public String getLeaveMessageText() {
        return leaveMessageText;
    }

    public void setLeaveMessageText(String leaveMessageText) {
        this.leaveMessageText = leaveMessageText;
    }

    public Timestamp getLeaveMessageTime() {
        return leaveMessageTime;
    }

    public void setLeaveMessageTime(Timestamp leaveMessageTime) {
        this.leaveMessageTime = leaveMessageTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "LeaveMessage{" +
                "leaveMessageId=" + leaveMessageId +
                ", userInfoId=" + userInfoId +
                ", leaveMessageToUser=" + leaveMessageToUser +
                ", leaveMessageText='" + leaveMessageText + '\'' +
                ", leaveMessageTime=" + leaveMessageTime +
                ", flag='" + flag + '\'' +
                '}';
    }
}
