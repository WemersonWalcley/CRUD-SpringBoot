package com.github.wemerson.CRUD.controllers;

import com.github.wemerson.CRUD.DTO.DepartmentDTO;
import com.github.wemerson.CRUD.entities.Department;
import com.github.wemerson.CRUD.entities.User;
import com.github.wemerson.CRUD.services.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Departments")
@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "FindById")
    public DepartmentDTO findById(@PathVariable Long id){
        return departmentService.findById(id);
    }

    @PostMapping
    @ApiOperation(value = "Save_Department")
    public Department save(@RequestBody Department department){

        return departmentService.postMapping(department);
    }

}
