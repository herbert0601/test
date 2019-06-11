package com.herbert.service;

import com.herbert.dao.StudentRepository;
import com.herbert.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Herbert
 * @create 2019-06-09 15:56
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {

        studentRepository.save(student);
    }
}
