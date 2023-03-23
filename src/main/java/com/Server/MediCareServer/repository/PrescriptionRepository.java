
package com.Server.MediCareServer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Server.MediCareServer.model.Patient;
import com.Server.MediCareServer.model.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription,Long> {

   Patient findById(long pres_id);

         
   

}