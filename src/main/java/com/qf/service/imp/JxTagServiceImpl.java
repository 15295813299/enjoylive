package com.qf.service.imp;

import com.qf.mapper.JxTagMapper;
import com.qf.pojo.JxTag;
import com.qf.service.JxITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sin
 * @date 2019/4/16/20:09
 */
@Service
public class JxTagServiceImpl implements JxITagService {
    private final JxTagMapper jxTagMapper;

    @Autowired
    public JxTagServiceImpl(JxTagMapper jxTagMapper) {
        this.jxTagMapper = jxTagMapper;
    }

    @Override
    public List<JxTag> getPage(int pageNum, int pageSize) {
        return jxTagMapper.getPage(pageNum * pageSize, pageSize);
    }

    @Override
    public int[] getArticleInfoIds(String[] tagNames) {
        List<String> list = new ArrayList<>(Arrays.asList(tagNames));
        return jxTagMapper.getArticleInfoIds(list);
    }
}
