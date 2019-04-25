package com.qf.service;

import com.qf.pojo.LevelInfo;
import com.qf.pojo.UserInfo;

public interface LevelService {
    public int getLevel(UserInfo userInfo);

    Integer giveDefaultLevelScore(String username);
}
