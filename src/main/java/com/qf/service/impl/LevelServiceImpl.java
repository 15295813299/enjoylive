package com.qf.service.impl;

import com.qf.mapper.LevelMapper;
import com.qf.pojo.LevelInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelMapper levelMapper;


    public int getLevel(UserInfo userInfo) {
        LevelInfo level = levelMapper.getLevel(userInfo);
        long lvScore = level.getLvScore();
        long fen=50;
        for (int i =1;i<120;i++){
            fen*=1.6;
            if (lvScore<fen){
                return i;
            }
        }
        return 0;
    }

    @Override
    public Integer giveDefaultLevelScore(String username) {
        return levelMapper.giveDefaultLevelScore( username);
    }
}
