package com.qf.Classes.mapper;

import com.qf.Classes.pojo.Classes;
import com.qf.Classes.vo.ClassesVo;

import java.util.List;

public interface ClassesMapper {

    public List <Classes> getClassesList(Classes classes);

    public List <Classes> getClassesBy(Classes classes);

    public Integer updateClasses(Classes classes);

    public Integer deleteClasses(Integer class_id);

    public List <Classes> getParentClasses();

    public List <Classes> getAllClasses();

    public Integer addClasses(Classes classes);

    public Integer deleteAll(ClassesVo classesVo);
}
