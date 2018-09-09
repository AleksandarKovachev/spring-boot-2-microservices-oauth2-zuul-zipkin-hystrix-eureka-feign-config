package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Rest Controller
 * 
 * @author aleksandar.kovachev
 *
 */
@RestController
public class RestControllerExample {

	@GetMapping("/hello")
	@HystrixCommand(fallbackMethod = "helloBackup")
	public String hello(@RequestParam String name) {
		return new String("Hello " + name);
	}

	public String helloBackup(@RequestParam String name) {
		return new String("backup");
	}

}
