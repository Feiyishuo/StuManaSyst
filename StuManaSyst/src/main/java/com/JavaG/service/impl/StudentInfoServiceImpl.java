package com.JavaG.service.impl;

import com.JavaG.dao.StudentDao;
import com.JavaG.domain.Student;
import com.JavaG.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class StudentInfoServiceImpl implements StudentInfoService {

    @Resource
    private StudentDao studentDao;


    public List<Student> findAll() {

        System.out.println("业务层：查询所有学生1...");
        List<Student> list=studentDao.findAll();
        System.out.println("业务层：查询所有学生2...");
        return list;
    }

    @Override
    public List<Student> findStudentByMajorId(Integer majorId) {
        return studentDao.findStudentByMajorId(majorId);
    }

    @Override
    public List<Student> findStudentByAcademyId(Integer academyId) {
        return studentDao.findStudentByAcademyId(academyId);
    }

    @Override
    public Student findStudentDetailsById(String id) {
        System.out.println("studentInfoImpl");
        return studentDao.findStudentDetailsById(id);
    }

    @Override
    public int insertOneStudentInfo(Student student) {
        synchronized (this) {
            while (true) {
                if (studentDao.findStudentDetailsById(student.getId()) == null&student.getId()!=null&student.getName()!=null) {

                    return studentDao.insertOneStudentInfo(student);
                }

            }
        }
    }



    @Override
    public int deleteStudentInfo(String id) {
        return studentDao.deleteStudentInfo(id);
    }

    @Override
    public int updateStudentInfo(Student student) {

        if(studentDao.findStudentDetailsById(student.getId())!=null){
            return studentDao.updateStudentInfo(student);
        }
        return 0;

    }
}
