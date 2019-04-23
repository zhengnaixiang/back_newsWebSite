package com.qf.fans.service.impl;

import com.qf.Comment.mapper.CommentMapper;
import com.qf.fans.dto.FansDto;
import com.qf.fans.mapper.FansMapper;
import com.qf.fans.service.FansService;
import com.qf.fans.vo.FansVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FansServiceImpl implements FansService {

    @Autowired
    FansMapper fansMapper;


    /**
     * 获取粉丝分析列表的数据，并按照粉丝数降序输出
      * @return
     */
    public List<FansDto> getAllFansData(FansVo fansVo) {
        return fansMapper.getAllFansData(fansVo);
    }
}
