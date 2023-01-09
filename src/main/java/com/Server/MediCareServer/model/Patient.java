package com.Server.MediCareServer.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name="Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long patientId;
    @Column(name = "patient_name")
    private String patientName;
    @JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
    @Column(name = "dob")
    private String dob;
    @JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
    @Column(name = "admitdate")
    private String admitdate;


    @Temporal(TemporalType.TIME)
    @Column(name = "admitTime")
    private Date admitTime=new Date(System.currentTimeMillis());

    @Column(name = "NIC")
    private String nic;

    @Column(name = "patientType")
    private String patientType;

    @Column(name = "email")
    private String email;

    @Column(name = "bloodGroup")
    private String bloodGroup;
    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "mobileNo")
    private String mobileNo;

    @Column(name = "specialNote")
    private String specialNote;
}
