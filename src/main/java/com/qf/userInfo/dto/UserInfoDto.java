package com.qf.userInfo.dto;

import com.qf.userInfo.pojo.UserInfo;
import com.qf.userInfo.tools.SplitePageBean;

import java.util.List;

public class UserInfoDto {
    List<UserInfo> list;
    SplitePageBean splitePageBean;

    public List<UserInfo> getList() {
        return list;
    }

    public void setList(List<UserInfo> list) {
        this.list = list;
    }

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }
}
