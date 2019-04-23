package com.qf.newpaper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.github.pagehelper.util.StringUtil;
import com.qf.newpaper.dto.*;
import com.qf.newpaper.mapper.TbNewpaperMapper;
import com.qf.newpaper.service.AllNewsService;
import com.qf.newpaper.vo.EditNewsVo;
import com.qf.newpaper.vo.NewPaperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class AllNewsServiceImpl implements AllNewsService, Serializable {
    @Autowired
    private TbNewpaperMapper tbNewpaperMapper;

    @Override
    public PageInfo<TbNewPaperDto> pageFuzzyselect(NewPaperVo newPaperVo) {
        PageHelper.startPage(newPaperVo.getPageNum(),newPaperVo.getPageSize());

        /*用mybatis分页插件来实现自动分页*/
        int start = newPaperVo.getPageNum();
        int pageSize = newPaperVo.getPageSize();
        PageHelper.startPage(start,pageSize);

//        List<ReceiveTargetPo> data = tbReceiveTargetMapper.pageFuzzyselect();

        /*4.7.5添加orderStr,排序*/
        String orderStr = getOrderStr(newPaperVo);

        String searchName = newPaperVo.getSearch();
        List<TbNewPaperDto> data = tbNewpaperMapper.pageFuzzyselect(orderStr,searchName);

        return new PageInfo<TbNewPaperDto>(data);
    }

    @Override
    public Integer deleteNews(String[] ids) {
        return tbNewpaperMapper.deleteNews(ids);
    }

    @Override
    public List<CommentAllDto> commentAll() {
        return tbNewpaperMapper.commentAll();
    }

    @Override
    public WatchNewsDto watchNews(Integer npId) {
        WatchNewsDto watchNewsDto = tbNewpaperMapper.watchNews(npId);
        List<TbUserCommentDto> list = tbNewpaperMapper.newsComment(npId);
        watchNewsDto.setComments(list);

        return watchNewsDto;
    }

    @Override
    public WatchNewssDto watchNewss(Integer npId) {
        return tbNewpaperMapper.watchNewss(npId);
    }

    @Override
    public List<WatchClassNameDto> watchClassName() {
        List<WatchClassNameDto> list = tbNewpaperMapper.WatchClassName();
        System.out.println(":::" + list);
        return list;
    }

    @Override
    public Integer editNews(EditNewsVo editNewsVo) {
        return tbNewpaperMapper.editNews(editNewsVo);
    }

    @Override
    public Integer editImg(String img,Integer npId) {
        return tbNewpaperMapper.editImg(img,npId);
    }

    private String getOrderStr(NewPaperVo newPaperVo){
        StringBuffer stringBuffer = new StringBuffer();
        /* 从data.html查columns: [
                  { "data": "np_id" },
                  { "data": "np_title" },
                  { "data": "user_alias" },
                  { "data": "np_date" },
                  { "data": "class_name" },
                  { "data": "np_likes" },
                  { "data": "np_comment"" }
        ]*/

        if(!StringUtil.isEmpty(newPaperVo.getOrder())) {
            String strs[] = {"np_id","np_title","user_alias","np_date","class_name","np_likes","np_comment"};
            stringBuffer.append(" order by "+strs[Integer.parseInt(newPaperVo.getOrder())]+" " + newPaperVo.getDir());
        }
        return stringBuffer.toString();
    }
}
