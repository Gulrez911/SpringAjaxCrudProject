package com.controller;

import com.model.Student;
import com.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired
    private StudentService studentService;

//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public ModelAndView index(@ModelAttribute Student student) {
//        ModelAndView model = new ModelAndView("HelloPage");
//        List<Student> listStudent = studentService.getAllStudents();
//        Student s = new Student();
//        model.addObject("listStudent", listStudent);
//        model.addObject("s", s);
//        return model;
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView saveStudent(@ModelAttribute Student student) {
//        studentService.addStudent(student);
//        System.out.println("In SaveStudent method::::::........................");
//        String msg = "Successfully saved";
//        return new ModelAndView("redirect:/test", "msg", msg);
//    } 
}
