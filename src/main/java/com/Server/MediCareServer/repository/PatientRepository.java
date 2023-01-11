package com.Server.MediCareServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Server.MediCareServer.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

   Patient findById(long pid);

}