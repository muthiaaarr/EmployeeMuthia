package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.Posisi;

@Repository
public interface PosisiRepository extends JpaRepository<Posisi, Long>{

}
