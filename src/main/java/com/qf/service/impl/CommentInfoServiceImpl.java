package com.qf.service.impl;

import com.qf.mapper.CommentInfoMapper;
import com.qf.pojo.CommentInfo;
import com.qf.service.CommentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentInfoServiceImpl implements CommentInfoService {

    @Autowired
    CommentInfoMapper commentInfoMapper;

    /**
     * 获取一级评论
     * @param articleId 文章id
     * @return 返回一级评论的属性和评论人昵称
     */
    public List<CommentInfo> getComments(Integer articleId) {
        return commentInfoMapper.getComments(articleId);
    }

    /**
     * 添加主评论
     * @param commentInfo 评论信息
     * @return
     */
    public boolean addComments(CommentInfo commentInfo) {
        Integer integer = commentInfoMapper.addComments(commentInfo);
        if(integer>0){
            return true;
        }else {
            return false;
        }
    }

    /***
     *
     * @param articleId 文章id
     * @return 评论数量
     */
    @Override
    public Integer commentsCount(Integer articleId) {
        return commentInfoMapper.commentsCount(articleId);
    }
}
