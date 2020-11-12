package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.Kemampuan;

@Repository
public interface KemampuanRepository extends JpaRepository<Kemampuan, Long>{

}
