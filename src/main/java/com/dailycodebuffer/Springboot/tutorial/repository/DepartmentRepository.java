package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentName(String departmentName);      //no need of implementation of this function, this will work just by the
                                                                        // naming convention i.e. findBy....
}
