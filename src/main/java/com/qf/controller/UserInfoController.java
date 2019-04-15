package com.qf.controller;


import com.qf.service.UserInfoService;
import com.qf.tools.CodeUtils;
import com.qf.tools.MailUtils;
import com.qf.tools.Md5Utils;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController{
@Autowired
    UserInfoService userInfoService;

    @RequestMapping(value ="insertRegister",method = RequestMethod.POST)
   public Object insertRegister(@RequestBody(required = false) UserInfoVo userInfoVo){
        userInfoVo.setPassword(Md5Utils.encodePassword(userInfoVo.getPassword()));
        Integer count = userInfoService.insertRegister(userInfoVo);
       return count;
   }
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
   @RequestMapping(value = "checkEmail",method = RequestMethod.POST)
   public Object checkEmail(@RequestParam String email){
       String code = CodeUtils.getCode();//获取邮箱验证码
       new Thread(new MailUtils(email,code)).start();
       return code;
   }
}
