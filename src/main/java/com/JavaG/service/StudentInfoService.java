package com.JavaG.service;

import com.JavaG.domain.Student;

import java.util.List;

public interface StudentInfoService {

    /**
     * 查找所有
     * @return
     */
    List<Student> findAll();


    /**
     * 根据专业id获取学生信息
     * @param majorId
     * @return
     */
    List<Student> findStudentByMajorId(Integer majorId);


    /**
     * 根据学院id获取学生信息
     * @param academyId
     * @return
     */
    List<Student> findStudentByAcademyId(Integer academyId);




    /**
     * 根据学生id获取学生详细信息
     * @param id
     * @return
     */
    Student findStudentDetailsById(String id);


    /**
     * 单条插入学生信息
     * @param student
     * @return
     */
    int insertOneStudentInfo(Student student);



    /**
     * 根据id来删除学生信息
     * @param id
     */
    int deleteStudentInfo(String id);



    /**
     * 更新学生信息
     * @param student
     */
    int updateStudentInfo(Student student);
}
