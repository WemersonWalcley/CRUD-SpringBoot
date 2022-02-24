package com.github.wemerson.CRUD.repositories;

import com.github.wemerson.CRUD.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
