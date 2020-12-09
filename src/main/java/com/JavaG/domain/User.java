package com.JavaG.domain;

import java.io.Serializable;

public class User implements Serializable {

    private String userName;//用户名
    private String userPwd;//密码
    private String userType;//权限wode

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
