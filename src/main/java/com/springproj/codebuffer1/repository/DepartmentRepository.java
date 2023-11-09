package com.springproj.codebuffer1.repository;

import com.springproj.codebuffer1.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

    public DepartmentEntity findBydepartmentName(String departmentName);
    public DepartmentEntity findBydepartmentNameIgnoreCase(String departmentName);

}