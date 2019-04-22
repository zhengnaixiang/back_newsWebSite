package com.qf.report.service;

import com.qf.report.pojo.Report;

import java.util.List;

public interface ReportService {
    /**
     * 添加举报信息
     * @param report
     * @return
     */
    Integer addObject(Report report);

    /**
     * 删除举报信息，相当于已经审核过
     * @param id
     * @return
     */
    Integer deleteObject(Integer id);

    /**
     * 查询举报信息
     * @param report
     * @return
     */
    List<Report> getListBy(Report report);

    /**
     * 通过评论ID删除评论
     * @param id
     * @return
     */
    Integer dealReportByCommentId(Integer id);
}
