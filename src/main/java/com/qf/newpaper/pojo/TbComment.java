package com.qf.newpaper.pojo;

import javax.persistence.*;

@Table(name = "comment")
public class TbComment {
    @Id
    @Column(name = "comment_id")
    private Integer commentId;

    /**
     * 评论日期
     */
    @Column(name = "common_date")
    private String commonDate;

    /**
     * 评论内容
     */
    @Column(name = "common_content")
    private String commonContent;

    /**
     * 评论人id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 评论的新闻id
     */
    @Column(name = "np_id")
    private Integer npId;

    /**
     * 可显示状态
     */
    private Boolean status;

    /**
     * @return comment_id
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * @param commentId
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取评论日期
     *
     * @return common_date - 评论日期
     */
    public String getCommonDate() {
        return commonDate;
    }

    /**
     * 设置评论日期
     *
     * @param commonDate 评论日期
     */
    public void setCommonDate(String commonDate) {
        this.commonDate = commonDate == null ? null : commonDate.trim();
    }

    /**
     * 获取评论内容
     *
     * @return common_content - 评论内容
     */
    public String getCommonContent() {
        return commonContent;
    }

    /**
     * 设置评论内容
     *
     * @param commonContent 评论内容
     */
    public void setCommonContent(String commonContent) {
        this.commonContent = commonContent == null ? null : commonContent.trim();
    }

    /**
     * 获取评论人id
     *
     * @return user_id - 评论人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置评论人id
     *
     * @param userId 评论人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取评论的新闻id
     *
     * @return np_id - 评论的新闻id
     */
    public Integer getNpId() {
        return npId;
    }

    /**
     * 设置评论的新闻id
     *
     * @param npId 评论的新闻id
     */
    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    /**
     * 获取可显示状态
     *
     * @return status - 可显示状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置可显示状态
     *
     * @param status 可显示状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
