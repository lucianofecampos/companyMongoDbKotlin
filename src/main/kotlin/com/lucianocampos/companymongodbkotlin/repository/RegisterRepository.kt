package com.lucianocampos.companymongodbkotlin.repository

import com.lucianocampos.companymongodbkotlin.domain.Register
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RegisterRepository : MongoRepository<Register, String> {

    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Register>
}
