package com.qf.mapper;

import com.qf.pojo.LevelInfo;
import com.qf.pojo.UserInfo;

public interface LevelMapper {

    public LevelInfo getLevel(UserInfo userInfo);

    Integer giveDefaultLevelScore(String username);
}
