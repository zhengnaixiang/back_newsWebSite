package com.qf.newpaper.pojo;

import javax.persistence.*;

@Table(name = "class_newpaper")
public class TbClass_newpaper {
    @Id
    @Column(name = "cn_id")
    private Integer cnId;

    /**
     * 类别id
     */
    @Column(name = "class_id")
    private Integer classId;

    /**
     * 新闻id
     */
    @Column(name = "np_id")
    private Integer npId;

    /**
     * @return cn_id
     */
    public Integer getCnId() {
        return cnId;
    }

    /**
     * @param cnId
     */
    public void setCnId(Integer cnId) {
        this.cnId = cnId;
    }

    /**
     * 获取类别id
     *
     * @return class_id - 类别id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 设置类别id
     *
     * @param classId 类别id
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取新闻id
     *
     * @return np_id - 新闻id
     */
    public Integer getNpId() {
        return npId;
    }

    /**
     * 设置新闻id
     *
     * @param npId 新闻id
     */
    public void setNpId(Integer npId) {
        this.npId = npId;
    }
}
