package com.qf.controller;

import com.qf.service.ViolateService;
import com.qf.vo.ViolateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViolateController {
    @Autowired
    ViolateService violateService;

    /**
     * 添加举报信息
     * @param violateVo
     * @return
     */
    @RequestMapping(value = "AddViolate",method = RequestMethod.POST)
    public String AddViolateContext(@RequestBody(required = false) ViolateVo violateVo){
        Boolean flag = this.violateService.AddViolateContext(violateVo);
        System.out.println(violateVo);
        return flag.toString();
    }
}
