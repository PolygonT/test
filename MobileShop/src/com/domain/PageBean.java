package com.domain;

import java.util.List;

public class PageBean<T> {
    private Integer totalCount;
    private Integer totalPage;
    private List list;  //每页的数剧
    private Integer currentPage;
    private Integer rows; //每页显示的条数
    private String mobile_made;

    public String getMobile_made() {
        return mobile_made;
    }

    public void setMobile_made(String mobile_made) {
        this.mobile_made = mobile_made;
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

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                ", mobile_made='" + mobile_made + '\'' +
                '}';
    }
}
