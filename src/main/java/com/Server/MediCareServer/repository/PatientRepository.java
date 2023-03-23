package com.Server.MediCareServer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Server.MediCareServer.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

   Patient findById(long pid);

         
   

}