package com.github.wemerson.CRUD.services;

import com.github.wemerson.CRUD.DTO.DepartmentDTO;
import com.github.wemerson.CRUD.entities.Department;
import com.github.wemerson.CRUD.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentDTO findById(Long id){
        Department department = departmentRepository.findById(id).get();
        DepartmentDTO departmentDTO = new DepartmentDTO(department);
        return departmentDTO;
    }

    public Department postMapping(Department department){
        Department post = departmentRepository.save(department);
        return post;
    }

}
