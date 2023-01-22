package com.Springboot.data.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.data.Entity.AdminLogin;
import com.Springboot.data.Repository.AdminLoginRepository;


@Service
public class AdminLoginImpService implements AdminLoginService {
	@Autowired
	  private AdminLoginRepository adminloginRepository;
			
			@Override
			public AdminLogin saveAdminLogin(AdminLogin adminlogin) {
				// TODO Auto-generated method stub
				return adminloginRepository.save(adminlogin);
			}

}
