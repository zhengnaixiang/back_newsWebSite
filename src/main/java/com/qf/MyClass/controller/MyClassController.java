package com.qf.MyClass.controller;

import com.qf.MyClass.service.MyClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyClassController {
    @Autowired
    MyClassService myClassService;

    @RequestMapping(value = "getClassList",method = RequestMethod.POST)
    public Object getClassList() {
        return myClassService.getList();
    }
}
