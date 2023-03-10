package com.Server.MediCareServer.repository;

import java.util.List;
import com.Server.MediCareServer.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Long> {

   List<Medicine> findAll();

}
