package com.practice.student.service;

import com.practice.student.dao.StudentDAO;
import com.practice.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentdao;

    @Override
    public boolean saveStudent(Student student) {
        return studentdao.saveStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentdao.getStudents();
    }

    @Override
    public boolean deleteStudent(Student student) {
        return studentdao.deleteStudent(student);
    }

    @Override
    public List<Student> getStudentByID(Student student) {
        return studentdao.getStudentByID(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentdao.updateStudent(student);
    }
}
