package com.JavaG.domain;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    private Integer sNum;       //学号
    private String sName;       //姓名
    private String sSex;        //性别
    private String sEthnic;     //民族
    private String sHome;       //籍贯
    private Date sYear;         //入学年份
    private String sMajor;      //专业
    private String sCollege;    //学院
    private Date sBirth;        //出生日期
    private String sID;         //身份证号
    private String sPhone;      //电话
    private String sAddress;    //住址
    private String sInstructor; //辅导员


    public Integer getsNum() {
        return sNum;
    }

    public void setsNum(Integer sNum) {
        this.sNum = sNum;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsEthnic() {
        return sEthnic;
    }

    public void setsEthnic(String sEthnic) {
        this.sEthnic = sEthnic;
    }

    public String getsHome() {
        return sHome;
    }

    public void setsHome(String sHome) {
        this.sHome = sHome;
    }

    public Date getsYear() {
        return sYear;
    }

    public void setsYear(Date sYear) {
        this.sYear = sYear;
    }

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor;
    }

    public String getsCollege() {
        return sCollege;
    }

    public void setsCollege(String sCollege) {
        this.sCollege = sCollege;
    }

    public Date getsBirth() {
        return sBirth;
    }

    public void setsBirth(Date sBirth) {
        this.sBirth = sBirth;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsInstructor() {
        return sInstructor;
    }

    public void setsInstructor(String sInstructor) {
        this.sInstructor = sInstructor;
    }
}