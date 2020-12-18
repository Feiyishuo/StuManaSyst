package com.JavaG.service;

import com.JavaG.domain.User;
import org.springframework.stereotype.Service;

//使用者登录，修改密码等

public interface UserService {
    boolean checkUserIsExist(String username);
    User login(User user);
    User getUser(String username);
    void updatePass(String username,String newPass);

}
