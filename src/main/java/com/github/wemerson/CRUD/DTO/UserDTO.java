package com.github.wemerson.CRUD.DTO;

import com.github.wemerson.CRUD.entities.Departament;
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

    private Departament departament;

    public UserDTO(Long id, String name, String email, Departament departament){
        this.id = id;
        this.name = name;
        this.email = email;
        this.departament = departament;
    }

    public UserDTO(User user){
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        departament = user.getDepartament();
    }

}
