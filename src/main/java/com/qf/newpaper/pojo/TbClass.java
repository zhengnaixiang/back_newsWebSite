package com.qf.newpaper.pojo;

import javax.persistence.*;

@Table(name = "class")
public class TbClass {
    @Id
    @Column(name = "class_id")
    private Integer classId;

    /**
     * 类别名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * @return class_id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取类别名称
     *
     * @return class_name - 类别名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置类别名称
     *
     * @param className 类别名称
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}
