package com.qf.newpaper.vo;


import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;

public class NewsDeleteVo {
    @ApiModelProperty("需要删除的新闻的ID")
    private String[] newsid;

    public String[] getNewsid() {
        return newsid;
    }

    public void setNewsid(String[] newsid) {
        this.newsid = newsid;
    }

    @Override
    public String toString() {
        return "NewsDeleteVo{" +
                "newsid=" + Arrays.toString(newsid) +
                '}';
    }
}
