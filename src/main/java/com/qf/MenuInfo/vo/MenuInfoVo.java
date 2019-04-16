package com.qf.MenuInfo.vo;

import java.util.List;

public class MenuInfoVo {
    int power;
    List<Integer> menuSelected;
    List<Integer> menuUnSelected;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Integer> getmenuSelected() {
        return menuSelected;
    }

    public void setmenuSelected(List<Integer> menuSelected) {
        this.menuSelected = menuSelected;
    }

    public List<Integer> getmenuUnSelected() {
        return menuUnSelected;
    }

    public void setmenuUnSelected(List<Integer> menuUnSelected) {
        this.menuUnSelected = menuUnSelected;
    }

    public MenuInfoVo() {
    }

    public MenuInfoVo(int power, List<Integer> menuSelected, List<Integer> menuUnSelected) {
        this.power = power;
        this.menuSelected = menuSelected;
        this.menuUnSelected = menuUnSelected;
    }

    @Override
    public String toString() {
        return "MenuInfoVo{" +
                "power=" + power +
                ", menuSelected=" + menuSelected +
                ", menuUnSelected=" + menuUnSelected +
                '}';
    }
}
