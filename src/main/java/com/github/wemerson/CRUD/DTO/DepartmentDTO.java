package com.github.wemerson.CRUD.DTO;

import com.github.wemerson.CRUD.entities.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DepartmentDTO {

    private Long id;
    private String name;

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department department) {
        id = department.getId();
        name = department.getName();
    }

}
