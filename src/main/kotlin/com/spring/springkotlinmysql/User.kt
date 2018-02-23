package com.spring.springkotlinmysql

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class User(
    @Id @GeneratedValue
    val id:Long=-1,
    val firstname: String="",
    val lastname:String=""

    )