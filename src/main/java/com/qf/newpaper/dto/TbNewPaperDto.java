package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class TbNewPaperDto {
    @ApiModelProperty("新闻id")
    private Integer npId;
    @ApiModelProperty("新闻标题")
    private String npTitle;
    @ApiModelProperty("新闻作者")
    private String userAlias;
    @ApiModelProperty("新闻时间")
    private Date npDate;
    @ApiModelProperty("点赞量")
    private Integer npLikes;
    @ApiModelProperty("评论量")
    private Integer sunComment;
    @ApiModelProperty("新闻类别")
    private String className;
    @ApiModelProperty("时间")
    private String time;

    public TbNewPaperDto() {
    }

    public TbNewPaperDto(Integer npId, String npTitle, String userAlias, Date npDate, Integer npLikes, Integer sunComment, String className, String time) {
        this.npId = npId;
        this.npTitle = npTitle;
        this.userAlias = userAlias;
        this.npDate = npDate;
        this.npLikes = npLikes;
        this.sunComment = sunComment;
        this.className = className;
        this.time = time;
    }

    @Override
    public String toString() {
        return "TbNewPaperDto{" +
                "npId=" + npId +
                ", npTitle='" + npTitle + '\'' +
                ", userAlias='" + userAlias + '\'' +
                ", npDate=" + npDate +
                ", npLikes=" + npLikes +
                ", sunComment=" + sunComment +
                ", className='" + className + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Integer getNpId() {
        return npId;
    }

    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    public String getNpTitle() {
        return npTitle;
    }

    public void setNpTitle(String npTitle) {
        this.npTitle = npTitle;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public Date getNpDate() {
        return npDate;
    }

    public void setNpDate(Date npDate) {
        this.npDate = npDate;
    }

    public Integer getNpLikes() {
        return npLikes;
    }

    public void setNpLikes(Integer npLikes) {
        this.npLikes = npLikes;
    }

    public Integer getSunComment() {
        if (sunComment == null){
            sunComment = 0;
        }
        return sunComment;
    }

    public void setSunComment(Integer sunComment) {
        this.sunComment = sunComment;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
