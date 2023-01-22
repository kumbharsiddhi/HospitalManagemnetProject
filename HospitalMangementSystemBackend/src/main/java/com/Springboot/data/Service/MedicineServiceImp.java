package com.Springboot.data.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Springboot.data.Entity.Medicine;
import com.Springboot.data.Repository.MedicineRepository;

@Service
public class MedicineServiceImp implements MedicineService{

private MedicineRepository medicineRepository;
	
	public MedicineServiceImp(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}

	public List<Medicine> getAllMedicine() {
		return medicineRepository.findAll();
	}

	public Medicine saveMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	public Medicine getMedicineById(Long id) {
		return medicineRepository.findById(id).get();
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMedicineById(Long id) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public Student updateStudent(Student student) {
		//return studentRepository.save(student);
	//}

	//@Override
//	public void deleteStudentById(Long id) {
	//	studentRepository.deleteById(id);	
	//}
}
