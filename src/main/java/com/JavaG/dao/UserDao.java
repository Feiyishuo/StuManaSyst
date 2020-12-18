package com.JavaG.dao;

import com.JavaG.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

//与数据库交互，表user_login
@Repository
public interface UserDao {

    //根据用户名和密码查询单个
    //@Select("select * from user_login where username = #{username} and password = #{password} ")
    User getUser(@Param("username") String username, @Param("password")String password);

    //根据用户名修改用户密码
    //@Update("update user_login set password = #{newPass} where username = #{username}")
    void updatePass(@Param("username") String username, @Param("newPass") String newPass);

    //查找用户
    //@Select("select * from user_login where username = #{username}")
    User getUserByName(String username);






}




