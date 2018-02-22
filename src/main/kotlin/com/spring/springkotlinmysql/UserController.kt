package com.spring.springkotlinmysql

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val repository: UserRepository){

 @GetMapping("/users")
    fun findAllUsers()=repository.findAll()

    @PostMapping("/users")
    fun addUser(user:User)=repository.save(user)


}