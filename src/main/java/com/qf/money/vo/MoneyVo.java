package com.qf.money.vo;

import lombok.Data;

@Data
public class MoneyVo {
    /*用户的id*/
    int user_id;
    /*用户的名称*/
    String user_alias;
    /*用户的金额总数*/
    String sum;
    /*当前页数*/
    int currentPage;
    /*每页展示的数量*/
    int pageSize;
}
