package com.qf.controller;

import com.qf.pojo.LevelInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LevelController {
    @Autowired
    LevelService levelService;


    /**
     * 获取等级
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "getLevel", method = RequestMethod.POST)
    public Object getLevel(@RequestBody UserInfo userInfo){
        return levelService.getLevel(userInfo);
    }

}
