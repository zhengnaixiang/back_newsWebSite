package com.qf.fans.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.Comment.dto.CommentDto;
import com.qf.fans.dto.FansDto;
import com.qf.fans.mapper.FansMapper;
import com.qf.fans.service.FansService;
import com.qf.fans.vo.FansVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FansController {

//    @Autowired
//    FansService fansService;
    private static ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
    private static FansService fansService=context .getBean(FansService.class);

    /**
     * 获取粉丝分析的列表数据，按照粉丝数进行降序输出，并进行分页处理
     * @param fansVo
     * @return
     */
    @RequestMapping(value = "getAllFansData",method = RequestMethod.POST)
    public Object getAllFansData(@RequestBody FansVo fansVo){
      PageHelper.startPage(fansVo.getCurrentPage(),fansVo.getPageSize());
      List<FansDto> list=fansService.getAllFansData(fansVo);
        PageInfo<FansDto> fansDtoPageInfo = new PageInfo<FansDto>(list);
        return fansDtoPageInfo;
    }
}
