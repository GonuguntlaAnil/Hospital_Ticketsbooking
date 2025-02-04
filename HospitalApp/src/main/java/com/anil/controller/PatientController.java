package com.anil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.entity.Patient;
import com.anil.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientservice;
	
	@GetMapping("/getpats")
	public List<Patient>getAllPatients(){
		return patientservice.getAllPatients();
	}
	
	@PostMapping("/addpats")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientservice.addPatient(patient);
	}

}
