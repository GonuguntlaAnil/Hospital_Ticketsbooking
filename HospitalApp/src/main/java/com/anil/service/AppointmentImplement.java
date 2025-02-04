package com.anil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.entity.Appointment;
import com.anil.repo.AppointmentRepository;

@Service
public class AppointmentImplement implements AppointmentService{
	
	
	@Autowired
	private AppointmentRepository appointmentrepo;

	@Override
	public Appointment bookAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
	return 	appointmentrepo.save(appointment);
		
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointmentrepo.findAll();
	}

	@Override
	public Appointment getAppointmentById(Long id) {
		// TODO Auto-generated method stub
		return appointmentrepo.findById(id).orElse(null);
	}

	@Override
	public void cancelAppointment(Long id) {
		// TODO Auto-generated method stub
		appointmentrepo.deleteById(id);
		
	}

}
