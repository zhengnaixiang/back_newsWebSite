package com.qf.report.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.report.pojo.Report;
import com.qf.report.service.ReportService;
import com.qf.report.vo.SearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ReportController {
    @Autowired
    ReportService reportService;

    /**
     * 获取所有举报信息
     * @param searchVo
     * @return
     */
    @RequestMapping(value = "getAllReport",method = RequestMethod.POST)
    public Object getAllReport(@RequestBody(required = false)SearchVo searchVo) {
        PageHelper.startPage(searchVo.getCurrentPage(),5);
        List<Report> list = reportService.getListBy(new Report());
        PageInfo<Report> pageInfo = new PageInfo<Report>(list);
        return pageInfo;
    }

    /**
     * 审核通过，直接删除该举报信息，不对举报内容做任何处理
     * @param report_id
     * @return
     */
    @RequestMapping(value = "acrossReportById",method = RequestMethod.POST)
    public Integer acrossReportById(@RequestParam int report_id){
        return reportService.deleteObject(report_id);
    }

    /**
     * 审核不通过，删除被举报评论,删除该举报信息
     * @param report_id
     * @return
     */

    @Transactional
    @RequestMapping(value = "stopReport",method = RequestMethod.POST)
    public Integer stopReport(@RequestParam int report_id){
        Integer integer = reportService.dealReportByCommentId(report_id);
        reportService.deleteObject(report_id);
        integer+=1;
        return integer;
    }
}
