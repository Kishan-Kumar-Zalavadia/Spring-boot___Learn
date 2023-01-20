package com.theNeoPix.Springbootlearn.service;

import com.theNeoPix.Springbootlearn.entity.Department;
import com.theNeoPix.Springbootlearn.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        //Creating Builder Object
        Department department = Department.builder()
                .departmentName("CS")
                .departmentAddress("Texas")
                .departmentCode("MSCS")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("CS"))
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get data based on valid department name")
    // @Disable -> Disable the test case
    public void whenValidDepartmentName_tHenDepartmentShouldFind(){
        String departmentName = "CS";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());

    }
}