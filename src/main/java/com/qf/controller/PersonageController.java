package com.qf.controller;

import com.qf.dto.PersonageDto;
import com.qf.pojo.Category;
import com.qf.pojo.UserInfo;
import com.qf.service.PersonageInfoService;
import com.qf.tools.Md5Utils;
import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class PersonageController {
    @Autowired
    PersonageInfoService personageInfoService;



    //获取用户擅长领域
    @RequestMapping(value ="getProfessionById",method = RequestMethod.POST)
    public Object getProfessionById(@RequestBody UserInfo userInfo){
        return personageInfoService.getProfessionById(userInfo);
    }

    /**
     * 获取游览量和点赞
     * @param userInfo
     * @return
     */
    @RequestMapping(value ="getCountVisit",method = RequestMethod.POST)
    public Object getCountVisit(@RequestBody UserInfo userInfo){
        return personageInfoService.getCountVisit(userInfo);
    }


    /**
     * 获取粉丝
     * @param userInfo
     * @return
     */
   @RequestMapping(value ="getFansById",method = RequestMethod.POST)
   public Object getFansById(@RequestBody UserInfo userInfo){
       return personageInfoService.getFansById(userInfo);
    }


    /**
     * 上传头像
     * @param
     * @return
     */
    @RequestMapping(value ="uploadHead",method = RequestMethod.POST)
    public Object upload(MultipartFile dropzFile, HttpServletRequest request){
        Map<String, Object> result= personageInfoService.upload(dropzFile,request);
        return result;
    }

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    @RequestMapping(value ="upPersonageById",method = RequestMethod.POST)
    public Object upPersonageById(@RequestBody UserInfo userInfo){
        if (userInfo.getPassword()!=null){
            String password = userInfo.getPassword();
            for (int i = 0; i < 3; i++) {
                password = Md5Utils.encodePassword(password+password);
            }
        }
       return personageInfoService.upPersonageById(userInfo);
    }

    /**
     * 覆盖session
     * @param userInfo
     * @param session
     * @return
     */
    @RequestMapping(value ="coverSession",method = RequestMethod.POST)
    public Object coverSession(@RequestBody UserInfo userInfo,HttpSession session){
        return personageInfoService.coverSession(userInfo,session);
    }

    /**
     * 密码匹配
     * @param userInfo
     * @return
     */
    @RequestMapping(value ="rePassword",method = RequestMethod.POST)
    public Object rePassword(@RequestBody UserInfo userInfo){
        String password = userInfo.getPassword();
        for (int i = 0; i < 3; i++) {
            password = Md5Utils.encodePassword(password+password);
        }
        userInfo.setPassword(password);
        UserInfo userInfo1 = personageInfoService.rePassword(userInfo);
        if (userInfo1==null){
            return false;
        }
        return true;
    }

    /**
     * 信息匹配
     * @param userInfo
     * @return
     */
    @RequestMapping(value ="reUserInfo",method = RequestMethod.POST)
    public Object reUserInfo(@RequestBody UserInfo userInfo){
       return personageInfoService.reUserInfo(userInfo);
    }

    /**
     * 获取分类类型
     * @param category
     * @return
     */
    @RequestMapping(value ="getCategory",method = RequestMethod.POST)
    public Object getCategory(@RequestBody(required = false) Category category){
        return personageInfoService.getCategory(category);
    }

    /**
     * 修改个人领域
     * @param userInfo
     * @return
     */
    @RequestMapping(value ="upAdept",method = RequestMethod.POST)
    public Object upAdept(@RequestBody UserInfo userInfo){
        return personageInfoService.upAdept(userInfo);
    }

    /**
     * 添加个人领域
     * @param personageDto
     * @return
     */
    @RequestMapping(value ="setAdept",method = RequestMethod.POST)
    public Object setAdept(@RequestBody PersonageDto personageDto){
        return personageInfoService.setAdept(personageDto);
    }
   @RequestMapping(value = "updateScore",method = RequestMethod.POST)
   public Object updateScore(@RequestBody PersonageDto personageDto){
        return personageInfoService.updateScore(personageDto);
   }

}
