package com.qf.mapper;


import com.qf.dto.LoginInfoDto;
import com.qf.dto.PersonageDto;
import com.qf.pojo.Category;
import com.qf.pojo.UserInfo;

import java.util.List;

public interface PersonageMapper {


    public List<Category> getProfessionById(UserInfo userInfo);

    public PersonageDto getCountVisit(UserInfo userInfo);

    public List<LoginInfoDto> getFansById(UserInfo userInfo);

    public int upPersonageById(UserInfo userInfo);

    public UserInfo rePassword(UserInfo userInfo);

    public UserInfo reUserInfo(UserInfo userInfo);

    public List<Category> getCategory(Category category);

    public int upAdept(UserInfo userInfo);

    public int setAdept(PersonageDto personageDto);

    Integer updateScore(PersonageDto personageDto);
}
