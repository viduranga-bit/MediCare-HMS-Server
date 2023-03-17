package com.Server.MediCareServer.service;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Server.MediCareServer.model.Medicine;
import com.Server.MediCareServer.repository.MedicineRepository;

import lombok.var;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort;

@Service
public class MedicineService {

    @Autowired
	private MedicineRepository medicineRepository;
	
	//  public List<Medicine> getAllMedicine() {
    
    //         return  medicineRepository.findAll();

    //  }

     
    public List<Medicine> findAllOrderByIdDsc() {

        Sort sort = Sort.by(Sort.Direction.DESC,"medicineId");
        return medicineRepository.findAllOrderByNameDsc(sort);
    }

   
    
}
