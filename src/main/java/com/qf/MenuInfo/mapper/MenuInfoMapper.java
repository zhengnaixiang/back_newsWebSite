package com.qf.MenuInfo.mapper;

import com.qf.MenuInfo.dto.MenuInfoDto;
import com.qf.MenuInfo.vo.MenuInfoVo;

import java.util.List;

public interface MenuInfoMapper {
    List<MenuInfoDto> getAllMenuByPower(int power);
    Integer batchAdd(MenuInfoVo vo);
    Integer batchDel(MenuInfoVo vo);
}
