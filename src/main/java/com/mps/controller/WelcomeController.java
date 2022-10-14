package com.mps.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/wel")
	public ResponseEntity<String> getMsg()
	{
		String msg="Hello World";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

	@GetMapping("/greet")
	public ResponseEntity<String> getGreet()
	{
		String msg="Good Evening";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

	
}
