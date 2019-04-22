package com.qf.MenuInfo.dto;

import java.io.Serializable;
import java.util.List;

public class MenuInfoDto implements Serializable {
    int id;
    int pid;
    int seqno;
    String name;
    String url;
    int open = 1;
    int checked;
    List<MenuInfoDto> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public boolean isOpen() {
        if(this.open==1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isChecked() {
        if(checked==1){
            return true;
        }else{
            return false;
        }
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    public List<MenuInfoDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuInfoDto> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuInfoDto{" +
                "id=" + id +
                ", pid=" + pid +
                ", seqno=" + seqno +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", open=" + open +
                ", checked=" + checked +
                ", children=" + children +
                '}';
    }
}
