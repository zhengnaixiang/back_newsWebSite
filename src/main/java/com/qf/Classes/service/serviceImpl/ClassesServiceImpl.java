package com.qf.Classes.service.serviceImpl;

import com.qf.Classes.mapper.ClassesMapper;
import com.qf.Classes.pojo.Classes;
import com.qf.Classes.service.ClassesService;
import com.qf.Classes.vo.ClassesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    ClassesMapper classesMapper;

    public List <Classes> getClassesList(Classes classes) {
        return classesMapper.getClassesList(classes);
    }



    public List <Classes> getClassesBy(Classes classes) {
        return classesMapper.getClassesBy(classes);
    }

    public boolean updateClasses(Classes classes) {
        return classesMapper.updateClasses(classes)>0?true:false;
    }

    public Boolean deleteClasses(Integer class_id) {
        return classesMapper.deleteClasses(class_id)>0?true:false;
    }

    public List <Classes> getParentClasses() {
        return classesMapper.getParentClasses();
    }

    public List <Classes> getAllClasses() {
        return classesMapper.getAllClasses();
    }

    public Boolean checkClassesName(String class_name) {
        List <Classes> allClasses = classesMapper.getAllClasses();
        for (Classes classes : allClasses) {
            if (classes.getClass_name().equals(class_name)) {
                return false;
            }
        }
        return true;
    }

    public Boolean addClasses(Classes classes) {
        return classesMapper.addClasses(classes)>0?true:false;
    }

    public Boolean deleteAll(ClassesVo classesVo) {
        return classesMapper.deleteAll(classesVo)>0?true:false;
    }


}
