package com.JavaG.dao;

import com.JavaG.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CourseDao {
    //通过学生id查找该学生课程

    List<Course> findAllCourseByStudentId(int id);
}
