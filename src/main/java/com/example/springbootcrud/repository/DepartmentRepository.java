package com.example.springbootcrud.repository;

import com.example.springbootcrud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
