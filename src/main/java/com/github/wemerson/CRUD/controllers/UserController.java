package com.github.wemerson.CRUD.controllers;

import com.github.wemerson.CRUD.DTO.UserDTO;
import com.github.wemerson.CRUD.entities.User;
import com.github.wemerson.CRUD.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Users")
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "FindById")
    public UserDTO findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping
    @ApiOperation(value = "FindAll")
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

    @PostMapping
    @ApiOperation(value = "Save User")
    public User save(@RequestBody User user){
        return userService.postMapping(user);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete User")
    public void delete(@PathVariable Long id){
        userService.deleteMapping(id);
    }

    @PutMapping
    @ApiOperation(value = "Update User")
    public User edit(@RequestBody User user){
        return userService.putMapping(user);
    }

}
