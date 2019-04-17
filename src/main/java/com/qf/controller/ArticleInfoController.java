package com.qf.controller;


import com.qf.pojo.ArticleInfo;
import com.qf.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class ArticleInfoController {

    static String UPLOAD_PATH = "/static/upload/";

    /**
     * 上传文章图片
     * @param editorFile 文件上传的参数名称，必须与前端的名称一致
     * @param request
     * @return  前端要求返回值的map集合
     */
    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public Map<String, Object> upload1(MultipartFile editorFile, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();

        // 获取文件后缀
        String fileName = editorFile.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));

        // 文件存放路径
        String filePath = request.getSession().getServletContext().getRealPath(UPLOAD_PATH);
        // 网络地址
        InetAddress ia=null;
        try {
            ia = ia.getLocalHost();
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // 判断路径是否存在，不存在则创建文件夹
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }

        // 将文件写入目标
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        try {
            editorFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取服务端路径
        String serverPath = String.format("%s://%s:%s%s%s", request.getScheme(), ia.getHostAddress(), request.getServerPort(), request.getContextPath(), UPLOAD_PATH);
        System.out.println(serverPath);
        // 返回给 wangEditor 的数据格式
        result.put("errno", 0);
        result.put("data", new String[]{serverPath + file.getName()});
        return result;
    }


    @Autowired
    ArticleInfoService articleInfoService;

    @RequestMapping(value = "addArticle" ,method = RequestMethod.POST)
    public boolean addArticle(@RequestBody ArticleInfo articleInfo){
        articleInfo.setArticleInfoDate(new Timestamp(System.currentTimeMillis()));
        articleInfoService.addArticle(articleInfo);
        /**拆分文章正文的HTML,获取第一张图片的地址
         * */
        String s = articleInfo.getContent().split("img src=\"")[1];
        String imgSrc = (s).split("\"")[0];
        /**将文章的第一张图片的地址和文章id储存到数据库
         * */
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("articleId",articleInfo.getArticleId());
        map.put("potoPath",imgSrc);
        Integer integer = articleInfoService.addArticlePoto(map);
        if(integer!=0){
            return true;
        }else {
            return false;
        }
    }
}
