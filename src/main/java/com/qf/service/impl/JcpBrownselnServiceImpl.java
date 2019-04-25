package com.qf.service.impl;

import com.qf.mapper.JcpBrowselnMapper;
import com.qf.service.JcpBrownselnService;
import com.qf.vo.JcpBrowselnVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JcpBrownselnServiceImpl implements JcpBrownselnService {
    @Autowired
    JcpBrowselnMapper jcpBrowselnMapper;
    public Integer getIsBrowselnArticleId(JcpBrowselnVo jcpBrowselnVo) {
        return jcpBrowselnMapper.getIsBrowselnArticleId(jcpBrowselnVo);
    }

    public Integer insertBrowselnVo(JcpBrowselnVo jcpBrowselnVo) {
        return jcpBrowselnMapper.insertBrowselnVo(jcpBrowselnVo);
    }

    public Integer getIsBrowselnUserInfoId(JcpBrowselnVo jcpBrowselnVo) {
        return jcpBrowselnMapper.getIsBrowselnUserInfoId(jcpBrowselnVo);
    }

    public Integer getBrowselnCount(JcpBrowselnVo jcpBrowselnVo) {
        return jcpBrowselnMapper.getBrowselnCount(jcpBrowselnVo);
    }
}
