package com.qf.newpaper.vo;

import io.swagger.annotations.ApiModelProperty;

public class EditNewsVo {
    @ApiModelProperty(value = "新闻的id")
    private String npId;
    @ApiModelProperty(value = "新闻的标题")
    private String title;
    @ApiModelProperty(value = "新闻的内容")
    private String newContent;
    @ApiModelProperty(value = "新闻的图片")
    private String img;
    @ApiModelProperty(value = "新闻的分类")
    private String className;
    @ApiModelProperty(value = "新闻的id")
    private String classId;

    public EditNewsVo() {
    }

    @Override
    public String toString() {
        return "EditNewsVo{" +
                "npId='" + npId + '\'' +
                ", title='" + title + '\'' +
                ", newContent='" + newContent + '\'' +
                ", img='" + img + '\'' +
                ", className='" + className + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }

    public EditNewsVo(String npId, String title, String newContent, String img, String className, String classId) {
        this.npId = npId;
        this.title = title;
        this.newContent = newContent;
        this.img = img;
        this.className = className;
        this.classId = classId;
    }

    public String getNpId() {
        return npId;
    }

    public void setNpId(String npId) {
        this.npId = npId;
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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
