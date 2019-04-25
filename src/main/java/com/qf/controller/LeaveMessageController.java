package com.qf.controller;

import com.qf.dto.LeaveMessageDto;
import com.qf.pojo.LeaveMessage;
import com.qf.service.LeaveMessageService;
import com.qf.vo.LeaveMessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LeaveMessageController {
    @Autowired
    LeaveMessageService leaveMessageService;

    /**
     *  添加留言
     * @param leaveMessageVo
     * @return
     */
    @RequestMapping(value = "addLeaveMessage",method = RequestMethod.POST)
    public String addLeaveMessageByUserInfoId(@RequestBody(required = false)LeaveMessageVo leaveMessageVo){
        Boolean flag = this.leaveMessageService.addLeaveMessageByUserInfoId(leaveMessageVo);
        System.out.println(leaveMessageVo);
        return flag.toString();
    }

    /**
     * 查看总留言信息
     * @param leaveMessageToUser
     * @return
     */
    @RequestMapping(value = "getLeaveMessage",method = RequestMethod.POST)
    public Object selectLeaveMessageByUserInfoId(@RequestParam Integer leaveMessageToUser){
        System.out.println("getLeaveMessage:"+leaveMessageToUser);
        List<LeaveMessageDto> leaveMessageDtos = this.leaveMessageService.selectLeaveMessageByUserInfoId(leaveMessageToUser);
        for (LeaveMessageDto leaveMessageDto: leaveMessageDtos) {
            System.out.println(leaveMessageDto);
        }
        System.out.println(leaveMessageDtos.size());
        return leaveMessageDtos;
    }

    /**
     * 获取未读留言条数
     * @param leaveMessageToUser
     * @return
     */
    @RequestMapping(value = "getNoReadMessageCount",method = RequestMethod.POST)
    public Integer selectLeaveMessageCountIfNoRead(@RequestBody(required = false) LeaveMessage leaveMessageToUser, HttpSession httpSession){
        System.out.println(leaveMessageToUser);
        Integer count = this.leaveMessageService.selectLeaveMessageCountIfNoRead(leaveMessageToUser);
        System.out.println(count);
        return count;
    }

    /**
     * 查看未读留言信息
      * @param leaveMessageToUser
     * @return
     */
    @RequestMapping(value = "getLeaveMessageNoRead",method = RequestMethod.POST)
    public Object selectLeaveMessageByUserInfoIdNoRead(@RequestParam Integer leaveMessageToUser){
        System.out.println("getLeaveMessageNoRead:"+leaveMessageToUser);
        List<LeaveMessageDto> leaveMessageDtos = this.leaveMessageService.selectLeaveMessageByUserInfoIdNoRead(leaveMessageToUser);
        for (LeaveMessageDto leaveMessageDto: leaveMessageDtos) {
            System.out.println(leaveMessageDto);
        }
        System.out.println(leaveMessageDtos.size());
        return leaveMessageDtos;
    }

    /**
     * 查看已读留言信息
     * @param leaveMessageToUser
     * @return
     */
    @RequestMapping(value = "getLeaveMessageReaded",method = RequestMethod.POST)
    public Object selectLeaveMessageByUserInfoIdReaded(@RequestParam Integer leaveMessageToUser){
        System.out.println("getLeaveMessageReaded:"+leaveMessageToUser);
        List<LeaveMessageDto> leaveMessageDtos = this.leaveMessageService.selectLeaveMessageByUserInfoIdReaded(leaveMessageToUser);
        for (LeaveMessageDto leaveMessageDto: leaveMessageDtos) {
            System.out.println(leaveMessageDto);
        }
        System.out.println(leaveMessageDtos.size());
        return leaveMessageDtos;
    }

    /**
     * 已读取留言操作(页面留言信息消失)
     * @param ids
     * @return
     */
    @RequestMapping(value = "ReadedMyMessages",method = RequestMethod.POST)
    public String ReadedMessages(@RequestBody(required = false) String[] ids){
        Boolean flag = this.leaveMessageService.ReadedMessages(ids);
        System.out.println(ids);
        return flag.toString();
    }

    /**
     * 删除留言操作(页面未留言信息消失)
     * @param ids
     * @return
     */
    @RequestMapping(value = "DeletedMyMessages",method = RequestMethod.POST)
    public String DeleteMessages(@RequestBody(required = false) String[] ids){
        Boolean flag1 = this.leaveMessageService.DeleteMessages(ids);
        System.out.println(ids);
        return flag1.toString();
    }
}
