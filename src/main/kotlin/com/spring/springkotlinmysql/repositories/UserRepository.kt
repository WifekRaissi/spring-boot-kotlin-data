package com.spring.springkotlinmysql.repositories

import com.spring.springkotlinmysql.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>{

}