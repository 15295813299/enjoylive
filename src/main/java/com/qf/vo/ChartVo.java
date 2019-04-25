package com.qf.vo;

import java.util.List;
import java.util.Map;

public class ChartVo {
    private int userInfoId;
    private List<Integer> mai;

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public List<Integer> getMai() {
        return mai;
    }

    public void setMai(List<Integer> mai) {
        this.mai = mai;
    }

    @Override
    public String toString() {
        return "ChartVo{" +
                "userInfoId=" + userInfoId +
                ", mai=" + mai +
                '}';
    }
}
