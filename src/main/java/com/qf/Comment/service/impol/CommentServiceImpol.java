package com.qf.Comment.service.impol;

import com.qf.Comment.mapper.CommentMapper;
import com.qf.Comment.pojo.Comment;
import com.qf.Comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpol implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public int addCommentBy(Comment comment){
        comment.setComment_date(new java.sql.Date(System.currentTimeMillis()));
        return commentMapper.addCommentBy(comment);
    }
}
