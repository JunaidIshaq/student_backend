package com.practice.student.dao;

import com.practice.student.model.Student;

import java.util.List;

public interface StudentDAO {

    boolean saveStudent(Student student);

    List<Student> getStudents();

    boolean deleteStudent(Student student);

    List<Student> getStudentByID(Student student);

    boolean updateStudent(Student student);
}
