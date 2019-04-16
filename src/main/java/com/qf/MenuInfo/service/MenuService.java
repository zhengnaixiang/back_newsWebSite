package com.qf.MenuInfo.service;

import com.qf.MenuInfo.dto.MenuInfoDto;
import com.qf.MenuInfo.vo.MenuInfoVo;


import java.util.List;

public interface MenuService {
   List<MenuInfoDto> getAllMenuByPower(int power);
   Integer batchAdd(MenuInfoVo vo);
   Integer batchDel(MenuInfoVo vo);

}
