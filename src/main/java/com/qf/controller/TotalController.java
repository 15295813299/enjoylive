package com.qf.controller;


import com.qf.pojo.Total;
import com.qf.service.TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TotalController {
    @Autowired
    TotalService totalService;



    @RequestMapping(value = "upTotalById",method = RequestMethod.POST)
    public Object upTotalById(@RequestBody Total total, HttpServletRequest httpServletRequest){
        Boolean aBoolean = totalService.upTotalById(total,httpServletRequest);
        return aBoolean;
    }


}
