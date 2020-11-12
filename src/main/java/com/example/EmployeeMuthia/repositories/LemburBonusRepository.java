package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.LemburBonus;

@Repository
public interface LemburBonusRepository extends JpaRepository<LemburBonus, Long>{

}
