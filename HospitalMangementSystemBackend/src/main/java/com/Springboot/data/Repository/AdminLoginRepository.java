package com.Springboot.data.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springboot.data.Entity.AdminLogin;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Long> {

}



