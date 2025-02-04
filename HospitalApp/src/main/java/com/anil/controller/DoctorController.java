package com.anil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.entity.Doctor;
import com.anil.service.DoctorService;

@RestController
public class DoctorController {
	
	
	@Autowired
	private DoctorService doctorservice;
	
	@GetMapping("/listdocs")
	public List<Doctor> getAllDoctors() {
		return doctorservice.getAllDoctors();
	}
	
	@PostMapping("/adddoc")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorservice.addDoctor(doctor);
		
	}

}
