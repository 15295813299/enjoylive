package com.qf.controller;

import com.qf.pojo.UserInfo;
import com.qf.service.PersonageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonageController {
    @Autowired
    PersonageInfoService personageInfoService;



    @RequestMapping(value ="getUserInfoById",method = RequestMethod.POST)
    public Object getUserInfoById(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return personageInfoService.getUserById(userInfo);
    }

}
