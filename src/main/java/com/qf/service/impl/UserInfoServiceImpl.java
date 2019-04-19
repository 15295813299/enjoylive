package com.qf.service.impl;

import com.qf.dto.LoginInfoDto;
import com.qf.mapper.UserInfoMapper;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    public Integer insertRegister(UserInfoVo userInfoVo) {
       return userInfoMapper.insertRegister(userInfoVo);
    }

    public Integer checkUserName(String username) {
        return userInfoMapper.checkUserName(username);
    }

    public Boolean LoginCheck(UserInfoVo userInfoVo, HttpSession session){
        LoginInfoDto userInfo = userInfoMapper.LoginCheck(userInfoVo);
        if (userInfo!=null){
            //用户登录信息存到session中，通过ajax调用
            session.setAttribute("loginInfo",userInfo);
            return true;
        }
        return false;
    }
}
