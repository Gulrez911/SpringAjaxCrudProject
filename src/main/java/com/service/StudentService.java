package com.service;

import com.model.Student;
import java.util.List;

public interface StudentService {

    public void addStudent(Student student);

    public List<Student> getAllStudents();

}
