package com.qf.service.imp;

import com.qf.mapper.*;
import com.qf.service.JxIArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

/**
 * @author Sin
 * @date 2019/4/17/8:59
 */
@Service
public class JxArticleInfoServiceImpl implements JxIArticleService {

    private final JxArticleInfoMapper jxArticleInfoMapper;

    @Autowired
    public JxArticleInfoServiceImpl(JxArticleInfoMapper jxArticleInfoMapper) {
        this.jxArticleInfoMapper = jxArticleInfoMapper;
    }

    @Override
    public Map getInfoMap(int articleId) {
        int int1 = jxArticleInfoMapper.getSupportCountByArticleId(articleId);
        int int2 = jxArticleInfoMapper.getBrowseCountByArticleId(articleId);
        int int3 = jxArticleInfoMapper.getCommentCountByArticleId(articleId);
        Map map1 = jxArticleInfoMapper.getPotoPathByArticleId(articleId);
        Map map2 = jxArticleInfoMapper.getInfo(articleId);
        Map map3 = jxArticleInfoMapper.getCategoryNameByArticleId(articleId);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("support", int1);
        hashMap.put("browse", int2);
        hashMap.put("comment", int3);
        hashMap.put("categoryName", map3 == null ? null : map3.get("categoryName"));
        hashMap.put("potoPath", map1 == null ? null : map1.get("potoPath"));
        hashMap.put("username", map2 == null ? null : map2.get("username"));
        hashMap.put("headPath", map2 == null ? null : map2.get("headPath"));
        hashMap.put("title", map2 == null ? null : map2.get("title"));
        // System.out.println(maps);
        return hashMap;
    }

    @Override
    public int[] getArticleIdByCategoryName(String categoryName) {
        System.out.println(categoryName);
        int[] ids = jxArticleInfoMapper.getArticleIdByCategoryName(categoryName);
        System.out.println(Arrays.toString(ids));
        return ids;
    }

    @Override
    public int[] getIdBySupport() {
        return jxArticleInfoMapper.getIdBySupport();
    }

    @Override
    public int[] getIdByBrowse() {
        return jxArticleInfoMapper.getIdByBrowse();
    }

    @Override
    public int[] getIdByComment() {
        return jxArticleInfoMapper.getIdByComment();
    }

    @Override
    public int[] getIdByTime() {
        return jxArticleInfoMapper.getIdByTime();
    }

    @Override
    public int[] getIdByTimestamp(int dayBefore) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, dayBefore);
        Date date = calendar.getTime();
        Timestamp timestamp = new Timestamp(date.getTime());
        return jxArticleInfoMapper.getIdByTimestamp(timestamp);
    }

    @Override
    public int[] getIdByTitleDim(String test) {
        return jxArticleInfoMapper.getIdByTitleDim(test);
    }

    @Override
    public void checkHotTag(String text) {
        int i = jxArticleInfoMapper.increaseTagTotalByName(text);
        if (i==0){
            jxArticleInfoMapper.addTag(text);
        }
    }
}
