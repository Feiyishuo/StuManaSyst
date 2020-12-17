package com.JavaG.service;

import com.JavaG.domain.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    List<Course> findAllCourseByStudentId(int id);
}
