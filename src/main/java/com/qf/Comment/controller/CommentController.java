package com.qf.Comment.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.Comment.dto.CommentDto;
import com.qf.Comment.pojo.Comment;
import com.qf.Comment.service.CommentService;
import com.qf.Comment.vo.CommentVo;
import com.qf.Comment.vo.Page;
import com.qf.userInfo.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;



    /**
     * 获取所有的评论列表数据
     * @return
     */
    @RequestMapping(value = "getAllComments",method = RequestMethod.POST)
    public Object getAllComments(@RequestBody Page page){
        PageHelper.startPage(page.getCurrentPage(), page.getPageSize());
        List<CommentDto> allComments = commentService.getAllComments(page);
        PageInfo<CommentDto> commentDtoPageInfo = new PageInfo<CommentDto>(allComments);
        return commentDtoPageInfo;
    }

    /**
     * 进行增加的评论
     * @param comment 评论的相关信息
     * @return 返回影响结果
     */
    @RequestMapping(value = "addCommentByUser",method = RequestMethod.POST)
    public String addCommentByUser(HttpSession session, @RequestBody Comment comment){
        /*从会话中获取评论人的id*/
        UserInfo userInfo =(UserInfo)session.getAttribute("userInfo");
        comment.setUser_id(userInfo.getUser_id());
        return commentService.addCommentByUser(comment).toString();
    }

    /**
     * 进行批量删除的操作
     * @param commentVo
     * @return
     */
    @RequestMapping(value = "batchDelComment",method = RequestMethod.POST)
    public String batchDelComment(@RequestBody CommentVo commentVo){
        return commentService.batchDelComment(commentVo).toString();
    }

    /**
     * 进行单个删除的操作
     * @param comment_id
     * @return
     */
    @RequestMapping(value = "deleteSingle",method = RequestMethod.GET)
   public String deleteSingle(@RequestParam int comment_id){
        return commentService.deleteSingle(comment_id).toString();
   }

}
