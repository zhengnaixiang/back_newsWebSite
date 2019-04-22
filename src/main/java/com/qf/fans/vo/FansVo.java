package com.qf.fans.vo;

import lombok.Data;

@Data
public class FansVo {
    /*用户名称*/
    String user_alias;
    /*关注量*/
    int to_user_id;
    /*粉丝数*/
    int from_user_id;
    /*当前页*/
    int currentPage;
    /*每页展示的数据*/
    int pageSize;
}
