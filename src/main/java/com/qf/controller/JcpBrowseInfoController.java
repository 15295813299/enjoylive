package com.qf.controller;

import com.qf.service.JcpBrownselnService;
import com.qf.vo.JcpBrowselnVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JcpBrowseInfoController {
    @Autowired
    JcpBrownselnService jcpBrownselnService;
//  浏览量查询


    @RequestMapping(value = "getIsBrowselnArticleId", method = RequestMethod.POST)
    public Object getIsBrowselnArticleId(@RequestBody(required = false) JcpBrowselnVo jcpBrowselnVo) throws Exception {
//        判断这篇文章是否在浏览表里面
        Integer isCommonsArticleId = jcpBrownselnService.getIsBrowselnArticleId(jcpBrowselnVo);
        System.out.println(isCommonsArticleId);
//        如果不在就新增 用户名和浏览者id 并返回一个true
        if (isCommonsArticleId == 0) {
            Integer integer = jcpBrownselnService.insertBrowselnVo(jcpBrowselnVo);
            System.out.println("插入是否成功" + integer);
            return true;

            //如果存在浏览表里面，就判断登录的用户是否浏览了这篇文章
        } else {
            Integer isCommonsUserInfoId = jcpBrownselnService.getIsBrowselnUserInfoId(jcpBrowselnVo);
//            如果存用户存在就返回一个false；
            if (isCommonsUserInfoId > 0) {
                return false;
            }

        }
//        如果浏览表里面存在并且该用户没有浏览过，就插入，并返回浏览量到前端
        Integer integer = jcpBrownselnService.insertBrowselnVo(jcpBrowselnVo);
        System.out.println("插入是否成功" + integer);
        Integer supportCount = jcpBrownselnService.getBrowselnCount(jcpBrowselnVo);
        return supportCount;
    }

    /***
     *
     * @param jcpBrowselnVo 文章id
     * @return 文章浏览量
     */
    @RequestMapping(value ="getBrowselnCount",method = RequestMethod.POST)
    public Integer getSupportCount(@RequestBody JcpBrowselnVo jcpBrowselnVo){
        Integer BrownselnCount = jcpBrownselnService.getBrowselnCount(jcpBrowselnVo);
        return BrownselnCount;
    }
}
