package com.JavaG.domain;

import java.io.Serializable;

public class Course implements Serializable {


    private Integer cNum;      //课程编码
    private String cName;      //课程名称
    private String cTeacher;   //授课教师
    private String cPlace;     //上课地点
    private String cTime;      //上课时间
    private String cType;      //课程类型

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcTeacher() {
        return cTeacher;
    }

    public void setcTeacher(String cTeacher) {
        this.cTeacher = cTeacher;
    }

    public String getcPlace() {
        return cPlace;
    }

    public void setcPlace(String cPlace) {
        this.cPlace = cPlace;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }
}
