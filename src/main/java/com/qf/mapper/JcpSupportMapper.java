package com.qf.mapper;

import com.qf.vo.JcpSupport;

public interface JcpSupportMapper {
    Integer getIsCommonsArticleId(JcpSupport jcpSupport);
    Integer insertSupport(JcpSupport jcpSupport);
    Integer getIsCommonsUserInfoId(JcpSupport jcpSupport);
    Integer getSupportCount(JcpSupport jcpSupport);
}
