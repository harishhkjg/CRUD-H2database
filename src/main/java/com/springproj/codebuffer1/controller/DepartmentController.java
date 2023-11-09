package com.springproj.codebuffer1.controller;


import com.springproj.codebuffer1.entity.DepartmentEntity;
import com.springproj.codebuffer1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public DepartmentEntity savedata(@RequestBody DepartmentEntity entity)
    {
        return departmentService.savedata(entity);
    }
    @GetMapping("/getdata")
    public List<DepartmentEntity> getdata()
    {
        return departmentService.getdata();
    }
    @GetMapping("/getdata/{id}")
    public DepartmentEntity getdata(@PathVariable long id)
    {
        return departmentService.getdata(id);
    }

    @DeleteMapping("/deletedata/{id}")
    public String deletedata(@PathVariable long id)
    {
        departmentService.deletedata(id);
        return "Department Deleted Successfully!!! ";
    }

    @PutMapping("/updatedata/{id}")
    public DepartmentEntity updatedata(@PathVariable long id, @RequestBody DepartmentEntity entity){
        return departmentService.updatedata(id,entity);
    }

}
