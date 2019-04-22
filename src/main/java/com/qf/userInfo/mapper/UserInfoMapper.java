package com.qf.userInfo.mapper;

import com.qf.userInfo.pojo.UserInfo;
import com.qf.userInfo.vo.UserInfoVo;

import java.util.List;

public interface UserInfoMapper {

    UserInfo loginCheck(UserInfo userInfo);

    List<UserInfo> userInfoList(UserInfoVo userInfoVo);

    List<UserInfo> getUserInfoBy(UserInfo userInfo);

    int addUserInfo(UserInfo userInfo);

    int deleteUserInfoById(int user_id);

    int batchDeleteUserInfo(String[] ids);

    int updateUserInfo(UserInfo userInfo);

    int checkUserInfo(UserInfo userInfo);

    int getUserInfoCount(UserInfoVo userInfoVo);

}
