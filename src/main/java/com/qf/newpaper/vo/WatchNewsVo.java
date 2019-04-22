package com.qf.newpaper.vo;

import io.swagger.annotations.ApiModelProperty;

public class WatchNewsVo {
    @ApiModelProperty("需要查看的新闻的ID")
    private Integer npId;

    public WatchNewsVo() {
    }

    public WatchNewsVo(Integer npId) {
        this.npId = npId;
    }

    @Override
    public String toString() {
        return "WatchNewsVo{" +
                "npId=" + npId +
                '}';
    }

    public Integer getNpId() {
        return npId;
    }

    public void setNpId(Integer npId) {
        this.npId = npId;
    }
}
