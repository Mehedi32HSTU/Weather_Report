package com.spring.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class WeatherController {
	
	@GetMapping("/getweather/{cityName}")
	public ResponseEntity<?>getWeather(@PathVariable(value="cityName") String cityName)
	{
		System.out.println("hello"+cityName);
		
		return ResponseEntity.ok().body("Hello "+cityName);
	}
	

}
