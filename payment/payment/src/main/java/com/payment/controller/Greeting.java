package com.payment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.Student;

@RestController
public class Greeting {
	@GetMapping("hi")
	public ResponseEntity<?> welcome() {
		return ResponseEntity.ok("hello world");
	}
	@PostMapping("studentData")
	public ResponseEntity<?> getStudentData(@RequestBody Student student ) {
//		Student std = new Student();
//		std.setStudentData(student);
//		return ResponseEntity.ok(std.getStudentData(student));
		return null;
	}
}
