package com.lening.entity;

public class SubjectBean {
    private Integer sid;

    private String sname;

    private Integer sduration;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSduration() {
        return sduration;
    }

    public void setSduration(Integer sduration) {
        this.sduration = sduration;
    }
}