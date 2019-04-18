package com.qf.service.imp;

import com.qf.service.JxIArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-service.xml", "classpath:spring-mybatis.xml"})
public class JxArticleInfoServiceImplTest {
    @Autowired
    JxIArticleService jxIArticleService;
    @Test
    public void getInfoMap() {
        Map infoMap = jxIArticleService.getInfoMap(1);
        System.out.println(infoMap);
    }

    @Test
    public void getArticleIdByCategoryName() {
        int[] ids = jxIArticleService.getArticleIdByCategoryName("游戏");
        System.out.println(Arrays.toString(ids));

    }

    @Test
    public void getIdBySupport() {
        int[] ids = jxIArticleService.getIdBySupport();
        System.out.println(Arrays.toString(ids));
    }
}