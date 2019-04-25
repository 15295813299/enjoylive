package com.qf.service;

import com.qf.dto.LoginInfoDto;
import com.qf.dto.PersonageDto;
import com.qf.pojo.Category;
import com.qf.pojo.UserInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface PersonageInfoService {

    /**
     * 获取擅长领域
     * @param userInfo
     * @return
     */
    public List<Category> getProfessionById(UserInfo userInfo);

    /**
     * 获取访问量及点赞
     * @param userInfo
     * @return
     */
    public PersonageDto getCountVisit(UserInfo userInfo);

    /**
     * 获取粉丝
     * @param userInfo
     * @return
     */
    public List<LoginInfoDto> getFansById(UserInfo userInfo);

    /**
     * 上传头像
     * @param dropzFile
     * @param request
     * @return
     */
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request);

    /**
     * 修改信息
     * @param userInfo
     * @return
     */
    public int upPersonageById(UserInfo userInfo);

    /**
     * 密码匹配
     * @param userInfo
     * @return
     */
    public UserInfo rePassword(UserInfo userInfo);

    /**
     * session覆盖
     * @param userInfo
     * @param session
     * @return
     */
    public Boolean coverSession(UserInfo userInfo, HttpSession session);

    public UserInfo reUserInfo(UserInfo userInfo);


    List<Category> getCategory(Category category);

    public int upAdept(UserInfo userInfo);

    public int setAdept(PersonageDto personageDto);

    Integer updateScore(PersonageDto personageDto);
}
