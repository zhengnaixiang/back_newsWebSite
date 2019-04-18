package com.qf.MyClass.mapper;

import com.qf.MyClass.pojo.MyClass;

import java.util.List;

public interface MyClassMapper {
    /**
     * 获取新闻类别列表，显示回前端
     * @return
     */
    List<MyClass>getList();
}
