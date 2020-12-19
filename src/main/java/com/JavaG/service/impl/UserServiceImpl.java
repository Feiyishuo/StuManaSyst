package com.JavaG.service.impl;


import com.JavaG.dao.UserDao;
import com.JavaG.domain.Student;
import com.JavaG.domain.User;

import com.JavaG.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//实现UserService
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User login(User user){
        return userDao.getUser(user.getUsername(),user.getPassword());
    }

    public boolean checkUserIsExist(String username) {
        User result = userDao.getUserByName(username);
        if (result == null) {
            return false;
        }
        return true;
    }

    public User getUser(String username) {
        return userDao.getUserByName(username);
    }


    public void updatePass(String username, String newPass) {
        userDao.updatePass(username, newPass);
    }


    public ArrayList<Student> getAllUsers() {
        return userDao.getAllUsers();
    }
    @Override
    public void enableUser(int id) {
        userDao.updateUserStatus(id,1);
    }
    @Override
    public void disableUser(int id) {
        userDao.updateUserStatus(id,0);
    }


}


