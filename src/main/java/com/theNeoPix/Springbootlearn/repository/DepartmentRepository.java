package com.theNeoPix.Springbootlearn.repository;

import com.theNeoPix.Springbootlearn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}