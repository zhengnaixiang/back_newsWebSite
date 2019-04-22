package com.qf.userInfo.service.serviceImpl;

import com.qf.userInfo.mapper.UserInfoMapper;
import com.qf.userInfo.pojo.UserInfo;
import com.qf.userInfo.service.UserInfoService;
import com.qf.userInfo.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired(required = false)
    UserInfoMapper userInfoMapper;

    public UserInfo loginCheck(UserInfo userInfo) {
        return userInfoMapper.loginCheck(userInfo);
    }

    @Transactional
    public boolean addUserInfo(UserInfo userInfo) {
        return userInfoMapper.addUserInfo(userInfo)>0;
    }

    @Transactional
    public boolean deleteUserInfoById(int user_id) {
        return userInfoMapper.deleteUserInfoById(user_id)>0;
    }

    @Transactional
    public boolean batchDeleteUserInfo(String[] ids) {
        return userInfoMapper.batchDeleteUserInfo(ids)>0;
    }

    @Transactional
    public boolean updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateUserInfo(userInfo)>0;
    }

    public int getUserInfoCount(UserInfoVo userInfoVo) {
        return userInfoMapper.getUserInfoCount(userInfoVo);
    }

    public boolean checkUserInfo(UserInfo userInfo) {
        return userInfoMapper.checkUserInfo(userInfo)>0;
    }

    public List<UserInfo> userInfoList(UserInfoVo userInfoVo) {
        return userInfoMapper.userInfoList(userInfoVo);
    }

    public List<UserInfo> getUserInfoBy(UserInfo userInfo) {
        return userInfoMapper.getUserInfoBy(userInfo);
    }
}