package com.spring.springkotlinmysql.services

//import mu.KotlinLogging
import com.spring.springkotlinmysql.entities.User
import com.spring.springkotlinmysql.repositories.UserRepository
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
//import java.util.*


@Service
class UserServiceImpl: UserService {

    private val log = KotlinLogging.logger {}
    @Autowired
    lateinit var repository: UserRepository

    override fun getUsers()=
            repository.findAll()

    override fun getUserById(id:Long)=
            repository.getOne(id)
    override fun addUser(user: User): User{
        log.info("${user.firstname},added!!!")
        repository.save(user)
           return user

    }

    override fun deleteUser(id: Long){
        log.info("user deleted!!")
            repository.delete(id)
         }
    override fun deleteAllUsers() {
        log.info("All users deleted!!")
        repository.deleteAll()
    }

}