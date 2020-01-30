package com.lucianocampos.companymongodbkotlin.repository

import com.lucianocampos.companymongodbkotlin.domain.Register
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface RegisterRepository : MongoRepository<Register, String> {

    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Register>
}
