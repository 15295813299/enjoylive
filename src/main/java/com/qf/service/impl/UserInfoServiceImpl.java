package com.qf.service.impl;

import com.qf.dto.LoginInfoDto;
import com.qf.mapper.LevelMapper;
import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.LevelInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    LevelMapper levelMapper;
    public Integer insertRegister(UserInfoVo userInfoVo) {
        Integer  count = userInfoMapper.insertRegister(userInfoVo);
        if(count>0){
          levelMapper.giveDefaultLevelScore(userInfoVo.getUsername());
        }
        return count;
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
