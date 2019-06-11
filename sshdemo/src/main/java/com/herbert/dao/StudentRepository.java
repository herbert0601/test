package com.herbert.dao;

import com.herbert.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Herbert
 * @create 2019-06-09 15:58
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
