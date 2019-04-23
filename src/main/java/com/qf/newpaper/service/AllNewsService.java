package com.qf.newpaper.service;

import com.github.pagehelper.PageInfo;
import com.qf.newpaper.dto.*;
import com.qf.newpaper.vo.EditNewsVo;
import com.qf.newpaper.vo.NewPaperVo;

import java.util.List;

public interface AllNewsService {
    //列表展示查询，引进mybatis分页插件pagehelper，PageInfo为mybatis分页器pagehelper封装的
    public PageInfo<TbNewPaperDto> pageFuzzyselect(NewPaperVo newPaperVo);

    public Integer deleteNews(String[] ids);

    public List<CommentAllDto> commentAll();

    public WatchNewsDto watchNews(Integer npId);

    public WatchNewssDto watchNewss(Integer npId);

    public List<WatchClassNameDto> watchClassName();

    public Integer editNews(EditNewsVo editNewsVo);

    public Integer editImg(String img, Integer npId);
}
