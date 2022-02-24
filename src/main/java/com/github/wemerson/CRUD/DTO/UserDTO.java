package com.github.wemerson.CRUD.DTO;

import com.github.wemerson.CRUD.entities.Department;
import com.github.wemerson.CRUD.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String email;

    private Department department;

    public UserDTO(Long id, String name, String email, Department departament){
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = departament;
    }

    public UserDTO(User user){
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        department = user.getDepartment();
    }

}
