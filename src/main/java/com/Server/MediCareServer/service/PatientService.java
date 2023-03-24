package com.Server.MediCareServer.service;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.Server.MediCareServer.model.Patient;
import com.Server.MediCareServer.repository.PatientRepository;

@Service
public class PatientService {
    
    @Autowired
	private PatientRepository patientRepository;
	
	 public Optional<Patient> getPatientById(long pid) {
		Optional<Patient> patient = patientRepository.findById(pid);
		return patient;
     }
    
   public Patient updateIsTreatedById(long id,Map<String,Object> fields){
	Optional<Patient> existingPatient = patientRepository.findById(id);
	 if(existingPatient.isPresent()){
	fields.forEach((key,value)->{
	 Field field =  ReflectionUtils.findField(Patient.class, key);
	  field.setAccessible(true);
	  ReflectionUtils.setField(field, existingPatient.get(),value);
	});

	return patientRepository.save(existingPatient.get());
   }
	return null;
}
}
