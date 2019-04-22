package com.qf.MenuInfo.controller;

import com.qf.MenuInfo.service.MenuService;
import com.qf.MenuInfo.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuInfoController {
    @Autowired
    MenuService menuService;

    @RequestMapping("getAllMenuByPower")
    public Object getAllMenuByPower(@RequestParam int power) {
        return menuService.getAllMenuByPower(power);
    }


    @Transactional
    @RequestMapping(value = "changeMenuListByPower", method = RequestMethod.POST)
    public Object Test(@RequestBody MenuInfoVo menuInfoVo) {
        System.out.println(menuInfoVo);
        Integer rSet =0;
        rSet += menuService.batchDel(menuInfoVo);
        if(menuInfoVo.getmenuSelected().size()!=0){
            rSet += menuService.batchAdd(menuInfoVo);
        }
        return rSet;
    }

}
