package com.lucianocampos.companymongodbkotlin.repository

import com.lucianocampos.companymongodbkotlin.domain.Company
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : MongoRepository<Company, String> {

    fun findByCpnj(cnpj: String): Company?
}
