package com.qf.Classes.vo;

import java.util.List;

public class ClassesVo {
    List <Integer> selected;

    public List <Integer> getSelected() {
        return selected;
    }

    public void setSelected(List <Integer> selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "ClassesVo{" +
                "selected=" + selected +
                '}';
    }
}
