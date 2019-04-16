package com.qf.controller;


import com.qf.service.UserInfoService;
import com.qf.tools.CodeUtils;
import com.qf.tools.MailUtils;
import com.qf.tools.Md5Utils;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class UserInfoController{
@Autowired
    UserInfoService userInfoService;

    /**
     * 注册用户
     * @param userInfoVo
     * @return
     */
    @RequestMapping(value ="insertRegister",method = RequestMethod.POST)
   public Object insertRegister(@RequestBody(required = false) UserInfoVo userInfoVo){
        String password = userInfoVo.getPassword();
        for (int i = 0; i < 3; i++) {
            password = Md5Utils.encodePassword(password+password);
        }
        userInfoVo.setPassword(password);
        Integer count = userInfoService.insertRegister(userInfoVo);
       return count;
   }

    /**
     * 登录验证
     * @param userInfoVo
     * @return
     */
    @RequestMapping(value ="LoginCheck",method = RequestMethod.POST)
    public Boolean LoginCheck(@RequestBody(required = false) UserInfoVo userInfoVo, HttpSession session){
        String password = userInfoVo.getPassword();
        for (int i = 0; i < 3; i++) {
            password = Md5Utils.encodePassword(password+password);
        }
        userInfoVo.setPassword(password);

        return userInfoService.LoginCheck(userInfoVo,session);
    }

    /**
     * 验证用户名是否被注册
     * @param username
     * @return
     */
    @RequestMapping(value ="checkUserName",method = RequestMethod.POST)
   public Object checkUserName(@RequestParam String username){
        System.out.println("用户名为"+username);
       Integer count = userInfoService.checkUserName(username);
        System.out.println("查到的为"+count);
       if(count>=1){
           return false;
       }
       return true;
   }

    /**
     * 邮箱验证码
     * @param email
     * @return
     */
   @RequestMapping(value = "checkEmail",method = RequestMethod.POST)
   public Object checkEmail(@RequestParam String email){
       String code = CodeUtils.getCode();//获取邮箱验证码
       new Thread(new MailUtils(email,code)).start();
       return code;
   }

    /**
     * 获取session里 的用户登录信息（包括头像跟用户账号）
     * @param session
     * @return
     */
   @RequestMapping(value = "getSessionLoginInfo",method = RequestMethod.GET)
   public Object getSessionLoginInfo(HttpSession session){
       return session.getAttribute("loginInfo");
   }



    @RequestMapping(value = "delSessionLoginInfo",method = RequestMethod.GET)
    public boolean delSessionLoginInfo(HttpSession session){
        session.removeAttribute("loginInfo");
        return true;
    }
}
