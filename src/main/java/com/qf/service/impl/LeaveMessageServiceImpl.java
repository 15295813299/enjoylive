package com.qf.service.impl;

import com.qf.dto.LeaveMessageDto;
import com.qf.mapper.LeaveMessageMapper;
import com.qf.pojo.LeaveMessage;
import com.qf.service.LeaveMessageService;
import com.qf.vo.LeaveMessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveMessageServiceImpl implements LeaveMessageService {
    @Autowired
    LeaveMessageMapper leaveMessageMapper;
    public boolean addLeaveMessageByUserInfoId(LeaveMessageVo leaveMessageVo) {
        Integer count = this.leaveMessageMapper.addLeaveMessageByUserInfoId(leaveMessageVo);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    public List<LeaveMessageDto> selectLeaveMessageByUserInfoId(Integer leaveMessageToUser) {
        return this.leaveMessageMapper.selectLeaveMessageByUserInfoId(leaveMessageToUser);
    }

    public Integer selectLeaveMessageCountIfNoRead(LeaveMessage leaveMessageToUser) {
        return this.leaveMessageMapper.selectLeaveMessageCountIfNoRead(leaveMessageToUser);
    }

    public List<LeaveMessageDto> selectLeaveMessageByUserInfoIdNoRead(Integer leaveMessageToUser) {
        return this.leaveMessageMapper.selectLeaveMessageByUserInfoIdNoRead(leaveMessageToUser);
    }

    public List<LeaveMessageDto> selectLeaveMessageByUserInfoIdReaded(Integer leaveMessageToUser) {
        return this.leaveMessageMapper.selectLeaveMessageByUserInfoIdReaded(leaveMessageToUser);
    }

    public boolean ReadedMessages(String[] ids) {
        Integer count = this.leaveMessageMapper.ReadedMessages(ids);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean DeleteMessages(String[] ids) {
        Integer count = this.leaveMessageMapper.DeleteMessages(ids);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }
}
