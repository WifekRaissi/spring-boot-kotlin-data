package com.spring.springkotlinmysql.services

import com.spring.springkotlinmysql.entities.User

interface UserService {


    fun addUser(user: User): User
    fun deleteUser(id: Long)
    fun deleteAllUsers()
    fun getUserById(id: Long): User?
    fun getUsers(): MutableIterable<User>?
    fun getUserByName(firstname: String): List<User>
    fun updateUser(id: Long, user: User): User
}