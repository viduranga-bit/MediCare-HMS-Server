package com.Server.MediCareServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Server.MediCareServer.model.Patient;
import com.Server.MediCareServer.repository.PatientRepository;

@Service
public class PatientService {
    
    @Autowired
	private PatientRepository patientRepository;
	
	 public Patient getPatientById(long pid) {
		Patient patient = patientRepository.findById(pid);
		return patient;
     }
    

}
