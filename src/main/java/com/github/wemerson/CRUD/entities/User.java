package com.github.wemerson.CRUD.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departament departament;

    public User(Long id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email =  email;
        this.password = password;
    }

}
