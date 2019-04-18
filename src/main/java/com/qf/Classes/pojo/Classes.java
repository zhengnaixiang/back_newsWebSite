package com.qf.Classes.pojo;

public class Classes {
    Integer class_id;
    String class_name;
    Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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


    @Override
    public String toString() {
        return "Classes{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                ", status=" + status +
                '}';
    }
}
