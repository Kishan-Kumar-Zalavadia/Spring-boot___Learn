package com.theNeoPix.Springbootlearn.service;

import com.theNeoPix.Springbootlearn.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);
}
