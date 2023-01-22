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
	import org.springframework.web.bind.annotation.RestController;



import com.Springboot.data.Entity.Appoinment;
import com.Springboot.data.Repository.AppoinmentRepository;



	@RestController
	@CrossOrigin(allowedHeaders = "*",origins ="*")
	@RequestMapping("appoinment")
	public class AppoinmentController {
		
		@Autowired
		private AppoinmentRepository appoinmentRepository;
		
		@GetMapping("/appointment")
		public List<Appoinment> getAllAppointments(){
			return appoinmentRepository.findAll();
		}
		
		
		@PostMapping("/save")
		public Appoinment createAppointment(@RequestBody Appoinment appointment) {
			return appoinmentRepository.save(appointment);
		}
		@GetMapping("/appointment/{id}")
		public ResponseEntity<Appoinment> getAppoinmentById(@PathVariable Long id) throws AttributeNotFoundException {
			
			Appoinment appointment = appoinmentRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			return ResponseEntity.ok(appointment);
		}
		
		@DeleteMapping("/appointments/{id}")
		public ResponseEntity<Map<String,Boolean>> deleteAppointment(@PathVariable Long id) throws AttributeNotFoundException{
			
			Appoinment appoinment = appoinmentRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			appoinmentRepository.delete(appoinment);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		
}
