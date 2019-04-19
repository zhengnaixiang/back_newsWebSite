package com.qf.money.service;

import com.qf.money.dto.MoneyDto;
import com.qf.money.vo.MoneyVo;

import java.util.List;

public interface MoneyService {

    /**
     * 统计金钱总量
     * @return 金钱总数
     */
    public Integer getAllMoneyCount();

    /**
     * 获取金钱管理列表的相关信息
     * @return 用户与金钱总数的信息
     */
    public List<MoneyDto> getMoneyCountByUser(MoneyVo moneyVo);
}
