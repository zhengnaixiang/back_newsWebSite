package com.qf.newpaper.controller;

import com.qf.newpaper.pojo.NewPaper;
import com.qf.newpaper.pojo.NewPaperType;
import com.qf.newpaper.service.AddNewPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author XingDi@Jchvip.com
 * @date2019/4/1618:33
 */
@Controller
public class NewPaperController {
    @Autowired
    AddNewPaperService addNewPaperService;

    @RequestMapping(value = "addNew",method = RequestMethod.POST)
    @ResponseBody
    public  Object addNew(@RequestBody NewPaper newPaper){
        boolean b = addNewPaperService.addNew(newPaper);
        System.out.println(b);
        return b;
    }
    @RequestMapping(value = "showClass",method = RequestMethod.POST)
    @ResponseBody
    public  Object showClass(){
        List<NewPaperType> newPaperTypes = addNewPaperService.showClass();
        System.out.println(newPaperTypes);
        return newPaperTypes;
    }



}
