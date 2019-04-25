package com.qf.vo;

public class LeaveMessageVo {
    private Integer userInfoId;
    private Integer leaveMessageToUser;
    private String leaveMessageText;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
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

    @Override
    public String toString() {
        return "LeaveMessageVo{" +
                "userInfoId=" + userInfoId +
                ", leaveMessageToUser=" + leaveMessageToUser +
                ", leaveMessageText='" + leaveMessageText + '\'' +
                '}';
    }
}
