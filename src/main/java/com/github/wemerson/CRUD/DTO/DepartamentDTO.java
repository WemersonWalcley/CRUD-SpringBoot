package com.github.wemerson.CRUD.DTO;

import com.github.wemerson.CRUD.entities.Departament;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DepartamentDTO {

    private Long id;
    private String name;

    public DepartamentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartamentDTO(Departament departament) {
        id = departament.getId();
        name = departament.getName();
    }

}
