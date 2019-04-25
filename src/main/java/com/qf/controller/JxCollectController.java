package com.qf.controller;

import com.qf.dto.LoginInfoDto;
import com.qf.pojo.JxCollect;
import com.qf.pojo.UserInfo;
import com.qf.service.JxICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Sin
 * @date 2019/4/25/10:30
 */
@RestController
@RequestMapping("collect")
public class JxCollectController {
    private final JxICollectService jxICollectService;

    @Autowired
    public JxCollectController(JxICollectService jxICollectService) {
        this.jxICollectService = jxICollectService;
    }

    @RequestMapping("getCollectByUserId")
    public Object getCollectByUserId(@RequestParam int articleId, HttpSession httpSession) {
        LoginInfoDto loginInfoDto = (LoginInfoDto) httpSession.getAttribute("loginInfo");
        JxCollect jxCollect = new JxCollect();
        if (loginInfoDto==null){
            return "未登陆";
        }
        //System.out.println(loginInfoDto.getUserInfoId());
        jxCollect.setUserInfoId((int)loginInfoDto.getUserInfoId());
        jxCollect.setArticleId(articleId);
        return jxICollectService.getCollectByUserId(jxCollect).size() != 0;
    }

    @RequestMapping("del")
    public Object del(@RequestParam int articleId,HttpSession httpSession){
        LoginInfoDto loginInfoDto = (LoginInfoDto) httpSession.getAttribute("loginInfo");
        JxCollect jxCollect = new JxCollect();
        if (loginInfoDto==null){
            return "未登陆";
        }
        //System.out.println(loginInfoDto.getUserInfoId());
        jxCollect.setUserInfoId((int)loginInfoDto.getUserInfoId());
        jxCollect.setArticleId(articleId);
        return jxICollectService.del(jxCollect);
    }

    @RequestMapping("add")
    public Object add(@RequestParam int articleId,HttpSession httpSession){
        LoginInfoDto loginInfoDto = (LoginInfoDto) httpSession.getAttribute("loginInfo");
        JxCollect jxCollect = new JxCollect();
        if (loginInfoDto==null){
            return "未登陆";
        }
        //System.out.println(loginInfoDto.getUserInfoId());
        jxCollect.setUserInfoId((int)loginInfoDto.getUserInfoId());
        jxCollect.setArticleId(articleId);
        return jxICollectService.add(jxCollect);
    }

    @RequestMapping("getArticleIdByUserId")
    public Object getArticleIdByUserId(HttpSession httpSession){
        LoginInfoDto loginInfoDto = (LoginInfoDto) httpSession.getAttribute("loginInfo");
        if (loginInfoDto==null){
            return "未登陆";
        }
        return jxICollectService.getArticleIdByUserId((int)loginInfoDto.getUserInfoId());
    }
}
