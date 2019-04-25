package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.CommentInfo;
import com.qf.pojo.SonComment;
import com.qf.service.SonCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SonCommentController {

    @Autowired
    SonCommentService sonCommentService;

    @RequestMapping(value = "addSonComments" ,method = RequestMethod.POST)
    public boolean addSonComments(@RequestBody SonComment sonComment){
        return sonCommentService.addSonComments(sonComment);
    }


    @RequestMapping(value = "getSonComments", method = RequestMethod.GET)
    public PageInfo<SonComment> getComments(@RequestParam Integer articleId,@RequestParam Integer commentId, @RequestParam Integer page, @RequestParam Integer pageSize) {
        System.out.println(articleId+"/"+commentId+"/"+page+"/"+pageSize);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("articleId",articleId);
        map.put("commentId",commentId);
        PageHelper.startPage(page,pageSize);
        List<SonComment> sonComments = sonCommentService.getSonComments(map);
        PageInfo<SonComment> sonCommentPageInfo = new PageInfo<SonComment>(sonComments);
        System.out.println(sonCommentPageInfo);
        return sonCommentPageInfo;
    }
}
