package com.qf.pojo;

import java.security.Timestamp;

public class Total {
    private long totalId;
    private long userInfoId;
    private String loginTime;
    private String loginIp;
    private String loginArea;
    private String lateTime;

    public long getTotalId() {
        return totalId;
    }

    public void setTotalId(long totalId) {
        this.totalId = totalId;
    }

    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginArea() {
        return loginArea;
    }

    public void setLoginArea(String loginArea) {
        this.loginArea = loginArea;
    }

    public String getLateTime() {
        return lateTime;
    }

    public void setLateTime(String lateTime) {
        this.lateTime = lateTime;
    }

    @Override
    public String toString() {
        return "Total{" +
                "totalId=" + totalId +
                ", userInfoId=" + userInfoId +
                ", loginTime=" + loginTime +
                ", loginIp='" + loginIp + '\'' +
                ", loginArea='" + loginArea + '\'' +
                ", lateTime=" + lateTime +
                '}';
    }
}
