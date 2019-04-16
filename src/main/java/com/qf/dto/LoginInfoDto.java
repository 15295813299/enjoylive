package com.qf.dto;

/**
 * 用户登录信息
 */
public class LoginInfoDto {
    private String username;
    private String headPath;
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoginInfoDto{" +
                "username='" + username + '\'' +
                ", headPath='" + headPath + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
