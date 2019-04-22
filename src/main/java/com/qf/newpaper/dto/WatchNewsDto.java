package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class WatchNewsDto {
    @ApiModelProperty(value = "返回所查看的新闻的标题")
    private String title;
    @ApiModelProperty(value = "返回所查看的新闻的内容")
    private String newContent;
    @ApiModelProperty(value = "返回所查看的新闻的图片")
    private String img;
    @ApiModelProperty(value = "返回所查看的新闻的时间")
    private String time;
    @ApiModelProperty(value = "返回所查看的新闻的点赞量")
    private String likes;
    @ApiModelProperty(value = "返回所查看的新闻的评论量")
    private String commentNum;
    @ApiModelProperty(value = "返回所查看的新闻的评论的集合")
    private List<TbUserCommentDto> comments;

    public WatchNewsDto() {
    }

    public WatchNewsDto(String title, String newContent, String img, String time, String likes, String commentNum, List<TbUserCommentDto> comments) {
        this.title = title;
        this.newContent = newContent;
        this.img = img;
        this.time = time;
        this.likes = likes;
        this.commentNum = commentNum;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "WatchNewsDto{" +
                "title='" + title + '\'' +
                ", newContent='" + newContent + '\'' +
                ", img='" + img + '\'' +
                ", time='" + time + '\'' +
                ", likes='" + likes + '\'' +
                ", commentNum='" + commentNum + '\'' +
                ", comments=" + comments +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getCommentNum() {
        commentNum = comments.size() + "";
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public List<TbUserCommentDto> getComments() {
        return comments;
    }

    public void setComments(List<TbUserCommentDto> comments) {
        this.comments = comments;
    }
}
