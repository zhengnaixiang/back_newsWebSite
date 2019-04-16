package com.qf.Classes.service.serviceImpl;

import com.qf.Classes.dto.ClassesDto;
import com.qf.Classes.mapper.ClassesMapper;
import com.qf.Classes.pojo.Classes;
import com.qf.Classes.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    ClassesMapper classesMapper;

    public List <ClassesDto> getClassesCountList() {
        return classesMapper.getClassesCountList();
    }



    public List <Classes> getClassesBy(Classes classes) {
        return classesMapper.getClassesBy(classes);
    }

    public boolean updateClasses(Classes classes) {
        return classesMapper.updateClasses(classes)>0?true:false;
    }

    public boolean deleteClasses(Integer class_id) {
        return classesMapper.deleteClasses(class_id)>0?true:false;
    }

}
