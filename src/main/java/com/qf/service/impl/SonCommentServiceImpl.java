package com.qf.service.impl;

import com.qf.mapper.SonCommentMapper;
import com.qf.pojo.CommentInfo;
import com.qf.pojo.SonComment;
import com.qf.service.SonCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SonCommentServiceImpl implements SonCommentService {

    @Autowired
    SonCommentMapper sonCommentMapper;

    public boolean addSonComments(SonComment sonComment) {
        Integer integer = sonCommentMapper.addSonComments(sonComment);
        if(integer>0){
            return true;
        }else {
            return false;
        }
    }

    public List<SonComment> getSonComments(Map<String,Object> map) {
        return sonCommentMapper.getSonComments(map);

    }

    @Override
    public Integer sonCommentsCount(Integer articleId) {
        return sonCommentMapper.sonCommentsCount(articleId);
    }
}
