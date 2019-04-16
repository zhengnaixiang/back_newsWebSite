package com.qf.MenuInfo.service.serviceImpl;

import com.qf.MenuInfo.dto.MenuInfoDto;
import com.qf.MenuInfo.mapper.MenuInfoMapper;
import com.qf.MenuInfo.service.MenuService;
import com.qf.MenuInfo.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> getAllMenuByPower(int power) {
        return menuInfoMapper.getAllMenuByPower(power);
    }

    public Integer batchAdd(MenuInfoVo vo) {
        return menuInfoMapper.batchAdd(vo);
    }

    public Integer batchDel(MenuInfoVo vo) {
        return menuInfoMapper.batchDel(vo);
    }
}
