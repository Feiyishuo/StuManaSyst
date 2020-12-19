package com.JavaG.service;

import com.JavaG.domain.Student;
import com.JavaG.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//使用者登录，修改密码等

public interface UserService {
    boolean checkUserIsExist(String username);
    User login(User user);
    User getUser(String username);
    void updatePass(String username,String newPass);
    void enableUser(int id);//启用
    void disableUser(int id);//禁用
    ArrayList<Student> getAllUsers();

}
