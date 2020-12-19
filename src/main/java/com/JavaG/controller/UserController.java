package com.JavaG.controller;


import com.JavaG.dao.UserDao;
import com.JavaG.domain.Student;
import com.JavaG.domain.User;
import com.JavaG.service.UserService;


import com.JavaG.tool.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Map;


import javax.servlet.http.HttpSession;
//User控制类
@RestController
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private UserDao userDao;
    //登录
    @RequestMapping(value = "/api/login",method = RequestMethod.POST)
    public Response login(@RequestBody User user, HttpSession session){
        if(user==null){
            return new Response().failure("用户为空");
        }
        User result =userService.login(user);
        //登陆成功
        if(result!=null){
            if(result.getStatus()==1){//检测账号状态
                session.setAttribute("USER_SESSION",result);
                return new Response().success();
            }else {
                return new Response().failure("账号被禁用");
            }

        }
        return new Response().failure("账号或密码错误");
    }

    //修改密码
    @RequestMapping(value = "/api/updatePass",method = RequestMethod.POST)
    public Response updatePass(@RequestBody Map<String, String> map, HttpSession session){

        User Pwduser = userDao.getUserByName(map.get("username"));
        if(!userService.checkUserIsExist(map.get("username"))){
            return new Response().failure("该用户不存在！");
        }
        else if(!Pwduser.getPassword().equals(map.get("oldPass"))){
            return new Response().failure("请输入正确的原密码");
        }else{
            userService.updatePass(Pwduser.getUsername(),map.get("newPass"));
            return new Response().success();
        }
    }

    //退出登录
    @RequestMapping(value = "/api/logout",method = RequestMethod.GET)
    public Response logout(HttpSession session){

        session.removeAttribute("USER_SESSION");
        return new Response().success();
    }

    //获得所有Users
    @RequestMapping("/api/getAllUsers")
    public Response getAllUsers (HttpServletRequest request, HttpSession session){

        ArrayList<Student> users=userService.getAllUsers();
        return new Response().success(users);
    }

    //禁用Users
    @RequestMapping("/api/enableUser")
    public Response enableUser(HttpServletRequest request, HttpSession session){
        //启用用户
        User user =(User) session.getAttribute("USER_SESSION");
        String id=request.getParameter("id");
        userService.enableUser(Integer.parseInt(id));
        return new Response().success();

    }

    //启用Users
    @RequestMapping("/api/disableUser")
    public Response disableUser(HttpServletRequest request, HttpSession session){
        //禁用用户
        User user =(User) session.getAttribute("USER_SESSION");
        String id=request.getParameter("id");

        userService.disableUser(Integer.parseInt(id));
        return new Response().success();
    }


}
