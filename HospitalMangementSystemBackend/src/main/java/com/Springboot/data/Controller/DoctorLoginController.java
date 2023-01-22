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
	import com.Springboot.data.Entity.DoctorLogin;
	import com.Springboot.data.Repository.DoctorLoginRepository;

	@RestController
	@CrossOrigin(allowedHeaders = "*",origins ="*")
	@RequestMapping("Doctor")
	public class DoctorLoginController {
		
		@Autowired
		private DoctorLoginRepository DoctorLoginRepository;
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/DoctLogin")
		
		
		public List<DoctorLogin> getAllDoctorLogin(){
			
			
			
			return DoctorLoginRepository.findAll();
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/save")
		public DoctorLogin createDoctorLogin(@RequestBody DoctorLogin DoctorLogin) {
			return DoctorLoginRepository.save(DoctorLogin);
		}
}
