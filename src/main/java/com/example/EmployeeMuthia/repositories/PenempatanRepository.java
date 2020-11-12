package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.Penempatan;

@Repository
public interface PenempatanRepository extends JpaRepository<Penempatan, Long>{

}
