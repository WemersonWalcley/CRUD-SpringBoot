package com.github.wemerson.CRUD.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
@Validated
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String password;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public User(Long id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email =  email;
        this.password = password;
    }

}
