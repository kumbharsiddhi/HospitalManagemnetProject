package com.Springboot.data.Service;
import java.util.List;
import com.Springboot.data.Entity.Medicine;
public interface MedicineService {

List  <Medicine> getAllMedicine();
	
	 Medicine saveMedicine(Medicine medicine);
	
	Medicine getMedicineById(Long id); 
		
	
	Medicine updateMedicine(Medicine medicine); 
		
	
	
	void deleteMedicineById(Long id);
	
}

