package com.qf.dto;

import lombok.Data;

@Data
public class LeaveMessageDto {
    private Integer leaveMessageId;
    private String headPath;
    private String name;
    private String leaveMessageTime;
    private String leaveMessageText;
    private Integer userInfoId;

}
