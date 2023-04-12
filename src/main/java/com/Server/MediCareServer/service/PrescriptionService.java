package com.Server.MediCareServer.service;

import com.Server.MediCareServer.dto.PrescriptionDTO;
import com.Server.MediCareServer.dto.labReportDto;
import com.Server.MediCareServer.repository.LabReportRepository;
import com.Server.MediCareServer.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrescriptionService {

    @Autowired
    PrescriptionRepository prescriptionRepository;
    public List<PrescriptionDTO> getPrescriptionDetails(){
        List<PrescriptionDTO> prescriptionDTOList = prescriptionRepository.getPrescriptionDetails();
        return prescriptionDTOList;

    }


    
}
