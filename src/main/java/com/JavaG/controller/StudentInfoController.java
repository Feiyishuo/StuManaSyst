package com.JavaG.controller;


import com.JavaG.domain.Student;
import com.JavaG.service.StudentInfoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/studentInfo")
public class StudentInfoController {


    @Autowired
    private StudentInfoService studentInfoService;



    /**
     * 查找所有
     * @return
     */
    @RequestMapping(value = "/findAll",method = {RequestMethod.GET})
    public @ResponseBody List<Student> findAll(){
        return studentInfoService.findAll();
    }


    /**
     * 根据专业id获取学生信息
     * @param majorId
     * @return
     */
    @RequestMapping(value = "/findStudentByMajorId",method = {RequestMethod.GET})
    public @ResponseBody List<Student> findStudentByMajorId(@RequestParam Integer majorId){
        return studentInfoService.findStudentByMajorId(majorId);
    }


    /**
     * 根据学院id获取学生信息
     * @param academyId
     * @return
     */
    @RequestMapping(value = "/findStudentByAcademyId",method = {RequestMethod.GET})
    public @ResponseBody List<Student> findStudentByAcademyId(@RequestParam Integer academyId){
        return studentInfoService.findStudentByAcademyId(academyId);
    }




    /**
     * 根据学生id获取学生详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/findStudentDetailsById",method = {RequestMethod.GET})
    public @ResponseBody Student findStudentDetailsById(@RequestParam String id){
        return studentInfoService.findStudentDetailsById(id);
    }


    /**
     * 单条插入学生信息
     * @param student
     * @return
     */
    @RequestMapping(value = "/insertOneStudentInfo",method = {RequestMethod.POST})
    public void insertOneStudentInfo(@RequestBody Student student, HttpServletResponse response) throws IOException {

        int count = studentInfoService.insertOneStudentInfo(student);
        HashMap<String, Integer> map = new HashMap<>();
        if(count == 1){
            map.put("code",1);
        }else{
            map.put("code",0);
        }
        response.getWriter().write(new ObjectMapper().writeValueAsString(map));


    }



    /**
     * 根据id来删除学生信息
     * @param student
     */
    @RequestMapping(value = "/deleteStudentInfo",method = {RequestMethod.POST})
    public void deleteStudentInfo(@RequestBody Student student, HttpServletResponse response) throws IOException{
        int count = studentInfoService.deleteStudentInfo(student.getId());
        HashMap<String, Integer> map = new HashMap<>();
        if(count == 1){
            map.put("code",1);
        }else{
            map.put("code",0);
        }
        response.getWriter().write(new ObjectMapper().writeValueAsString(map));

    }



    /**
     * 更新学生信息
     * @param student
     */
    @RequestMapping(value = "/updateStudentInfo",method = {RequestMethod.POST})
    public void updateStudentInfo(@RequestBody Student student, HttpServletResponse response) throws IOException{

        int count = studentInfoService.updateStudentInfo(student);
        HashMap<String, Integer> map = new HashMap<>();
        if(count == 1){
            map.put("code",1);
        }else{
            map.put("code",0);
        }
        response.getWriter().write(new ObjectMapper().writeValueAsString(map));
    }

}
