package com.Server.MediCareServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Server.MediCareServer.repository.PatientRepository;
import com.Server.MediCareServer.model.Patient;

import java.util.*;
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
      return patientRepository.save(patient);
}
@GetMapping //get deprtment details
public List<Patient> getAllDepartments(){
    return (List<Patient>) patientRepository.findAll();
}
}