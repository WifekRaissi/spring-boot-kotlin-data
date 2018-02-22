package com.spring.springkotlinmysql

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringKotlinMysqlApplication
@Bean
fun init(repository: UserRepository) = CommandLineRunner {
    // save a couple of customers
    repository.save(User(1, "Bauer", "hhhh"))
    repository.save(User(2, "Chloe", "O'Brian"))}

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinMysqlApplication::class.java, *args)




    }