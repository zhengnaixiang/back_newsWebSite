package com.qf.Classes.controller;

import com.qf.Classes.dto.ClassesDto;
import com.qf.Classes.pojo.Classes;
import com.qf.Classes.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    ClassesService classesService;

    @ResponseBody
    @RequestMapping(value = "getClassesCountList",method = RequestMethod.POST)
    public List<ClassesDto> getClassesCountList(){
        return classesService.getClassesCountList();
    }

    @ResponseBody
    @RequestMapping(value = "initClasses", method = RequestMethod.POST)
    public Classes getClassesBy(@RequestBody Classes classes) {
        return classesService.getClassesBy(classes).get(0);
    }


    @ResponseBody
    @RequestMapping(value = "updateClasses",method = RequestMethod.POST)
    public boolean updateClasses(@RequestBody Classes classes) {
        return classesService.updateClasses(classes);
    }

    @ResponseBody
    @RequestMapping(value = "deleteClasses",method = RequestMethod.POST)
    public boolean deleteClasses(@RequestParam Integer class_id) {
        System.out.println("=================================="+class_id);
        return classesService.deleteClasses(class_id);
    }

}
