package com.Server.MediCareServer.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prescription")


public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prescription_Id;

    @Column(name = "medication")
    private String medication;

    @Column(name = "Description")
    private String Description;

    @Column(name = "isRequestLabReport")
    private boolean isRequestLabReport;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "case_history")
    private String case_history;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_patientId")
    private Patient patient;

}

    

