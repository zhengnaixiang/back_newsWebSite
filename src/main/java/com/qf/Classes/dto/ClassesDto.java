package com.qf.Classes.dto;


public class ClassesDto {
    Integer class_id;
    String class_name;
    Integer num;

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ClassesDto{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                ", num=" + num +
                '}';
    }
}
