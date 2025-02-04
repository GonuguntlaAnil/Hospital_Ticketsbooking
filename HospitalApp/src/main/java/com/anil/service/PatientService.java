package com.anil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.entity.Patient;
import com.anil.repo.PatientRepository;

@Service
public class PatientService {
	
	
	@Autowired
	private PatientRepository patientserv;
	
	
	public List<Patient>getAllPatients(){
		return patientserv.findAll();
	}
	public Patient addPatient(Patient pat) {
		return patientserv.save(pat);
	}

}
