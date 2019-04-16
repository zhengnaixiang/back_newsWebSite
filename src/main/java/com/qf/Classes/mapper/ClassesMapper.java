package com.qf.Classes.mapper;

import com.qf.Classes.dto.ClassesDto;
import com.qf.Classes.pojo.Classes;

import java.util.List;

public interface ClassesMapper {

    public List <ClassesDto> getClassesCountList();

    public List <Classes> getClassesBy(Classes classes);

    public Integer updateClasses(Classes classes);

    public Integer deleteClasses(Integer class_id);
}
