package com.mengma.service.impl;

import com.mengma.mapper.ArticleMapper;
import com.mengma.model.PageInfo;
import com.mengma.pojo.Article;
import com.mengma.pojo.ArticlePageQuery;
import com.mengma.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fgm
 * @description  文章服务实现类
 * @date 2020-03-15
 ***/
@Service
public class ArticleServiceImpl  implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public PageInfo<Article> pageQuery(ArticlePageQuery pageQuery) {
        Integer pageNum=pageQuery.getPageNum();
        Integer pageSize=pageQuery.getPageSize();
        Integer pageIndex=(pageNum-1)*pageSize;
        pageQuery.setPageIndex(pageIndex);
        int total=articleMapper.pageQueryCount(pageQuery);
        if(total==0){
            return PageInfo.buildPage(pageNum,pageSize,0,new ArrayList());
        }
        if(pageIndex>=total){
            //取最后一页
            pageQuery.setPageIndex(total-pageSize);
        }
        List<Article>  articleList=articleMapper.pageQuery(pageQuery);
        return PageInfo.buildPage(pageNum,pageSize,total,articleList);
    }
}
