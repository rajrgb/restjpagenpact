package com.rest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.demo.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
