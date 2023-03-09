package com.Server.MediCareServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Server.MediCareServer.model.Appointment;


    
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {


}
