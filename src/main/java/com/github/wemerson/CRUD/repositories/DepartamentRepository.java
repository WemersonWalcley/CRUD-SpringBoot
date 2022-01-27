package com.github.wemerson.CRUD.repositories;

import com.github.wemerson.CRUD.entities.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament, Long> {
}
