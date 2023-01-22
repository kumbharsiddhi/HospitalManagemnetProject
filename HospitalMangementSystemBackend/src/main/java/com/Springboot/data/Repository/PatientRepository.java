package com.Springboot.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.data.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}

