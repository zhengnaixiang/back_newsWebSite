package com.qf.userInfo.service;

import com.qf.userInfo.pojo.UserInfo;
import com.qf.userInfo.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService {

    UserInfo loginCheck(UserInfo userInfo);

    boolean addUserInfo(UserInfo userInfo);

    boolean deleteUserInfoById(int user_id);

    boolean batchDeleteUserInfo(String[] ids);

    boolean updateUserInfo(UserInfo userInfo);

    int getUserInfoCount(UserInfoVo userInfoVo);

    boolean checkUserInfo(UserInfo userInfo);

    List<UserInfo> userInfoList(UserInfoVo userInfoVo);

    List<UserInfo> getUserInfoBy(UserInfo userInfo);
}
