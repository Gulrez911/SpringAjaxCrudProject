package com.repository;

import com.model.Student;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

}
