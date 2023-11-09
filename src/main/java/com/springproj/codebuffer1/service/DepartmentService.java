package com.springproj.codebuffer1.service;

import com.springproj.codebuffer1.entity.DepartmentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    public DepartmentEntity savedata(DepartmentEntity entity);

   public  List<DepartmentEntity> getdata();

   public  DepartmentEntity getdata(long id);

   public  void deletedata(long id);

   public  DepartmentEntity updatedata(long id, DepartmentEntity entity);

   public  DepartmentEntity getdataname(String departmentName);
}
