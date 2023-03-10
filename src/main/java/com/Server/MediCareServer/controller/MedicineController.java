package com.Server.MediCareServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Server.MediCareServer.repository.MedicineRepository;
import com.Server.MediCareServer.service.MedicineService;
import com.Server.MediCareServer.model.Medicine;

import java.util.*;

@RestController
@RequestMapping("/api/v1/medicine")
public class MedicineController {

    @Autowired
    private MedicineRepository medicineRepository;
    @Autowired 
    MedicineService medicineService;

    @PostMapping
    public Medicine createMedicine(@RequestBody Medicine medicine){
        return medicineRepository.save(medicine);

    }

    @GetMapping
    public List<Medicine> getAllMedicines(){

        return medicineService.getAllMedicine();

    }


    
}
