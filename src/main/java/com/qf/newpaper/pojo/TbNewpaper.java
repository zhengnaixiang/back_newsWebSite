package com.qf.newpaper.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "newpaper")
public class TbNewpaper {
    @Id
    @Column(name = "np_id")
    private Integer npId;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 作者(用户别名)
     */
    @Column(name = "user_alias")
    private String userAlias;

    /**
     * 标题
     */
    @Column(name = "np_title")
    private String npTitle;

    /**
     * 新闻日期
     */
    @Column(name = "np_date")
    private Date npDate;

    /**
     * 头图
     */
    @Column(name = "np_image")
    private String npImage;

    /**
     * 内容
     */
    @Column(name = "np_content")
    private String npContent;

    /**
     * 阅读量
     */
    @Column(name = "np_reading")
    private Integer npReading;

    /**
     * 点赞量
     */
    @Column(name = "np_likes")
    private Integer npLikes;

    /**
     * 新闻可显示状态
     */
    @Column(name = "np_status")
    private Boolean npStatus;

    /**
     * @return np_id
     */
    public Integer getNpId() {
        return npId;
    }

    /**
     * @param npId
     */
    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取作者(用户别名)
     *
     * @return user_alias - 作者(用户别名)
     */
    public String getUserAlias() {
        return userAlias;
    }

    /**
     * 设置作者(用户别名)
     *
     * @param userAlias 作者(用户别名)
     */
    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias == null ? null : userAlias.trim();
    }

    /**
     * 获取标题
     *
     * @return np_title - 标题
     */
    public String getNpTitle() {
        return npTitle;
    }

    /**
     * 设置标题
     *
     * @param npTitle 标题
     */
    public void setNpTitle(String npTitle) {
        this.npTitle = npTitle == null ? null : npTitle.trim();
    }

    /**
     * 获取新闻日期
     *
     * @return np_date - 新闻日期
     */
    public Date getNpDate() {
        return npDate;
    }

    /**
     * 设置新闻日期
     *
     * @param npDate 新闻日期
     */
    public void setNpDate(Date npDate) {
        this.npDate = npDate;
    }

    /**
     * 获取头图
     *
     * @return np_image - 头图
     */
    public String getNpImage() {
        return npImage;
    }

    /**
     * 设置头图
     *
     * @param npImage 头图
     */
    public void setNpImage(String npImage) {
        this.npImage = npImage == null ? null : npImage.trim();
    }

    /**
     * 获取内容
     *
     * @return np_content - 内容
     */
    public String getNpContent() {
        return npContent;
    }

    /**
     * 设置内容
     *
     * @param npContent 内容
     */
    public void setNpContent(String npContent) {
        this.npContent = npContent == null ? null : npContent.trim();
    }

    /**
     * 获取阅读量
     *
     * @return np_reading - 阅读量
     */
    public Integer getNpReading() {
        return npReading;
    }

    /**
     * 设置阅读量
     *
     * @param npReading 阅读量
     */
    public void setNpReading(Integer npReading) {
        this.npReading = npReading;
    }

    /**
     * 获取点赞量
     *
     * @return np_likes - 点赞量
     */
    public Integer getNpLikes() {
        return npLikes;
    }

    /**
     * 设置点赞量
     *
     * @param npLikes 点赞量
     */
    public void setNpLikes(Integer npLikes) {
        this.npLikes = npLikes;
    }

    /**
     * 获取新闻可显示状态
     *
     * @return np_status - 新闻可显示状态
     */
    public Boolean getNpStatus() {
        return npStatus;
    }

    /**
     * 设置新闻可显示状态
     *
     * @param npStatus 新闻可显示状态
     */
    public void setNpStatus(Boolean npStatus) {
        this.npStatus = npStatus;
    }
}
