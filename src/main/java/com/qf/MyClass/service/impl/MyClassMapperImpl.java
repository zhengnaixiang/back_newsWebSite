package com.qf.MyClass.service.impl;

import com.qf.MyClass.mapper.MyClassMapper;
import com.qf.MyClass.pojo.MyClass;
import com.qf.MyClass.service.MyClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MyClassMapperImpl implements MyClassService {
    @Autowired
    MyClassMapper myClassMapper;

    public List<MyClass> getList() {
        return myClassMapper.getList();
    }
}
