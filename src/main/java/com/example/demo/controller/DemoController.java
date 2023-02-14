package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoTestEntity;
import com.example.demo.service.DemotTestService;

@RestController
@RequestMapping("/main")
public class DemoController {

	@Autowired
	DemotTestService demotTestService;
	
	@RequestMapping(path = "/testdemo",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> demoTest() {
		
		List<DemoTestEntity> result = this.demotTestService.getDemoTestRecords();
		
		return ResponseEntity.ok().body(result);
	}
	
	@RequestMapping(path = "/testhelp",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> help() {		
		return ResponseEntity.ok().body("Help me out!!");
	}
}
