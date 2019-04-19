package com.qf.service.imp;

import com.qf.controller.PersonageController;
import com.qf.mapper.PersonageMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.PersonageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonageServiceImp implements PersonageInfoService {
    @Autowired
    PersonageMapper personageMapper;

    public UserInfo getUserById(UserInfo userInfo) {
        return personageMapper.getUserInfoById(userInfo);
    }
}
