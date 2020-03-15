package com.mengma.model;

import java.util.List;

/**
 * @author fgm
 * @description  分页信息
 * @date 2020-03-15
 ***/
public class PageInfo<T> {

    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPages;
    private Integer total;

    private List<T> resultList;

    public PageInfo(Integer pageNum,Integer pageSize,Integer total,List objectList){
        this.pageNum=pageNum;
        this.pageSize=pageSize;
        this.total=total;
        this.resultList=objectList;
        if(null!=total&&null!=pageSize&&pageSize!=0){
           int totalPages= total/pageSize;
           int oneMorePage = total%pageSize==0?0:1;
           this.totalPages=totalPages+oneMorePage;
           if(this.pageNum>=this.totalPages){
               this.pageNum=this.totalPages;
           }
        }
    }

    public static PageInfo buildPage(Integer pageNum,Integer pageSize,Integer total,List objectList){
        return new PageInfo(pageNum,pageSize,total,objectList);
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }
}
