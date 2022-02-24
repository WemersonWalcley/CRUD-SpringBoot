package com.github.wemerson.CRUD.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_department")
@Getter
@Setter
@NoArgsConstructor
@Validated
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

}
