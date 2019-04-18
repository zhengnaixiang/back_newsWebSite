package com.qf.report.pojo;

public class Report {
    int report_id;
    int report_user_id;
    int user_id;
    int np_id;
    int comment_id;
    String date;
    String report_content;

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public int getReport_user_id() {
        return report_user_id;
    }

    public void setReport_user_id(int report_user_id) {
        this.report_user_id = report_user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getNp_id() {
        return np_id;
    }

    public void setNp_id(int np_id) {
        this.np_id = np_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReport_content() {
        return report_content;
    }

    public void setReport_content(String report_content) {
        this.report_content = report_content;
    }

    public Report(int report_id, int report_user_id, int user_id, int np_id, int comment_id, String date, String report_content) {
        this.report_id = report_id;
        this.report_user_id = report_user_id;
        this.user_id = user_id;
        this.np_id = np_id;
        this.comment_id = comment_id;
        this.date = date;
        this.report_content = report_content;
    }

    public Report() {
    }

    @Override
    public String toString() {
        return "Report{" +
                "report_id=" + report_id +
                ", report_user_id=" + report_user_id +
                ", user_id=" + user_id +
                ", np_id=" + np_id +
                ", comment_id=" + comment_id +
                ", date='" + date + '\'' +
                ", report_content='" + report_content + '\'' +
                '}';
    }
}
