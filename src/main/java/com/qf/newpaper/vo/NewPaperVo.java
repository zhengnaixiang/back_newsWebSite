package com.qf.newpaper.vo;

import io.swagger.annotations.ApiModelProperty;

public class NewPaperVo {

    @ApiModelProperty("当前页码")
    private int pageNum;
    @ApiModelProperty("分页数")
    private int pageSize;
    @ApiModelProperty("排序字段")
    private String order;
    @ApiModelProperty("排序方式")
    private String dir;

    @ApiModelProperty("搜索关键词")
    private String search;


    @Override
    public String toString() {
        return "NewPaperVo{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", order='" + order + '\'' +
                ", dir='" + dir + '\'' +
                ", search='" + search + '\'' +
                '}';
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
