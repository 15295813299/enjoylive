package com.qf.service.impl;

import com.qf.mapper.JcpSupportMapper;
import com.qf.service.JcpSupportService;
import com.qf.vo.JcpSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JcpSupportsServiceImpl implements JcpSupportService {
    @Autowired
    JcpSupportMapper jcpSupportMapper;

    public Integer getIsCommonsArticleId(JcpSupport jcpSupport) {
        return jcpSupportMapper.getIsCommonsArticleId(jcpSupport);
    }

    public Integer insertSupport(JcpSupport jcpSupport) {
        return jcpSupportMapper.insertSupport(jcpSupport);
    }

    public Integer getIsCommonsUserInfoId(JcpSupport jcpSupport) {
        return jcpSupportMapper.getIsCommonsUserInfoId(jcpSupport);
    }

    public Integer getSupportCount(JcpSupport jcpSupport) {
        return jcpSupportMapper.getSupportCount(jcpSupport);
    }
}
