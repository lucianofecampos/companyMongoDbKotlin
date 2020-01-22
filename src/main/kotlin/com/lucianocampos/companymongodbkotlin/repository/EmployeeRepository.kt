package com.lucianocampos.companymongodbkotlin.repository

import com.lucianocampos.companymongodbkotlin.domain.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {

    fun findByEmail(email: String): Employee

    fun findByCpf(cpf: String): Employee
}
