package com.qf.Comment.service;

import com.qf.Comment.dto.CommentDto;
import com.qf.Comment.pojo.Comment;
import com.qf.Comment.vo.CommentVo;
import com.qf.Comment.vo.Page;

import java.util.List;

public interface CommentService {


    /**
     * 初始化后台的评论管理界面，将评论列表所需数据，展示到前端界面
     * @return 返回评论的相应数据
     */
    public List<CommentDto> getAllComments(Page page);

    /**
     * 进行增加评论的操作
     * @param comment
     * @return 影响行数
     */
    public Boolean addCommentByUser(Comment comment);

    /**
     * 进行批量删除的操作
     * @param commentVo
     * @return 影响行数
     */
    public Boolean batchDelComment(CommentVo commentVo);

    /**
     * 进行单个删除的操作
     * @param comment_id
     * @return 影响行数
     */
    public Boolean deleteSingle(int comment_id);
}
