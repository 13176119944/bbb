package com.lening.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TraineeVo implements Serializable {
    private int tid;

    private String tname;

    private String tsex;

    private int age;

    private Date tindate;

    private int cid;

    private String cname;

    private Date cbirth;

    private String csex;

    private int rduration;

}
