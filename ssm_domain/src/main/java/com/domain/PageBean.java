package com.domain;

import java.util.List;

public class PageBean<T> {
//    当前页:页面传参
    private Integer currPage;
//    每页条数:页面传参
    private Integer pageSize;
//    总条数:数据库查询
    private Integer totalCount;
//    总页数:计算，math.ceil（totalCount * 1.0/pageSize）
    private Integer totalPage;
//    页面展示的数据:数据库查询
    private List<T> list;


    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
