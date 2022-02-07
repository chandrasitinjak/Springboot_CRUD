package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.Department;

import java.util.List;

public interface DepartmentService {

    //Save
    Department saveDepartment(Department department);

    //Read
    List<Department> fetchDepartmentList();

    //Update
    Department updateDepartment(Department department, Long departmentId);

    //Delete
    void deleteDepartmentById(Long departmentId);

}
