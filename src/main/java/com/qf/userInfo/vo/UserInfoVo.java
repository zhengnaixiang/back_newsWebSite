package com.qf.userInfo.vo;

import com.qf.userInfo.tools.SplitePageBean;

public class UserInfoVo {
    SplitePageBean splitePageBean;

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "splitePageBean=" + splitePageBean +
                ", user_alias='" + user_alias + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }

    public String getUser_alias() {
        return user_alias;
    }

    public void setUser_alias(String user_alias) {
        this.user_alias = user_alias;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String user_alias;

    String user_tel;

    String username;

}
