package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

public class NewsDeleteDto {
    @ApiModelProperty(value = "成功删除新闻的返回数")
    private Integer result;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
