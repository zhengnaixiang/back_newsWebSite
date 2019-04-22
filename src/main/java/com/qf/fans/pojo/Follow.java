package com.qf.fans.pojo;

import lombok.Data;

@Data
public class Follow {
    /*类别的id*/
    int follow_id;
    /*粉丝id*/
    int from_user_id;
    /*关注者的id*/
    int to_user_id;
}
