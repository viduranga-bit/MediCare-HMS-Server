package com.Server.MediCareServer.model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="labReport")


public class LabReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long labReport_Id;

    @Column(name = "reportName")
    private String reportName;

    @Column(name = "prescription_id")
    private String symptoms;
    
    @Column(name = "description")
    private String description;

    @Column(name = "laboratarist_id")
    private String laboratarist_id;

    @Column(name = "patient_id")
    private String patient_id;

    @Column(name = "doc_id")
    private String doc_id;
     
    @Temporal(TemporalType.TIME)
    @Column(name = "submitTime")
    private Date submitTime=new Date(System.currentTimeMillis());


    
}
