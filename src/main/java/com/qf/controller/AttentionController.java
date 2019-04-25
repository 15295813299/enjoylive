package com.qf.controller;

import com.qf.dto.MyAttention;
import com.qf.pojo.Attention;
import com.qf.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttentionController {

    @Autowired
    AttentionService attentionService;

    @RequestMapping(value = "addAttention",method = RequestMethod.POST)
    public boolean addFansInfo(@RequestBody Attention attention){
        return attentionService.addAttention(attention);
    }

    @RequestMapping(value = "deleteAttention",method = RequestMethod.POST)
    public boolean deleteAttention(@RequestBody Attention attention){
        return attentionService.deleteAttention(attention);
    }

    @RequestMapping(value = "getAttention",method = RequestMethod.GET)
    public List<MyAttention> getAttention(@RequestParam Integer userInfoId){
        return attentionService.getAttention(userInfoId);
    }

    @RequestMapping(value = "judgeAttention",method = RequestMethod.POST)
    public boolean judgeAttention(@RequestBody Attention attention){
        return attentionService.judgeAttention(attention);
    }
}
