package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

public class EditNewsDto {
    @ApiModelProperty(value = "成功修改新闻的返回数")
    private Integer result;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
