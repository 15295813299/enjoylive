package com.qf.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.CommentInfo;
import com.qf.service.CommentInfoService;
import com.qf.service.SonCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentInfoController {
    @Autowired
    CommentInfoService commentInfoService;
    @Autowired
    SonCommentService sonCommentService;

    @RequestMapping(value = "getComments", method = RequestMethod.GET)
    public PageInfo<CommentInfo> getComments(@RequestParam Integer articleId,
                                             @RequestParam Integer page, @RequestParam Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<CommentInfo> comments = commentInfoService.getComments(articleId);
        return new PageInfo<CommentInfo>(comments);
    }

    @RequestMapping(value = "addComments", method = RequestMethod.POST)
    public boolean addComments(@RequestBody CommentInfo commentInfo) {
        return commentInfoService.addComments(commentInfo);
    }
    @RequestMapping(value = "getAllComments",method = RequestMethod.GET)
    public Integer getAllComments(@RequestParam Integer articleId){
        Integer count = commentInfoService.commentsCount(articleId);
        Integer sonCount = sonCommentService.sonCommentsCount(articleId);
       Integer totalCount = count+sonCount;
        return totalCount;
    }
}
