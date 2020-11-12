package com.example.EmployeeMuthia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeMuthia.models.User;
import com.example.EmployeeMuthia.models.UserId;

@Repository
public interface UserRepository extends JpaRepository<User, UserId>{

}
