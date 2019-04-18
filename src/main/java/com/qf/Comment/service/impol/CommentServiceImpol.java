package com.qf.Comment.service.impol;

import com.qf.Comment.dto.CommentDto;
import com.qf.Comment.mapper.CommentMapper;
import com.qf.Comment.pojo.Comment;
import com.qf.Comment.service.CommentService;
import com.qf.Comment.vo.CommentVo;
import com.qf.Comment.vo.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpol implements CommentService {

 /*   @Autowired
    private CommentMapper commentMapper;*/
    private static ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
    private static CommentMapper commentMapper=context .getBean(CommentMapper.class);



    /**
     * 获取评论管理列表所需要的数据
     * @return
     */
    public List<CommentDto> getAllComments(Page page) {
        return commentMapper.getAllComments(page);
    }

    /**
     * 增加评论的操作
     * @param comment
     * @return
     */
    public Boolean addCommentByUser(Comment comment) {
        if (comment.getNp_id()==null){
            int np_idByNp_title = commentMapper.getNp_idByNp_title(comment);
            comment.setNp_id(np_idByNp_title);
        }
        if (comment.getParent_id()==null){
            comment.setParent_id(0);
        }
        return commentMapper.addCommentByUser(comment)>0?true:false;
    }

    /**
     * 单个删除与批量删除评论的操作
     * @param commentVo
     * @return
     */
    public Boolean batchDelComment(CommentVo commentVo) {
        return commentMapper.batchDelComment(commentVo)>0?true:false;
    }

    /**
     * 进行单个删除的操作
     * @param comment_id
     * @return
     */
    public Boolean deleteSingle(int comment_id) {
        return commentMapper.deleteSingle(comment_id)>0?true:false;
    }
}
