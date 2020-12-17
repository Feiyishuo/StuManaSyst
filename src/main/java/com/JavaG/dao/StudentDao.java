package com.JavaG.dao;


import com.JavaG.domain.Student;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import java.util.List;


@MapperScan
public interface StudentDao {



    //查询所有
//    @Select("select * from student")
    List<Student> findAll();


    //根据专业id获取学生信息
//    @Select("select * from student where majorId = #{majorId}")
    List<Student> findStudentByMajorId(Integer majorId);



    //根据学院id获取学生信息
//    @Select("select * from student where academyId = #{academyId}")
    List<Student> findStudentByAcademyId(Integer academyId);





    //根据学生id获取学生详细信息
//    @Select("select * from student where id = #{id}")
    Student findStudentDetailsById(String id);


    //单条插入学生信息
    @Insert("insert into student values(#{id},#{name},#{sex},#{nation},#{politicsStatus},#{idCard},#{majorId},#{academyId},{class},#{phoneNum},#{birth},#{nativePlace})")
    int insertOneStudentInfo(Student student);




    //根据id来删除学生信息
    @Delete("delete from student where id = #{id}")
    int deleteStudentInfo(String id);




    //更新学生信息
    @Update("update student set name = #{name},sex = #{sex},nation = #{nation},politicsStatus = #{politicsStatus},idCard = #{idCard},majorId = #{majorId},academyId = #{academyId},class = {class},phoneNum = #{phoneNum},birth = #{birth},nativePlace=#{nativePlace} where id = #{student.id}")
    int updateStudentInfo(Student student);



}
