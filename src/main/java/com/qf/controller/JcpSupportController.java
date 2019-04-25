package com.qf.controller;

import com.qf.service.JcpSupportService;
import com.qf.vo.JcpSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class JcpSupportController {
    @Autowired
    JcpSupportService jcpSupportService;

    @RequestMapping(value = "getIsCommonsArticleId", method = RequestMethod.POST)
    public Object getIsCommonsArticleId(@RequestBody(required = false) JcpSupport jcpSupport) throws Exception {
        Integer isCommonsArticleId = jcpSupportService.getIsCommonsArticleId(jcpSupport);
        System.out.println(isCommonsArticleId);
        if (isCommonsArticleId == 0) {
//            jcpSupport.setArticleId(jcpSupport.getArticleId());
//            jcpSupport.setUserInfoId(jcpSupport.getUserInfoId());
            Integer integer = jcpSupportService.insertSupport(jcpSupport);
            System.out.println("插入是否成功" + integer);
            return true;

        } else {
            Integer isCommonsMac = jcpSupportService.getIsCommonsUserInfoId(jcpSupport);
            if (isCommonsMac > 0) {
                return false;
            }

        }
        Integer integer = jcpSupportService.insertSupport(jcpSupport);
        System.out.println("插入是否成功" + integer);
        Integer supportCount = jcpSupportService.getSupportCount(jcpSupport);
        return supportCount;
    }

    @RequestMapping(value ="getSupportCount",method = RequestMethod.POST)
    public Integer getSupportCount(@RequestBody JcpSupport jcpSupport){
        Integer supportCount = jcpSupportService.getSupportCount(jcpSupport);
        return supportCount;
    }
    @RequestMapping(value ="getIsCommonsUserInfoId",method = RequestMethod.POST)
    public Integer getIsCommonsUserInfoId(@RequestBody JcpSupport jcpSupport){
        Integer count = jcpSupportService.getIsCommonsUserInfoId(jcpSupport);
        return count;
    }
}
