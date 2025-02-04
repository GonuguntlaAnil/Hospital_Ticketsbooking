package com.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
