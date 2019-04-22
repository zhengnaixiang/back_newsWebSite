package com.qf.newpaper.dto;

public class WatchClassNameDto {

    private String className;
    private Integer classId;

    public WatchClassNameDto() {
    }

    public WatchClassNameDto(String className, Integer classId) {
        this.className = className;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "WatchClassNameDto{" +
                "className='" + className + '\'' +
                ", classId=" + classId +
                '}';
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
