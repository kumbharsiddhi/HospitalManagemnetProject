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

	import com.Springboot.data.Entity.Medicine;
import com.Springboot.data.Entity.Patient;
import com.Springboot.data.Repository.MedicineRepository;


	@RestController
	@CrossOrigin("*")
	@RequestMapping("medicine")
	public class MedicineController {
		
		@Autowired
		private MedicineRepository medicineRepository;
		@CrossOrigin("*")
		@GetMapping("/medicine")
		public List<Medicine> getAllMedicines(){
			return medicineRepository.findAll();
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/save")
		public Medicine createMedicine(@RequestBody Medicine medicine) {
			return medicineRepository.save(medicine);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/medicine/{id}")
		public ResponseEntity<Medicine> getMedicineById(@PathVariable Long id) throws AttributeNotFoundException {
			
			Medicine medicine = medicineRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			return ResponseEntity.ok(medicine);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@DeleteMapping("/medicine/{id}")
		public ResponseEntity<Map<String,Boolean>> deletePatient(@PathVariable Long id) throws AttributeNotFoundException{
			
		Medicine medicine = medicineRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			medicineRepository.delete(medicine);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}
