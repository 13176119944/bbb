package com.lening.entity;

import java.util.Date;

public class TraineeBean {
    private Integer tid;

    private String tname;

    private String tsex;

    private Integer age;

    private Date tindate;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getTindate() {
        return tindate;
    }

    public void setTindate(Date tindate) {
        this.tindate = tindate;
    }
}