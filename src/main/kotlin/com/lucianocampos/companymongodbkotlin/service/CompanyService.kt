package com.lucianocampos.companymongodbkotlin.service

import com.lucianocampos.companymongodbkotlin.domain.Company

interface CompanyService {

    fun findByCnpj(cnpj: String): Company?

    fun save(company: Company): Company
}
