package com.qf.Comment.pojo;


import lombok.Data;

@Data
public class Comment {
    Integer comment_id;
    Integer parent_id;
    Integer np_id;
    String comment_date;
    String comment_content;
    Integer user_id;
    boolean status;

    /*添加一个与要增加评论有关的属性，即新闻的标题*/
    String np_title;
}
