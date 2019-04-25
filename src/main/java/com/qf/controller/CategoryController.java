package com.qf.controller;

import com.qf.dto.BrowselnfoListDto;
import com.qf.dto.HotListDto;
import com.qf.dto.NoneSupportCategory;
import com.qf.pojo.Category;
import com.qf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @RequestMapping(value = "getCategoryIdList", method = RequestMethod.GET)
    public List<Category> getCategoryIdList() {
       return categoryService.getCategoryIdList();
    }

    /***
     *
     * @return 获取大版块name
     */
    @RequestMapping(value = "getBigCategoryList",method = RequestMethod.POST)
    public List<Category> getBigCategoryList(){
     return categoryService.getBigCategoryList();
    }

    /***
     *
      * @param categoryName 前台传输参数为大版块名称
     * @return  该版块点赞数第一名
     */
   @RequestMapping(value = "getHotCategory",method = RequestMethod.POST)
  public Object getHotCategory(@RequestParam String categoryName){
       List<HotListDto> hotCategoryList = categoryService.getHotCategory(categoryName);
       return hotCategoryList;
   }

    /***
     *
     * @param categoryName 前台传输参数为大版块名称
     * @return 该版块底下未点赞给它们默认的大版块图片和对应文章数量给前端展示
     */
    @RequestMapping(value = "getNoneSupportCategory",method = RequestMethod.POST)
  public Object getNoneSupportCategory(@RequestParam String categoryName){
      NoneSupportCategory noneSupportCategory = categoryService.getNoneSupportCategory(categoryName);
      return noneSupportCategory;
  }
    @RequestMapping(value = "getArticleCountToCategory",method = RequestMethod.POST)
  public Object getArticleCountToCategory(@RequestParam String categoryName){
      NoneSupportCategory articleCountToCategory = categoryService.getArticleCountToCategory(categoryName);
      return articleCountToCategory;
  }
    @RequestMapping(value = "getBrowseCategory",method = RequestMethod.POST)
    public Object getBrowseCategory(@RequestParam String categoryName){
        List<BrowselnfoListDto> browseCategory = categoryService.getBrowseCategory(categoryName);
        return browseCategory;
    }

    @RequestMapping(value = "getCommentCategory",method = RequestMethod.GET)
    public Object getCommentCategory(@RequestParam String categoryName){
        List<BrowselnfoListDto> browseCategory = categoryService.getCommentCategory(categoryName);
        return browseCategory;
    }
    /***
     *
     * @param userInfoId  用户ID
     * @return  该用户所有的文章
     */
    @RequestMapping(value = "getUserInfoToShowArticle",method = RequestMethod.GET)
    public Object getUserInfoToShowArticle(@RequestParam  Integer userInfoId){
        List<HotListDto> userInfoToShowArticle = categoryService.getUserInfoToShowArticle(userInfoId);
        System.out.println(userInfoToShowArticle);
        for(HotListDto hotListDto:userInfoToShowArticle){
            if(hotListDto.getPotoPath()==null){
                if(hotListDto.getCategoryId()==2){
                  hotListDto.setPotoPath("img/bk_img/lol_b.jpg");
                }else if(hotListDto.getCategoryId()==3){
                    hotListDto.setPotoPath("img/bk_img/ny_b.jpg");
                }else if(hotListDto.getCategoryId()==4){
                    hotListDto.setPotoPath("img/bk_img/dnf_b.jpg");
                }else if(hotListDto.getCategoryId()==5){
                    hotListDto.setPotoPath("img/bk_img/sj_b.jpg");
                }else if(hotListDto.getCategoryId()==6){
                    hotListDto.setPotoPath("img/bk_img/pc_b.jpg");
                }else if(hotListDto.getCategoryId()==7){
                    hotListDto.setPotoPath("img/bk_img/sy_b.jpg");
                }else if(hotListDto.getCategoryId()==10){
                    hotListDto.setPotoPath("img/bk_img/nba_b.jpg");
                }else if(hotListDto.getCategoryId()==11){
                    hotListDto.setPotoPath("img/bk_img/sjb_b.jpg");
                }else if(hotListDto.getCategoryId()==12){
                    hotListDto.setPotoPath("img/bk_img/run_a.jpg");
                }else if(hotListDto.getCategoryId()==14){
                    hotListDto.setPotoPath("img/bk_img/love_a.jpg");
                }else if(hotListDto.getCategoryId()==15){
                    hotListDto.setPotoPath("img/bk_img/parent_a.jpg");
                }else if(hotListDto.getCategoryId()==17){
                    hotListDto.setPotoPath("img/bk_img/pop_a.jpg");
                }else if(hotListDto.getCategoryId()==18){
                    hotListDto.setPotoPath("img/bk_img/jazz_a.jpg");
                }else if(hotListDto.getCategoryId()==19){
                    hotListDto.setPotoPath("img/bk_img/rap_a.jpg");
                }else if(hotListDto.getCategoryId()==21){
                    hotListDto.setPotoPath("img/bk_img/movie_bs.jpg");
                }else if(hotListDto.getCategoryId()==22){
                    hotListDto.setPotoPath("img/bk_img/cnmovie_a.jpg");
                }else if(hotListDto.getCategoryId()==24){
                    hotListDto.setPotoPath("img/bk_img/art_b.jpg");
                }
            }
        }


        return userInfoToShowArticle;
    }
}
