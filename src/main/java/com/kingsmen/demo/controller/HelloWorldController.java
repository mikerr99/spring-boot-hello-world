package com.kingsmen.demo.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(value="/hello")
	public String helloWorld() throws IOException, URISyntaxException { 
		return "Hello Kingsmen!";
	}

}
