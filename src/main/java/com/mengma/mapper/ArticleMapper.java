package com.mengma.mapper;

import com.mengma.pojo.Article;
import com.mengma.pojo.ArticlePageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fgm
 * @description  文章mapper方法
 * @date 2020-03-15
 ***/
public interface ArticleMapper{

    /**
     * 查询分页记录总数
     * @param articlePageQuery
     * @return
     */
    Integer pageQueryCount(@Param("articlePageQuery") ArticlePageQuery articlePageQuery);

    /**
     * 查询分页数据
     * @param articlePageQuery
     * @return
     */
    List<Article> pageQuery(@Param("articlePageQuery") ArticlePageQuery articlePageQuery);

}
