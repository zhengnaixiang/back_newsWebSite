package com.qf.Comment.mapper;

import com.qf.Comment.dto.CommentDto;
import com.qf.Comment.pojo.Comment;
import com.qf.Comment.vo.CommentVo;
import com.qf.Comment.vo.Page;

import java.util.List;

public interface CommentMapper {


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
    public int addCommentByUser(Comment comment);

    /**
     * 进行批量删除的操作
     * @param commentVo
     * @return 影响行数
     */
    public int batchDelComment(CommentVo commentVo);

    /**
     * 通过新闻的标题找到对应的新闻id
     * @param comment
     * @return
     */
    public int getNp_idByNp_title(Comment comment);

    /**
     * 进行单个删除的操作
     * @param comment_id
     * @return 影响行数
     */
    public int deleteSingle(int comment_id);

    /**
     * 获取评论的总数
     * @return
     */
    public int getCommentCount();
}
