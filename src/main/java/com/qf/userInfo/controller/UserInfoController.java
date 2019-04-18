package com.qf.userInfo.controller;

import com.qf.userInfo.dto.UserInfoDto;
import com.qf.userInfo.pojo.UserInfo;
import com.qf.userInfo.service.UserInfoService;
import com.qf.userInfo.tools.Md5Utils;
import com.qf.userInfo.tools.UserInfoUtlis;
import com.qf.userInfo.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.lang.reflect.Field;
import java.util.List;


@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;


    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String loginCheck(@RequestBody UserInfo userInfo){
        userInfo.setPassword(Md5Utils.encodePassword(userInfo.getPassword()));
        Boolean b = userInfoService.loginCheck(userInfo)!=null;
        return b.toString();
    }

    @RequestMapping(value = "checkUserInfo",method = RequestMethod.POST)
    public String checkUserInfo(@RequestBody UserInfo userInfo){
        Boolean b = userInfoService.checkUserInfo(userInfo);
        return b.toString();
    }

    @RequestMapping(value = "addUserInfoMethod",method = RequestMethod.POST)
    public String addUserInfoMethod(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest request){
        UserInfo userInfo = new UserInfo();
       UserInfoUtlis.setUser_img(file,userInfo );
       UserInfoUtlis.setObject(request,userInfo );
       userInfo.setPassword(Md5Utils.encodePassword(userInfo.getPassword()));
        Boolean b = userInfoService.addUserInfo(userInfo);
        return "<script type='text/javascript'>onload = function(){location.href='user.html'}</script>";
    }

    @RequestMapping(value = "deleteUserInfoById",method = RequestMethod.POST)
    public String deleteUserInfoById(@RequestBody UserInfo userInfo){
        Boolean b = userInfoService.deleteUserInfoById(userInfo.getUser_id());
        return b.toString();
    }
    @RequestMapping(value = "deleteUserInfoById2",method = RequestMethod.POST)
    public String deleteUserInfoById2(@RequestParam int id){
        Boolean b = userInfoService.deleteUserInfoById(id);
        return b.toString();
    }

    @RequestMapping(value = "batchDeleteUserInfo",method = RequestMethod.POST)
    public String batchDeleteUserInfo(@RequestBody String[] ids){
        Boolean b = userInfoService.batchDeleteUserInfo(ids);
        return b.toString();
    }

    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    public String updateUserInfo(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request){
        UserInfo userInfo = new UserInfo();
        UserInfoUtlis.setUser_img(file,userInfo );
        UserInfoUtlis.setObject(request,userInfo );
        Boolean b = userInfoService.updateUserInfo(userInfo);
        return "<script type='text/javascript'>onload = function(){location.href='user.html'}</script>";
    }

    @RequestMapping(value = "userInfoList",method = RequestMethod.POST)
    public UserInfoDto userInfoList(@RequestBody(required = false) UserInfoVo userInfoVo){
        Class<UserInfoVo> vo = UserInfoVo.class;
        Field[] fields = vo.getDeclaredFields();
        try {
            for (Field f : fields) {
                f.setAccessible(true);
                Object o = f.get(userInfoVo);
                if (o instanceof String) {
                    o = (String) o;
                    if (o != null && o != "") {
                        f.set(userInfoVo, "%" + o + "%");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        int count = userInfoService.getUserInfoCount(userInfoVo);
        int i=count/userInfoVo.getSplitePageBean().getPageSize();
        userInfoVo.getSplitePageBean().setPageCount(count%userInfoVo.getSplitePageBean().getPageSize()==0?i:(i+1));
        List<UserInfo> userInfos = userInfoService.userInfoList(userInfoVo);
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setList(userInfos);
        userInfoDto.setSplitePageBean(userInfoVo.getSplitePageBean());
        return userInfoDto;
    }

    @RequestMapping(value = "getUserInfoBy",method = RequestMethod.POST)
    public List<UserInfo> getUserInfoBy(@RequestBody UserInfo userInfo){
        List<UserInfo> userInfos = userInfoService.getUserInfoBy(userInfo);
        return userInfos;
    }

}
