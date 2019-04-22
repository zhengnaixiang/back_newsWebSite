package com.qf.Classes.service;

import com.qf.Classes.pojo.Classes;

import com.qf.Classes.vo.ClassesVo;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ClassesService {
    public List<Classes> getClassesList(Classes classes);

    public List <Classes> getClassesBy(Classes classes);

    public boolean updateClasses(Classes classes);

    public Boolean deleteClasses(Integer class_id);

    public List <Classes> getParentClasses();

    public List <Classes> getAllClasses();

    public Boolean checkClassesName(String class_name);

    public Boolean addClasses(Classes classes);

    public Boolean deleteAll(ClassesVo classesVo);
}
