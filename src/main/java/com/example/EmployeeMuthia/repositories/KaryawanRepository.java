package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.Karyawan;

@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long>{

}
