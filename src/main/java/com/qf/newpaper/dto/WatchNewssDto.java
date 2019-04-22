package com.qf.newpaper.dto;

import io.swagger.annotations.ApiModelProperty;

public class WatchNewssDto {
    @ApiModelProperty(value = "返回所查看的新闻的标题")
    private String title;
    @ApiModelProperty(value = "返回所查看的新闻的内容")
    private String newContent;
    @ApiModelProperty(value = "返回所查看的新闻的图片")
    private String img;
    @ApiModelProperty(value = "返回所查看的新闻的分类")
    private String className;

    public WatchNewssDto() {
    }

    public WatchNewssDto(String title, String newContent, String img, String className) {
        this.title = title;
        this.newContent = newContent;
        this.img = img;
        this.className = className;
    }

    @Override
    public String toString() {
        return "WatchNewssDto{" +
                "title='" + title + '\'' +
                ", newContent='" + newContent + '\'' +
                ", img='" + img + '\'' +
                ", className='" + className + '\'' +
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
