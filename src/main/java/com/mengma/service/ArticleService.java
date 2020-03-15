package com.mengma.service;

import com.mengma.model.PageInfo;
import com.mengma.pojo.Article;
import com.mengma.pojo.ArticlePageQuery;

/**
 * @author fgm
 * @description  文章服务
 * @date 2020-03-15
 ***/
public interface ArticleService {

    /**
     * 分页查询文章信息
     * @param pageQuery
     * @return
     */
    PageInfo<Article> pageQuery(ArticlePageQuery pageQuery);

}
