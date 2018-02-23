package com.spring.springkotlinmysql.controllers

import com.spring.springkotlinmysql.entities.User
import com.spring.springkotlinmysql.repositories.UserRepository
import com.spring.springkotlinmysql.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/users")
    fun getAllUsers() =
            userService.getUsers()

    @GetMapping(value = "/users/{id}")
    fun getUserById(@PathVariable("id") id: Long) = userService.getUserById(id)

    @PostMapping("/users")
    fun createUser(@Valid @RequestBody user: User) =
            userService.addUser(user)

    @DeleteMapping("/users/{id}")
    fun deleteUserById(@PathVariable id: Long) =
            userService.deleteUser(id)

    @DeleteMapping("/users")
    fun deleteUsers() =
            userService.deleteAllUsers()

    /* @PutMapping("/users/{id}")
    fun updateUser(@PathVariable ("id")id:Long, @RequestBody user: User)=
                   repository.save(user)
    }*/


}