package com.springproj.codebuffer1.service;


import com.springproj.codebuffer1.entity.DepartmentEntity;
import com.springproj.codebuffer1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements  DepartmentService{

    @Autowired
    private DepartmentRepository departmentrepository;
    @Override
    public DepartmentEntity savedata(DepartmentEntity entity) {
        return departmentrepository.save(entity);
    }

    @Override
    public List<DepartmentEntity> getdata() {
        return departmentrepository.findAll();
    }

    @Override
    public DepartmentEntity getdata(long id) {
        return departmentrepository.findById(id).get();
    }

    @Override
    public void deletedata(long id) {
        departmentrepository.deleteById(id);
    }

    @Override
    public DepartmentEntity updatedata(long id, DepartmentEntity entity) {
        DepartmentEntity entitydb =  departmentrepository.findById(id).get();
        entitydb.setDepartmentName(entity.getDepartmentName());
        entitydb.setDepartmentCode(entity.getDepartmentCode());
        entitydb.setDepartmentAddress(entity.getDepartmentAddress());

        if(!Objects.nonNull(entity.getDepartmentName()) && !"".equalsIgnoreCase(entity.getDepartmentName())){
        entitydb.setDepartmentName(entity.getDepartmentName());
        }

        if(!Objects.nonNull(entity.getDepartmentCode()) && !"".equalsIgnoreCase(entity.getDepartmentCode())){
            entitydb.setDepartmentCode(entity.getDepartmentCode());
        }

        if(!Objects.nonNull(entity.getDepartmentAddress()) && !"".equalsIgnoreCase(entity.getDepartmentAddress())){
            entitydb.setDepartmentAddress(entity.getDepartmentAddress());
        }

        return departmentrepository.save(entitydb);
    }

    @Override
    public DepartmentEntity getdataname(String departmentName) {
         return departmentrepository.findBydepartmentNameIgnoreCase(departmentName);
    }


}
