package com.anil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.entity.Appointment;
import com.anil.service.AppointmentService;

@RestController
public class AppointmentController {
	
	
	@Autowired
	private AppointmentService appointmentservice;
	
	
	@PostMapping("/book")
	public Appointment bookAppointment(Appointment appointment) {
		return appointmentservice.bookAppointment(appointment);
	}
	@GetMapping("/listappoin")
    public List<Appointment> getAllAppointments() {
        return appointmentservice.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        return appointmentservice.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void cancelAppointment(@PathVariable Long id) {
       appointmentservice.cancelAppointment(id);
    }

}
