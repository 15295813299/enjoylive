package com.qf.service.impl;

import com.qf.mapper.JxCollectMapper;
import com.qf.pojo.JxCollect;
import com.qf.service.JxICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sin
 * @date 2019/4/25/10:29
 */
@Service
public class JxCollectServiceImpl implements JxICollectService {
    private final JxCollectMapper jxCollectMapper;

    @Autowired
    public JxCollectServiceImpl(JxCollectMapper jxCollectMapper) {
        this.jxCollectMapper = jxCollectMapper;
    }

    @Override
    public List<JxCollect> getCollectByUserId(JxCollect jxCollect) {
        return jxCollectMapper.getCollectByUserId(jxCollect);
    }

    @Override
    public Boolean del(JxCollect jxCollect) {
        if (jxCollectMapper.del(jxCollect) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Boolean add(JxCollect jxCollect) {
        if (jxCollectMapper.change(jxCollect) == 0) {
            if (jxCollectMapper.add(jxCollect) == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public List<Integer> getArticleIdByUserId(int userInfoId) {
        return jxCollectMapper.getArticleIdByUserId(userInfoId);
    }
}
