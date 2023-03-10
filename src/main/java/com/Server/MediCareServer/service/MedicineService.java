package com.Server.MediCareServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Server.MediCareServer.model.Medicine;
import com.Server.MediCareServer.repository.MedicineRepository;

@Service
public class MedicineService {

    @Autowired
	private MedicineRepository medicineRepository;
	
	 public List<Medicine> getAllMedicine() {
    
            return  medicineRepository.findAll();

     }
    

    
}
