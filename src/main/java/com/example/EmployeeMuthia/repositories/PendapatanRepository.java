package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.Pendapatan;

@Repository
public interface PendapatanRepository extends JpaRepository<Pendapatan, Long>{

}
