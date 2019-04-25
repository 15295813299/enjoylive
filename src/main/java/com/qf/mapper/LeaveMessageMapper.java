package com.qf.mapper;

import com.qf.dto.LeaveMessageDto;
import com.qf.pojo.LeaveMessage;
import com.qf.vo.LeaveMessageVo;

import java.util.List;

public interface LeaveMessageMapper {
    public Integer addLeaveMessageByUserInfoId(LeaveMessageVo leaveMessageVo);
    public List<LeaveMessageDto> selectLeaveMessageByUserInfoId(Integer leaveMessageToUser);
    public Integer selectLeaveMessageCountIfNoRead(LeaveMessage leaveMessageToUser);
    public List<LeaveMessageDto> selectLeaveMessageByUserInfoIdNoRead(Integer leaveMessageToUser);
    public List<LeaveMessageDto> selectLeaveMessageByUserInfoIdReaded(Integer leaveMessageToUser);
    public Integer ReadedMessages(String[] ids);
    public Integer DeleteMessages(String[] ids);
}
