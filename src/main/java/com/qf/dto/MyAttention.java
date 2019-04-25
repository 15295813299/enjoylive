package com.qf.dto;

public class MyAttention {
   private int userInfoId;
   private String name;
   private String headPath;
   private Integer browseInfoCount;
   private Integer supportCount;
   private Integer fansInfoCount;

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    public Integer getBrowseInfoCount() {
        return browseInfoCount;
    }

    public void setBrowseInfoCount(Integer browseInfoCount) {
        this.browseInfoCount = browseInfoCount;
    }

    public Integer getSupportCount() {
        return supportCount;
    }

    public void setSupportCount(Integer supportCount) {
        this.supportCount = supportCount;
    }

    public Integer getFansInfoCount() {
        return fansInfoCount;
    }

    public void setFansInfoCount(Integer fansInfoCount) {
        this.fansInfoCount = fansInfoCount;
    }

    @Override
    public String toString() {
        return "MyAttention{" +
                "userInfoId=" + userInfoId +
                ", name=" + name +
                ", headPath='" + headPath + '\'' +
                ", browseInfoCount=" + browseInfoCount +
                ", supportCount=" + supportCount +
                ", fansInfoCount=" + fansInfoCount +
                '}';
    }
}
