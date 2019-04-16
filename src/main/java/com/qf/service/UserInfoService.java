package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

public interface UserInfoService {
    Integer insertRegister(UserInfoVo userInfoVo);
    Integer checkUserName(String username);
    Boolean LoginCheck(UserInfoVo userInfoVo, HttpSession session);
 }
