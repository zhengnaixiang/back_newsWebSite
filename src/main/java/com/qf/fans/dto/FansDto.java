package com.qf.fans.dto;

import lombok.Data;

@Data
public class FansDto {
    /*用户的id*/
    int user_id;
    /*用户的名称*/
    String user_alias;
    /*用户的关注量*/
    int to_user_id;
    /*用户的粉丝数*/
    int from_user_id;
}
