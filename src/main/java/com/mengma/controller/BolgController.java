package com.mengma.controller;

import com.mengma.model.PageInfo;
import com.mengma.pojo.Article;
import com.mengma.pojo.ArticlePageQuery;
import com.mengma.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author fgm
 * @description  博客系统
 * @date 2020-03-15
 ***/
@Controller
@RequestMapping(value = "client")
public class BolgController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/index")
    public String index(Model model){
      return index(model,1,3);
    }

    @RequestMapping("/index/{pageNum}/{pageSize}")
    public String index(Model model,
                        @PathVariable(name = "pageNum")Integer pageNum,
                        @PathVariable(name = "pageSize")Integer pageSize){
         ArticlePageQuery articlePageQuery=new ArticlePageQuery();
         pageNum = (null==pageNum||pageNum<=0)?1:pageNum;
         pageSize = null==pageSize?3:pageSize;
         articlePageQuery.setPageNum(pageNum);
         articlePageQuery.setPageSize(pageSize);
         PageInfo<Article>  pageInfo=articleService.pageQuery(articlePageQuery);
         model.addAttribute("pageInfo",pageInfo);
        return "/client/index";
    }


}
