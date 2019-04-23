package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

public class CommentAllDto {
    @ApiModelProperty(value = "npId")
    private Integer npId;

    @ApiModelProperty(value = "sunComment")
    private Integer  sunComment;

    @Override
    public String toString() {
        return "CommentAllDto{" +
                "npId=" + npId +
                ",  sunComment=" + sunComment +
                '}';
    }

    public CommentAllDto() {
    }

    public CommentAllDto(Integer npId, Integer sunComment) {
        this.npId = npId;
        this.sunComment = sunComment;
    }

    public Integer getNpId() {
        return npId;
    }

    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    public Integer getSunComment() {
        return sunComment;
    }

    public void setSunComment(Integer sunComment) {
        this.sunComment = sunComment;
    }
}
