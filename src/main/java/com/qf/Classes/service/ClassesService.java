package com.qf.Classes.service;

import com.qf.Classes.dto.ClassesDto;
import com.qf.Classes.pojo.Classes;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ClassesService {
    public List<ClassesDto> getClassesCountList();

    public List <Classes> getClassesBy(Classes classes);

    public boolean updateClasses(Classes classes);

    public boolean deleteClasses(Integer class_id);
}
