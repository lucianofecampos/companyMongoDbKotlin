package com.lucianocampos.companymongodbkotlin.repository

import com.lucianocampos.companymongodbkotlin.domain.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {

    fun findByCpnj(): Company
}
