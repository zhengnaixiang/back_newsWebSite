package com.qf.newpaper.pojo;

import java.util.Date;

/**
 * @author XingDi@Jchvip.com
 * @date2019/4/1614:35
 */
public class NewPaper {
    /**
     * 新闻id
     */
    private Integer np_id;
    /**
     * 新闻标题
     */
    private String np_title;
    /**
     * 新闻作者
     */
    private String user_alias;
    /**
     * 图片的路径
     */
    private String np_image;
    /**
     * 时间
     */
    private Date np_date;
   private String np_content;

    public NewPaper(Integer np_id, String np_title, String user_alias, String np_image, Date np_date, String np_content) {
        this.np_id = np_id;
        this.np_title = np_title;
        this.user_alias = user_alias;
        this.np_image = np_image;
        this.np_date = np_date;
        this.np_content = np_content;
    }

    public Integer getNp_id() {
        return np_id;
    }

    public void setNp_id(Integer np_id) {
        this.np_id = np_id;
    }

    public String getNp_title() {
        return np_title;
    }

    public void setNp_title(String np_title) {
        this.np_title = np_title;
    }

    public String getUser_alias() {
        return user_alias;
    }

    public void setUser_alias(String user_alias) {
        this.user_alias = user_alias;
    }

    public String getNp_image() {
        return np_image;
    }

    public void setNp_image(String np_image) {
        this.np_image = np_image;
    }

    public Date getNp_date() {
        return np_date;
    }

    public void setNp_date(Date np_date) {
        this.np_date =getNp_date();
    }

    public String getNp_content() {
        return np_content;
    }

    public void setNp_content(String np_content) {
        this.np_content = np_content;
    }

    public NewPaper() {
    }

    @Override
    public String toString() {
        return "NewPaper{" +
                "np_id=" + np_id +
                ", np_title='" + np_title + '\'' +
                ", user_alias='" + user_alias + '\'' +
                ", np_image='" + np_image + '\'' +
                ", np_date=" + np_date +
                ", np_content='" + np_content + '\'' +
                '}';
    }
}
