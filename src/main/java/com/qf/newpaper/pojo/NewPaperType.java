package com.qf.newpaper.pojo;

/**
 * @author XingDi@Jchvip.com
 * @date2019/4/1615:28
 */
public class NewPaperType {
    public int class_id;
    public String class_name;

    public NewPaperType(int class_id, String class_name) {
        this.class_id = class_id;
        this.class_name = class_name;
    }

    public NewPaperType() {
    }

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

    @Override
    public String toString() {
        return "NewPaperType{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
