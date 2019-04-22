package com.qf.newpaper.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "report")
public class TbReport {
    @Id
    @Column(name = "report_id")
    private Integer reportId;

    /**
     * 举报者
     */
    @Column(name = "report_user_id")
    private Integer reportUserId;

    /**
     * 被举报人
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 被举报新闻
     */
    @Column(name = "np_id")
    private Integer npId;

    /**
     * 被举报评论
     */
    @Column(name = "comment_id")
    private Integer commentId;

    /**
     * 举报时间
     */
    private Date date;

    /**
     * 举报内容
     */
    @Column(name = "report_content")
    private String reportContent;

    /**
     * 是否已受理完成。0即完成-不显示
     */
    private Boolean status;

    /**
     * @return report_id
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * @param reportId
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取举报者
     *
     * @return report_user_id - 举报者
     */
    public Integer getReportUserId() {
        return reportUserId;
    }

    /**
     * 设置举报者
     *
     * @param reportUserId 举报者
     */
    public void setReportUserId(Integer reportUserId) {
        this.reportUserId = reportUserId;
    }

    /**
     * 获取被举报人
     *
     * @return user_id - 被举报人
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置被举报人
     *
     * @param userId 被举报人
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取被举报新闻
     *
     * @return np_id - 被举报新闻
     */
    public Integer getNpId() {
        return npId;
    }

    /**
     * 设置被举报新闻
     *
     * @param npId 被举报新闻
     */
    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    /**
     * 获取被举报评论
     *
     * @return comment_id - 被举报评论
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * 设置被举报评论
     *
     * @param commentId 被举报评论
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取举报时间
     *
     * @return date - 举报时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置举报时间
     *
     * @param date 举报时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取举报内容
     *
     * @return report_content - 举报内容
     */
    public String getReportContent() {
        return reportContent;
    }

    /**
     * 设置举报内容
     *
     * @param reportContent 举报内容
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent == null ? null : reportContent.trim();
    }

    /**
     * 获取是否已受理完成。0即完成-不显示
     *
     * @return status - 是否已受理完成。0即完成-不显示
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置是否已受理完成。0即完成-不显示
     *
     * @param status 是否已受理完成。0即完成-不显示
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
