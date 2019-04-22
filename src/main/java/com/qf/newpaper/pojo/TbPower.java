package com.qf.newpaper.pojo;

import javax.persistence.*;

@Table(name = "power")
public class TbPower {
    @Id
    @Column(name = "power_id")
    private Integer powerId;

    @Column(name = "user_power")
    private Integer userPower;

    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * @return power_id
     */
    public Integer getPowerId() {
        return powerId;
    }

    /**
     * @param powerId
     */
    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    /**
     * @return user_power
     */
    public Integer getUserPower() {
        return userPower;
    }

    /**
     * @param userPower
     */
    public void setUserPower(Integer userPower) {
        this.userPower = userPower;
    }

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
