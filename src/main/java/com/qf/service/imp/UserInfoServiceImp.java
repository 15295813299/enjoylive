package com.qf.service.imp;

import com.qf.mapper.UserInfoMapper;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImp implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    public Integer insertRegister(UserInfoVo userInfoVo) {
       return userInfoMapper.insertRegister(userInfoVo);
    }

    public Integer checkUserName(String username) {
        return userInfoMapper.checkUserName(username);
    }
}
