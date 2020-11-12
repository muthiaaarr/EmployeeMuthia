package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.ParameterPajak;

@Repository
public interface ParameterPajakRepository extends JpaRepository<ParameterPajak, Long>{

}
