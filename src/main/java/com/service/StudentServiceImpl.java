package com.service;

import com.model.Student;
import com.repository.StudentDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

}
