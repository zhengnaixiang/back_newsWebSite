package com.qf.Comment.vo;

import lombok.Data;

@Data
public class Page {
    /*当前页数*/
    int currentPage;
    /*每页展示的数量*/
    int pageSize;

    /*下面三个是模糊查询的条件*/
    String comment_date;
    String user_alias;
    String np_title;
}
