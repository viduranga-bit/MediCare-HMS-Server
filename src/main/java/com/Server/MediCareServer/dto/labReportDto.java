package com.Server.MediCareServer.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class labReportDto {
    private Long reportId;
    private String reportName;
    private String patientName;
    private String requestDate;
    private String patientId;
   

    
}
