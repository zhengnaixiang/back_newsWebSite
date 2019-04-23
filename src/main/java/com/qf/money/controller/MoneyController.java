package com.qf.money.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.money.dto.MoneyDto;
import com.qf.money.service.MoneyService;
import com.qf.money.vo.MoneyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoneyController {

    @Autowired
    MoneyService moneyService;

    /**
     * 获取所有的金钱总数
     * @return 金钱总数
     */
    @RequestMapping(value = "getAllMoneyCount",method = RequestMethod.POST)
    public String getAllMoneyCount(){
        return moneyService.getAllMoneyCount().toString();
    }

    /**
     * 获取用户金钱的信息列表进行降序输出，且设置分页处理
     * @return
     */
    @RequestMapping(value = "getMoneyCountByUser",method = RequestMethod.POST)
    public Object getMoneyCountByUser(@RequestBody(required = false) MoneyVo moneyVo){
        PageHelper.startPage(moneyVo.getCurrentPage(), moneyVo.getPageSize());
        List<MoneyDto> allMoneys = moneyService.getMoneyCountByUser(moneyVo);
        PageInfo<MoneyDto> allMoneyes = new PageInfo<MoneyDto>(allMoneys);
        return allMoneyes;
    }

    /**
     * 根据用户id，获取该用户的交易记录
     * @param moneyVo
     * @return
     */
    @RequestMapping(value = "getUserMoneyDetail",method = RequestMethod.POST)
    public Object getUserMoneyDetail(@RequestBody MoneyVo moneyVo){
        PageHelper.startPage(moneyVo.getCurrentPage(), moneyVo.getPageSize());
        List<MoneyDto> allMoneys = moneyService.getUserMoneyDetail(moneyVo.getUser_id());
        PageInfo<MoneyDto> allMoneyes = new PageInfo<MoneyDto>(allMoneys);
        return allMoneyes;
    }





}
