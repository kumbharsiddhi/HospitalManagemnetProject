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

import com.Springboot.data.Entity.Appoinment;
import com.Springboot.data.Entity.Patient;
	import com.Springboot.data.Repository.PatientRepository;


	@RestController
	@CrossOrigin(allowedHeaders = "*",origins = "*")
	@RequestMapping("patient")
	public class PatientController {
		
		@Autowired
		private PatientRepository patientRepository;
		
		@GetMapping("/patients")
		
		public List<Patient> getAllPatients(){
				
			return patientRepository.findAll();
		}
		
		
		@PostMapping("/save")
		public Patient createPatient(@RequestBody Patient patient) {
			return patientRepository.save(patient);
		}
		
		@GetMapping("/patient/{id}")
		public ResponseEntity<Patient> getPatientById(@PathVariable Long id) throws AttributeNotFoundException {
			
			Patient patient = patientRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			return ResponseEntity.ok(patient);
		}
		
		@PutMapping("/patients/{id}")
		public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient patientDetails) throws AttributeNotFoundException{
			
			Patient patient = patientRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			patient.setAge(patientDetails.getAge());
			patient.setName(patientDetails.getName());
			patient.setBlood(patientDetails.getBlood());
			patient.setDose(patientDetails.getDose());
			patient.setFees(patientDetails.getFees());
			patient.setPrescription(patientDetails.getPrescription());
			patient.setUrgency(patientDetails.getUrgency());
			patient.setId(patientDetails.getId());
			
			Patient updatedPatient = patientRepository.save(patient);
			return ResponseEntity.ok(updatedPatient);
		}
		
		@DeleteMapping("/patient/{id}")
		public ResponseEntity<Map<String,Boolean>> deletePatient(@PathVariable Long id) throws AttributeNotFoundException{
			
			Patient patient = patientRepository.findById(id)
					.orElseThrow(() -> new AttributeNotFoundException("ABCD" + id));
			
			patientRepository.delete(patient);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		
}
	
