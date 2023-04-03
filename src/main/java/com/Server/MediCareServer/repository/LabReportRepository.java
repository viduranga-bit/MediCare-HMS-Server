package com.Server.MediCareServer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Server.MediCareServer.model.LabReport;

@Repository
public interface LabReportRepository extends JpaRepository<LabReport,Long>{
    
}
