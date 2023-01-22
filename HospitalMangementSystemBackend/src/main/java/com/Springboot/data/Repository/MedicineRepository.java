package com.Springboot.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.data.Entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}


