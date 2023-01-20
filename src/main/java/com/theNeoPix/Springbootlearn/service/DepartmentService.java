package com.theNeoPix.Springbootlearn.service;

import com.theNeoPix.Springbootlearn.entity.Department;
import com.theNeoPix.Springbootlearn.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

}
