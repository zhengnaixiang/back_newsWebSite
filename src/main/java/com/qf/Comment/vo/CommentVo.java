package com.qf.Comment.vo;

import lombok.Data;

import java.util.List;

@Data
public class CommentVo {
    /*传入待删除的评论id集合*/
    List<Integer> commentIds;
}
