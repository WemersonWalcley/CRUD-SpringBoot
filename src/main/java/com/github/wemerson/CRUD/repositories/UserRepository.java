package com.github.wemerson.CRUD.repositories;

import com.github.wemerson.CRUD.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
