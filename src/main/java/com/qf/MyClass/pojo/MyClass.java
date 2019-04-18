package com.qf.MyClass.pojo;

public class MyClass {
    int class_id;
    String class_name;

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public MyClass(int class_id, String class_name) {
        this.class_id = class_id;
        this.class_name = class_name;
    }

    public MyClass() {
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
