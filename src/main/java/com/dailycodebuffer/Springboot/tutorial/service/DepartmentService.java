package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartentNotFoundException;

    public void deleteDepartmentById(Long departmentID);

    public Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
