package com.qf.Classes.controller;

import com.qf.Classes.pojo.Classes;
import com.qf.Classes.service.ClassesService;
import com.qf.Classes.vo.ClassesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class ClassController {

    @Autowired
    ClassesService classesService;


    /**
     * 获取分类列表，附带模糊查询
     * @param classes
     * @return List<Classes>
     */
    @ResponseBody
    @RequestMapping(value = "getClassesList",method = RequestMethod.POST)
    public List<Classes> getClassesList(@RequestBody(required = false) Classes classes){
        String classesNameLike = "%"+classes.getClass_name()+"%";
        classes.setClass_name(classesNameLike);
        return classesService.getClassesList(classes);
    }




    /**
     * 根据参数classes的属性获取对应classes对象,修改页面的回显信息
     * @param classes
     * @return Classes对象
     */
    @ResponseBody
    @RequestMapping(value = "initClasses", method = RequestMethod.POST)
    public Classes initClasses(@RequestBody Classes classes) {
        return classesService.getClassesBy(classes).get(0);
    }

    /**
     * 根据页面获取的classes属性，修改classes对象
     * @param classes
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "updateClasses",method = RequestMethod.POST)
    public Boolean updateClasses(@RequestBody Classes classes) {
        if (classesService.checkClassesName(classes.getClass_name())) {
            return classesService.updateClasses(classes);

        }
        return false;
    }

    /**
     * 根据参数class_id,伪删除对应的Classes对象
     * @param class_id
     * @return String
     */
    @ResponseBody
    @RequestMapping(value = "deleteClasses",method = RequestMethod.GET)
    public String deleteClasses(@RequestParam Integer class_id) {
        return classesService.deleteClasses(class_id).toString();
    }


    /**
     * 获取父类分类的列表，用于添加分类页面的父类下拉菜单
     * @return
     */
//    @ResponseBody
//    @RequestMapping(value = "getParentClasses",method = RequestMethod.POST)
//    public List<Classes> getParentClasses() {
//        return classesService.getParentClasses();
//    }

    /**
     * 添加新的分类
     * @param classes
     * @return String
     */
    @ResponseBody
    @RequestMapping(value = "addClasses", method = RequestMethod.POST)
    public Boolean addClasses(@RequestBody Classes classes) {
        System.out.println("进入controller");
        if (classesService.checkClassesName(classes.getClass_name())) {
            return classesService.addClasses(classes);
        }
        return false;
    }

    /**
     * 分类批量删除
     * @param classesVo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteAll",method = RequestMethod.POST)
    public Boolean deleteAll(@RequestBody ClassesVo classesVo) {
        return classesService.deleteAll(classesVo);
    }

}
