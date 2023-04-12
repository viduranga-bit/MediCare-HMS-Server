package com.Server.MediCareServer.controller;
import com.Server.MediCareServer.dto.PrescriptionDTO;
import com.Server.MediCareServer.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Server.MediCareServer.repository.PrescriptionRepository;
import com.Server.MediCareServer.model.Prescription;
import java.util.*;

@RestController
@RequestMapping("/api/v1/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;
    @Autowired
    private PrescriptionService prescriptionService;
    @PostMapping
    public Prescription createPrescription(@RequestBody Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }
    @GetMapping("/get-prescription-details")
    public List<PrescriptionDTO> getlabDetails() {
        return prescriptionService.getPrescriptionDetails();
    }
}
