package com.qf.service;

import com.qf.vo.UserInfoVo;

public interface UserInfoService {
    Integer insertRegister(UserInfoVo userInfoVo);
    Integer checkUserName(String username);
 }
