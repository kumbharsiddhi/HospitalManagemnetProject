package com.Springboot.data.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.data.Entity.DoctorLogin;

@Repository
public interface DoctorLoginRepository extends JpaRepository<DoctorLogin, Long> {

}


