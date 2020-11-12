package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.TunjanganPegawai;

@Repository
public interface TunjanganPegawaiRepository extends JpaRepository<TunjanganPegawai, Long>{

}
