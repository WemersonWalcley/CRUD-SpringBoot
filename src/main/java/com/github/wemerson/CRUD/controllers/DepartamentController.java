package com.github.wemerson.CRUD.controllers;

import com.github.wemerson.CRUD.DTO.DepartamentDTO;
import com.github.wemerson.CRUD.services.DepartamentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Departaments")
@RestController
@RequestMapping(value = "/departaments")
public class DepartamentController {

    @Autowired
    private DepartamentService departamentService;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "FindById")
    public DepartamentDTO findById(@PathVariable Long id){
        return departamentService.findById(id);
    }

}
