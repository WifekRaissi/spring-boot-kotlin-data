package com.spring.springkotlinmysql.controllers

import com.spring.springkotlinmysql.entities.User
import com.spring.springkotlinmysql.repositories.UserRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping
class UserController(private val repository: UserRepository){



    @GetMapping("/users")
     fun getAllNotes() =
       repository.findAll()

    @GetMapping(value = "/users/{id}")
    fun getUserById(@PathVariable("id") id: Long)
            = repository.findOne(id)

    @PostMapping("/users")
    fun createUser(@Valid @RequestBody user: User)=
      repository.save(user)

    @DeleteMapping("/users/{id}")
    fun deleteUserById(@PathVariable id:Long)=
    repository.delete(id)

    @DeleteMapping("/users")
    fun deleteUsers()=
            repository.deleteAll()

    @PutMapping("/users/{id}")
    fun updateUser(@PathVariable ("id")id:Long, @RequestBody user: User)=
                   repository.save(user)
    }


