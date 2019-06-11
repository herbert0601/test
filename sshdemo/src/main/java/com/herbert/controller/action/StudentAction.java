package com.herbert.controller.action;

import com.herbert.domain.Student;
import com.herbert.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author Herbert
 * @create 2019-06-09 15:23
 */
@Namespace("/")
@ParentPackage("json-default")
@Controller
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven<Student> {

    private Student student = new Student();

    @Override
    public Student getModel() {
        return student;
    }

    @Autowired
    private StudentService studentService;

    @Action(value = "addStudent", results = {@Result(name = "success", location = "./success.jsp", type = "redirect"), @Result(name = ERROR, location = "./error.jsp", type = "redirect")})
    public String addStudent() {

        studentService.addStudent(student);

        return SUCCESS;

    }

}
