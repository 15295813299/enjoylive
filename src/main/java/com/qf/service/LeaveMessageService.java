package com.qf.service;

import com.qf.dto.LeaveMessageDto;
import com.qf.pojo.LeaveMessage;
import com.qf.vo.LeaveMessageVo;

import java.util.List;

public interface LeaveMessageService {
    public boolean addLeaveMessageByUserInfoId(LeaveMessageVo leaveMessageVo);
    public List<LeaveMessageDto> selectLeaveMessageByUserInfoId(Integer leaveMessageToUser);
    public Integer selectLeaveMessageCountIfNoRead(LeaveMessage leaveMessageToUser);
    public List<LeaveMessageDto> selectLeaveMessageByUserInfoIdNoRead(Integer leaveMessageToUser);
    public List<LeaveMessageDto> selectLeaveMessageByUserInfoIdReaded(Integer leaveMessageToUser);
    public boolean ReadedMessages(String[] ids);
    public boolean DeleteMessages(String[] ids);
}
