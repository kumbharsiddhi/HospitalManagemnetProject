package com.Springboot.data.Controller;



	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import javax.management.AttributeNotFoundException;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	import com.Springboot.data.Entity.AdminLogin;
	import com.Springboot.data.Repository.AdminLoginRepository;

	@RestController
	@CrossOrigin("*")
	@RequestMapping("/adminlogin")
	public class AdminLoginController {
		
		@Autowired
		private AdminLoginRepository AdminLoginRepository;
		
		@GetMapping("/AdminLogin")
		
		
		public List<AdminLogin> getAllAdminLogin(){
			
			
			
			return AdminLoginRepository.findAll();
		}
		
		
		@PostMapping("/save")
		public AdminLogin createAdminLogin(@RequestBody AdminLogin adminLogin) {
			return AdminLoginRepository.save(adminLogin);
		}
}

