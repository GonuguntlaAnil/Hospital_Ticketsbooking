package com.anil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.entity.Doctor;
import com.anil.repo.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorrepo;
	
	public Doctor addDoctor(Doctor doctor) {
		return doctorrepo.save(doctor);
	}
	
	public List<Doctor> getAllDoctors(){
		return doctorrepo.findAll();
	}

}
