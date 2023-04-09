package com.mongoTest.testdb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

	@GetMapping("hi")
	public ResponseEntity<?> welcome(){
		return ResponseEntity.ok("hello");
	}
}
