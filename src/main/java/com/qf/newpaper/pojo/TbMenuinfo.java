package com.qf.newpaper.pojo;

import javax.persistence.*;

@Table(name = "menuinfo")
public class TbMenuinfo {
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 菜单连接地址
     */
    @Column(name = "menu_url")
    private String menuUrl;

    /**
     * 父菜单id
     */
    @Column(name = "parent_id")
    private Integer parentId;

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

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取菜单连接地址
     *
     * @return menu_url - 菜单连接地址
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 设置菜单连接地址
     *
     * @param menuUrl 菜单连接地址
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * 获取父菜单id
     *
     * @return parent_id - 父菜单id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父菜单id
     *
     * @param parentId 父菜单id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
