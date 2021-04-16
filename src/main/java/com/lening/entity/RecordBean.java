package com.lening.entity;

import java.util.Date;

public class RecordBean {
    private Integer rid;

    private Date rdate;

    private Integer rduration;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Integer getRduration() {
        return rduration;
    }

    public void setRduration(Integer rduration) {
        this.rduration = rduration;
    }
}