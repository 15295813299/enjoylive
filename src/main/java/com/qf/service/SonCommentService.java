package com.qf.service;

import com.qf.pojo.CommentInfo;
import com.qf.pojo.SonComment;

import java.util.List;
import java.util.Map;

public interface SonCommentService {

    public boolean addSonComments(SonComment sonComment);

    public List<SonComment> getSonComments(Map<String, Object> map);

    Integer sonCommentsCount(Integer articleId);
}
