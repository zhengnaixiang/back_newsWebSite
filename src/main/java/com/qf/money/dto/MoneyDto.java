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
}
