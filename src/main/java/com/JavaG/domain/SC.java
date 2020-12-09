package com.JavaG.domain;

import java.io.Serializable;

public class SC implements Serializable {

    private String sNum;   //学号
    private String cNum;   //课程编码
    private String grade;  //成绩

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
