package com.qf.money.dto;

import lombok.Data;

@Data
public class MoneyDto {

    /*用户的id*/
    int user_id;
    /*用户的别名*/
    String user_alias;
    /*用户的金钱总数*/
    int sum;

    /*用户的交易状态*/
    int state;
    /*用户交易的金额*/
    int amount;
    /*用户的交易时间*/
    String operation_date;
}
