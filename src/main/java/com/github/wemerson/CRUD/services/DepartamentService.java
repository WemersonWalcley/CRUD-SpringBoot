package com.github.wemerson.CRUD.services;

import com.github.wemerson.CRUD.DTO.DepartamentDTO;
import com.github.wemerson.CRUD.entities.Departament;
import com.github.wemerson.CRUD.repositories.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentService {

    @Autowired
    private DepartamentRepository departamentRepository;

    public DepartamentDTO findById(Long id){
        Departament departament = departamentRepository.findById(id).get();
        DepartamentDTO departamentDTO = new DepartamentDTO(departament);
        return departamentDTO;
    }
}
