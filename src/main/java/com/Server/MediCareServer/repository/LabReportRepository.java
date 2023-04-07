package com.Server.MediCareServer.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Server.MediCareServer.model.LabReport;

@Repository
public interface LabReportRepository extends JpaRepository<LabReport,Long>{
    
  @Query(value="SELECT p.patientName  FROM Patient p INNER JOIN LabReport l ON p.patientId=l.patient_id WHERE l.labReport_Id IN :rId ", nativeQuery = true)
  String getPatientNameFromId(Long rId);

}
