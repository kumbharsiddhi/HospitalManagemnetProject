package com.Springboot.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.data.Entity.Appoinment;

@Repository
public interface AppoinmentRepository extends JpaRepository<Appoinment, Long> {

}


