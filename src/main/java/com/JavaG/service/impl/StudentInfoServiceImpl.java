package com.JavaG.service.impl;

import com.JavaG.dao.StudentDao;
import com.JavaG.domain.Student;
import com.JavaG.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("studentInfoService")
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
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
