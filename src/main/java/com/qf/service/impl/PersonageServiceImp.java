package com.qf.service.impl;

import com.qf.controller.PersonageController;
import com.qf.dto.LoginInfoDto;
import com.qf.dto.PersonageDto;
import com.qf.mapper.PersonageMapper;
import com.qf.pojo.Category;
import com.qf.pojo.UserInfo;
import com.qf.service.PersonageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class PersonageServiceImp implements PersonageInfoService {
    @Autowired
    PersonageMapper personageMapper;


    public List<Category> getProfessionById(UserInfo userInfo) {
        return personageMapper.getProfessionById(userInfo);
    }

    /**
     * 获取访问量及点赞
     * @param userInfo
     * @return
     */
    public PersonageDto getCountVisit(UserInfo userInfo) {
        return personageMapper.getCountVisit(userInfo);
    }

    /**
     * 获取粉丝
     * @param userInfo
     * @return
     */
    public List<LoginInfoDto> getFansById(UserInfo userInfo) {
        return personageMapper.getFansById(userInfo);
    }

    /**
     * 上传头像
     * @param dropzFile
     * @param request
     * @return
     */
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String fileName = dropzFile.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath("/upload");
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            dropzFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.put("fileName", file.getName());
        return result;
    }

    public int upPersonageById(UserInfo userInfo) {
        return personageMapper.upPersonageById(userInfo);
    }

    public UserInfo rePassword(UserInfo userInfo) {
        return personageMapper.rePassword(userInfo);
    }

    public Boolean coverSession(UserInfo userInfo, HttpSession session) {
        UserInfo userInfo1 = personageMapper.reUserInfo(userInfo);
        if (userInfo1!=null){
            session.setAttribute("loginInfo",userInfo1);
            return true;
        }
        return false;
    }

    public UserInfo reUserInfo(UserInfo userInfo) {
        return personageMapper.reUserInfo(userInfo);
    }

    public List<Category> getCategory(Category category) {
        return personageMapper.getCategory(category);
    }

    public int upAdept(UserInfo userInfo) {
        return personageMapper.upAdept(userInfo);
    }

    public int setAdept(PersonageDto personageDto) {
        return personageMapper.setAdept(personageDto);
    }

    @Override
    public Integer updateScore(PersonageDto personageDto) {
        return personageMapper.updateScore(personageDto);
    }
}
