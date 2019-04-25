package com.qf.mapper;

import com.qf.pojo.JxCollect;

import java.util.List;

/**
 * @author Sin
 * @date 2019/4/25/10:10
 */
public interface JxCollectMapper {
    List<JxCollect> getCollectByUserId(JxCollect jxCollect);

    int change(JxCollect jxCollect);

    int add(JxCollect jxCollect);

    int del(JxCollect jxCollect);

    List<Integer> getArticleIdByUserId(int userInfoId);
}
