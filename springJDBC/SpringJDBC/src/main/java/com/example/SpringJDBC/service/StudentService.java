package com.example.SpringJDBC.service;

import com.example.SpringJDBC.model.Student;
import com.example.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
//        System.out.println("Adding student");
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
