package com.github.wemerson.CRUD.services;

import com.github.wemerson.CRUD.DTO.UserDTO;
import com.github.wemerson.CRUD.entities.User;
import com.github.wemerson.CRUD.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;


    public UserDTO findById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        assert user != null;
        return new UserDTO(user);
    }

    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public User postMapping(User user) {
/*
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if (optionalUser.isPresent()){
            throwsException
        }*/
        User post = userRepository.save(user);
        return post;

    }

    public ResponseEntity<Void> deleteMapping(Long id) {

        if (!userRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public User putMapping(User user) {
        User put = userRepository.save(user);
        return put;
    }

}
