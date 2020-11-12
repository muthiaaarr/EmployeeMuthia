package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.Agama;

@Repository
public interface AgamaRepository extends JpaRepository<Agama, Long>{

}
