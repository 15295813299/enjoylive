package com.qf.service.imp;

import com.qf.pojo.JxTag;
import com.qf.service.JxITagService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-service.xml", "classpath:spring-mybatis.xml"})
public class JxTagServiceImplTest {
    @Autowired
    private JxITagService jxITagService;

    @Test
    public void getPage() {
        List<JxTag> jxTagList = jxITagService.getPage(0, 10);
        System.out.println(jxTagList);
    }

    @Test
    public void getArticleInfoIds() {
        String[] strings = new String[2];
        strings[0] = "%"+"手"+"%";
        strings[1] = "%"+"诺"+"%";
        int[] articleInfoIds = jxITagService.getArticleInfoIds(strings);
        System.out.println(Arrays.toString(articleInfoIds));
    }
}