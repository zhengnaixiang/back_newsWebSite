package com.qf.money.service.impl;

import com.qf.Comment.mapper.CommentMapper;
import com.qf.money.dto.MoneyDto;
import com.qf.money.mapper.MoneyMapper;
import com.qf.money.pojo.Money;
import com.qf.money.service.MoneyService;
import com.qf.money.vo.MoneyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyServiceImpl implements MoneyService {

 /*   @Autowired
    MoneyMapper moneyMapper;*/
    private static ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
    private static MoneyMapper moneyMapper=context .getBean(MoneyMapper.class);


    /**
     * 获取所有的金钱总数
     * @return 金钱总数
     */
    public Integer getAllMoneyCount() {
        return moneyMapper.getAllMoneyCount();
    }

    /**
     * 获取用户对应的金钱信息
     * @return 返回用户与对应金钱的数量
     */
    public List<MoneyDto> getMoneyCountByUser(MoneyVo moneyVo) {
        return moneyMapper.getMoneyCountByUser(moneyVo);
    }
}
