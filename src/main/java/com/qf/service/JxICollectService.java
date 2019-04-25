package com.qf.service;

import com.qf.pojo.JxCollect;

import java.util.List;

/**
 * @author Sin
 * @date 2019/4/25/10:29
 */
public interface JxICollectService {
    List<JxCollect> getCollectByUserId(JxCollect jxCollect);

    Boolean del(JxCollect jxCollect);

    Boolean add(JxCollect jxCollect);

    List<Integer> getArticleIdByUserId(int userInfoId);
}
