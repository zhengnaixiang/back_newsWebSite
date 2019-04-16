package com.qf.test;

import com.qf.Classes.pojo.Classes;
import com.qf.Classes.service.ClassesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
        ClassesService classesService= context.getBean(ClassesService.class);
//        Classes classes = new Classes();
//        classes.setClass_id(6);
//        System.out.println(classesService.getClassesBy(classes).get(0));
//        System.out.println(classesService.getClassesCountList());
        System.out.println(classesService.deleteClasses(6));
    }


}
