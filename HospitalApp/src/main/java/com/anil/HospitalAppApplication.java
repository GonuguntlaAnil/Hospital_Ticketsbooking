package com.anil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anil.entity.Appointment;
import com.anil.entity.Doctor;
import com.anil.entity.Patient;
import com.anil.repo.AppointmentRepository;
import com.anil.repo.DoctorRepository;
import com.anil.repo.PatientRepository;

@SpringBootApplication
public class HospitalAppApplication implements CommandLineRunner{
	 @Autowired
	    private DoctorRepository doctorRepository;
	    
	    @Autowired
	    private PatientRepository patientRepository;
	    
	    @Autowired
	    private AppointmentRepository appointmentRepository;
	public static void main(String[] args) {
		  SpringApplication.run(HospitalAppApplication.class, args);
		  
	}

	@Override
	public void run(String... args) throws Exception {
		
		    Doctor doctor1 = new Doctor();
	        doctor1.setName("Dr. Smith");
	        doctor1.setSpecialization("Cardiologist");
	        doctorRepository.save(doctor1);

	        // Adding sample patient
	        Patient patient1 = new Patient();
	        patient1.setName("John Doe");
	       patient1.setPhone("9390010682");
	        patientRepository.save(patient1);

	        // Creating an appointment for the patient with the doctor
	        Appointment appointment1 = new Appointment();
	      appointment1.setDoctor(doctor1);
	      appointment1.setPatient(patient1);
	         appointment1.setAppointmentDate("2025-02-10");
	        appointment1.setStatus("Scheduled");
	        appointmentRepository.save(appointment1);

	        System.out.println("Sample data added to the database!");
		
	}

}
