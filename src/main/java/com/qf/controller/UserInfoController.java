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
}
