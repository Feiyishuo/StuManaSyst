package com.JavaG.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Teacher implements Serializable {

    private Integer id;//职工号
    private String name;//姓名
    private String sex;//性别
    private String nation;//民族
    private String politicsStatus;//政治面貌
    private String idCard;//身份证号
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;//入职时间
    private String phoneNum;//电话号码
    private Integer age;//年龄
    private Major major;//专业
    private Academy academy;//学院

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", politicsStatus='" + politicsStatus + '\'' +
                ", idCard='" + idCard + '\'' +
                ", createTime=" + createTime +
                ", phoneNum='" + phoneNum + '\'' +
                ", age=" + age +
                ", major=" + major +
                ", academy=" + academy +
                '}';
    }
}
