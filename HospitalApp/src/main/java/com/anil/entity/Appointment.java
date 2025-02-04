package com.anil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Appointment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;
	    
	    
	    @ManyToOne
	    @JoinColumn(name="doctor_id")
	    private Doctor doctor;
	    private String appointmentDate;
	    private String status;

}
