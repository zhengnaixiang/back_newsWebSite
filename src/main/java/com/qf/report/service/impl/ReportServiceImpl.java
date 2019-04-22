package com.qf.report.service.impl;

import com.qf.report.mapper.ReportMapper;
import com.qf.report.pojo.Report;
import com.qf.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportMapper reportMapper;

    public Integer addObject(Report report) {
        return reportMapper.addObject(report);
    }

    public Integer deleteObject(Integer id) {
        return reportMapper.deleteObject(id);
    }

    public List<Report> getListBy(Report report) {
        return reportMapper.getListBy(report);
    }

    public Integer dealReportByCommentId(Integer id) {
        return reportMapper.dealReportByCommentId(id);
    }
}
