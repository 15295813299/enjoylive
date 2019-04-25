package com.qf.service;

import com.qf.vo.JcpSupport;

public interface JcpSupportService {

    Integer getIsCommonsArticleId(JcpSupport jcpSupport);
    Integer insertSupport(JcpSupport jcpSupport);
    Integer getIsCommonsUserInfoId(JcpSupport jcpSupport);
    Integer getSupportCount(JcpSupport jcpSupport);
}
