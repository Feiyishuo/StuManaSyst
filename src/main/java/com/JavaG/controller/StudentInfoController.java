package com.JavaG.controller;


import com.JavaG.domain.Account;
import com.JavaG.domain.Student;
import com.JavaG.service.StudentInfoService;
import com.JavaG.service.impl.StudentInfoServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api/studentInfo",produces = {"application/json;charset=UTF-8"})
public class StudentInfoController {


    @Autowired
    private StudentInfoService studentInfoService;



    /**
     * 查找所有
     * @return
     */
    @RequestMapping("/findAll")
    public List<Student> findAll(){
        System.out.println("表现层：查询所有学生...");
        List<Student> list = studentInfoService.findAll();
        for(Student student:list){
            System.out.println(student);
        }
        return list;
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
     * @param
     * @return
     */

    @RequestMapping(value = "/findStudentDetailsById",method = {RequestMethod.POST})
    public  Student findStudentDetailsById(@RequestBody Student student){
        System.out.println("studentInfoController");
//        JSONObject object = new JSONObject();
        Integer id=student.getId();
        Student stu=studentInfoService.findStudentDetailsById(id);
//        object.put("student", stu);

        System.out.println(stu);
        return stu;
    }


    /**
     * 单条插入学生信息
     * @param student
     * @return
     */
    @RequestMapping(value = "/insertOneStudentInfo",method = {RequestMethod.POST})
    public Boolean insertOneStudentInfo(@RequestBody Student student)  {

        return studentInfoService.insertOneStudentInfo(student);

//        HashMap<String, Integer> map = new HashMap<>();
//        if(count == 1){
//            map.put("code",1);
//        }else{
//            map.put("code",0);
//        }
//        response.getWriter().write(new ObjectMapper().writeValueAsString(map));


    }



    /**
     * 根据id来删除学生信息
     * @param student
     */
    @RequestMapping(value = "/deleteStudentInfo",method = {RequestMethod.POST})
    public void deleteStudentInfo(@RequestBody Student student, HttpServletResponse response) throws IOException{
        Boolean count = studentInfoService.deleteStudentInfo(student.getId());
        HashMap<String, Integer> map = new HashMap<>();
        if(count){
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
