package com.Server.MediCareServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Server.MediCareServer.model.LabReport;
import com.Server.MediCareServer.repository.LabReportRepository;
import com.Server.MediCareServer.service.labReportService;

@RestController
@RequestMapping("/api/v1/labReport")
public class LabReportController {

    @Autowired
    private LabReportRepository labreportRepository;

    @Autowired
    private labReportService labReportService;

    @PostMapping
    public LabReport createLabReport(@RequestBody LabReport labReport) {
        return labreportRepository.save(labReport);
    }

    @GetMapping // get labreport details
    public List<LabReport> getAllLabReports() {
        return (List<LabReport>) labreportRepository.findAll();
    }
    
    @PostMapping("/upload/{pid}")
    public ResponseEntity<String> uploadPdfFile(@PathVariable("pid") Long id, @RequestParam("file") MultipartFile file) {
        try {
             labReportService.createPdfFile(id,file.getOriginalFilename(), file.getBytes());
            return ResponseEntity.ok("File uploaded successfully with id: " + LabReport.class.getName());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to upload file: " + e.getMessage());
        }
    }

    @PostMapping("/{lid}/500")
    public ResponseEntity<LabReport> updateLabReportPrice(@PathVariable(value = "lid") Long labReportId,
            @RequestParam(value = "price") Double price) {
                System.out.println("labReportId");
        LabReport updatedLabReport = labReportService.savePriceForLabReport(labReportId, price);
        return ResponseEntity.ok(updatedLabReport);
    }
    
    @GetMapping("/get-name-by-id/{rId}")
    public String getNameById(@PathVariable ("rId") Long rId ){
        return labReportService.getNameById(rId);
    }
}