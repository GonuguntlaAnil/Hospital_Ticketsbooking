package com.anil.service;

import java.util.List;

import com.anil.entity.Appointment;


public interface AppointmentService {
	
	Appointment bookAppointment(Appointment appointment);
	 List<Appointment> getAllAppointments();
	 Appointment getAppointmentById(Long id);
	  void cancelAppointment(Long id);

}
