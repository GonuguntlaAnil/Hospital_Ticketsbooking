package com.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
