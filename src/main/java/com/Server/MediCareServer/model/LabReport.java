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

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "document_type")
    private String document_type;

    @Column(name = "file_name")
    private boolean file_name;

    @Column(name = "prescription_id")
    private String symptoms;
    
    @Column(name = "description")
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
    @Column(name = "submitDate")
    private String submitDate;
     
    @Temporal(TemporalType.TIME)
    @Column(name = "submitTime")
    private Date submitTime=new Date(System.currentTimeMillis());


    
}
