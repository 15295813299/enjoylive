package com.qf.service.impl;

import com.qf.dto.MyAttention;
import com.qf.mapper.AttentionMapper;
import com.qf.pojo.Attention;
import com.qf.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttentionServiceImpl implements AttentionService {

    @Autowired
    AttentionMapper attentionMapper;

    @Override
    public boolean addAttention(Attention attention) {
        Integer integer = attentionMapper.addAttention(attention);
        if(integer!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteAttention(Attention attention) {
        Integer integer = attentionMapper.deleteAttention(attention);
        if(integer!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<MyAttention> getAttention(Integer integer) {
        List<MyAttention> attentionList = attentionMapper.getAttention1(integer);
        System.out.println(attentionList);
        for (MyAttention m:
             attentionList) {
            m.setBrowseInfoCount(attentionMapper.getAttention2(m.getUserInfoId()));
            m.setSupportCount(attentionMapper.getAttention3(m.getUserInfoId()));
            m.setFansInfoCount(attentionMapper.getAttention4(m.getUserInfoId()));
        }
        return attentionList;
    }

    @Override
    public boolean judgeAttention(Attention attention) {
        Integer integer = attentionMapper.judgeAttention(attention);
        if(integer!=0){
            return true;
        }else{
            return false;
        }
    }

}
