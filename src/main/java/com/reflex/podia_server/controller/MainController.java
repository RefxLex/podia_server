package com.reflex.podia_server.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
public class MainController {

    @GetMapping("/msg")
	public ResponseEntity<Map<String, String>> sendMsg(@RequestParam (required = true, defaultValue = "guest") String userName) {
		try {			
			Map<String, String> response = new HashMap<>();
			response.put("message", "Thank you for your interest, " + userName);
			System.out.println("Thank you for your interest, " + userName);		
	        return new ResponseEntity<>(response, HttpStatus.OK);      
		}	
		catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
		}	   
	}
}
