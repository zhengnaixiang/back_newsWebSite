package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

public class TbUserCommentDto {
    @ApiModelProperty(value = "评论日期")
    private String commonDate;
    @ApiModelProperty(value = "评论内容")
    private String commonContent;
    @ApiModelProperty(value = "评论人头像地址")
    private String userImageurl;

    public TbUserCommentDto() {
    }

    public TbUserCommentDto(String commonDate, String commonContent, String userImageurl) {
        this.commonDate = commonDate;
        this.commonContent = commonContent;
        this.userImageurl = userImageurl;
    }

    @Override
    public String toString() {
        return "TbUserCommentDto{" +
                "commonDate='" + commonDate + '\'' +
                ", commonContent='" + commonContent + '\'' +
                ", userImageurl='" + userImageurl + '\'' +
                '}';
    }

    public String getCommonDate() {
        return commonDate;
    }

    public void setCommonDate(String commonDate) {
        this.commonDate = commonDate;
    }

    public String getCommonContent() {
        return commonContent;
    }

    public void setCommonContent(String commonContent) {
        this.commonContent = commonContent;
    }

    public String getUserImageurl() {
        return userImageurl;
    }

    public void setUserImageurl(String userImageurl) {
        this.userImageurl = userImageurl;
    }
}
