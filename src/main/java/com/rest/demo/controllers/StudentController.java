package com.rest.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.models.Student;
import com.rest.demo.repositories.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository sr;
	
	@PostMapping("/students")
	public String createStudent(@RequestBody Student s) {
		System.out.println(s);
		sr.save(s);
		return "success";
	}
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		List<Student> s=sr.findAll();
		return s;
	}
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable("studentId") String studentId) {
		int id=Integer.parseInt(studentId);
		Optional<Student> obj=sr.findById(id);
		return obj.get();
	}
	@PutMapping("/student/{studentId}")
	public Student updateStudent(@PathVariable("studentId") String studentId, @RequestBody Student s) {
		int id=Integer.parseInt(studentId);
		Optional<Student> obj=sr.findById(id);
		s.setId(obj.get().getId());
		sr.save(s);
		return s;
	}
}
