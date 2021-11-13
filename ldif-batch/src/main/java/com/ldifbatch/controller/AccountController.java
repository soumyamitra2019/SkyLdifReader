package com.ldifbatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldifbatch.entities.OudAccountExport;
import com.ldifbatch.entities.occurance.Occurances;
import com.ldifbatch.service.OudAccountExportService;
import com.ldifbatch.service.OudOccuranceExportService;

@RestController
public class AccountController {
	@Autowired
	private OudAccountExportService accountExportService;
	@Autowired
	private OudOccuranceExportService occuranceExportService;
	@GetMapping
	public ResponseEntity<List<OudAccountExport>> getData(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountExportService.getDataFromFile());
	}
	@GetMapping("test")
	public ResponseEntity<String> getSEntity(){
		return new ResponseEntity<String>("hello",HttpStatus.ACCEPTED);
	}
	@GetMapping("occurance")
	public ResponseEntity<List<Occurances>> getOccuranceData(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(occuranceExportService.getDataFromFile());
	}
	@GetMapping("user")
	public ResponseEntity<String> getUserData(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("USER DATA TO INPUT AND CHANGE RETURN TYPE");
	}
}
