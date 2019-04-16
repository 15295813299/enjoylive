package com.qf.mapper;

import com.qf.dto.LoginInfoDto;
import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

public interface UserInfoMapper {
    Integer insertRegister(UserInfoVo userInfoVo);
    Integer checkUserName(String username);
    LoginInfoDto LoginCheck(UserInfoVo userInfoVo);
}
