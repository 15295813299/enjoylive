package com.qf.mapper;

import com.qf.vo.UserInfoVo;

public interface UserInfoMapper {
    Integer insertRegister(UserInfoVo userInfoVo);
    Integer checkUserName(String username);
}
