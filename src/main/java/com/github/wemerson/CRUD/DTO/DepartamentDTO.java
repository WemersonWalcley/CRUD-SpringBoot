package com.github.wemerson.CRUD.DTO;

import com.github.wemerson.CRUD.entities.Departament;

public class DepartamentDTO {

    private Long id;
    private String name;

    public DepartamentDTO() {

    }

    public DepartamentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartamentDTO(Departament departament) {
        id = departament.getId();
        name = departament.getName();
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
