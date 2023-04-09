package com.mongoTest.testdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongoTest.testdb.model.Student;
import com.mongoTest.testdb.repository.StudentRepo;

@RestController
@RequestMapping("/student")
public class TestStudent {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student saveStudent = this.studentRepo.save(student);
		return ResponseEntity.ok(saveStudent);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStudentsData(){
		return ResponseEntity.ok(this.studentRepo.findAll());
	}
}