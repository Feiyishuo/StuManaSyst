package com.JavaG.domain;

import java.io.Serializable;

public class SC implements Serializable {

    private Integer sNum;   //学号
    private Integer cNum;   //课程编码
    private Integer grade;  //成绩

    public Integer getsNum() {
        return sNum;
    }

    public void setsNum(Integer sNum) {
        this.sNum = sNum;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
