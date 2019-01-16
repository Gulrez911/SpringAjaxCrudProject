package com.repository;

import com.model.Student;
import java.util.List;

public interface StudentDao {

    public void addStudent(Student student);

    public List<Student> getAllStudents();
}
