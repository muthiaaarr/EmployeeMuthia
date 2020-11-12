package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.ListKemampuan;

@Repository
public interface ListKemampuanRepository extends JpaRepository<ListKemampuan, Long>{

}
