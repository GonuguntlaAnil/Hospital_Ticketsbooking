package com.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
