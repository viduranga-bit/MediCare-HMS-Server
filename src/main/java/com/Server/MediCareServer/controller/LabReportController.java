package com.Server.MediCareServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Server.MediCareServer.model.LabReport;
import com.Server.MediCareServer.repository.LabReportRepository;

@RestController
@RequestMapping("/api/v1/labReport")
public class LabReportController {

    @Autowired
    private LabReportRepository labreportRepository;

    @PostMapping
    public LabReport createLabReport(@RequestBody LabReport labReport) {
        return labreportRepository.save(labReport);
    }

    @GetMapping // get labreport details
    public List<LabReport> getAllLabReports() {
        return (List<LabReport>) labreportRepository.findAll();
    }
    
}
