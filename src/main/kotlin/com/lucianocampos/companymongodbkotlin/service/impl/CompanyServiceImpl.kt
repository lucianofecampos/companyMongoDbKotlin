package com.lucianocampos.companymongodbkotlin.service.impl

import com.lucianocampos.companymongodbkotlin.domain.Company
import com.lucianocampos.companymongodbkotlin.repository.CompanyRepository
import com.lucianocampos.companymongodbkotlin.service.CompanyService
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(val companyRepository: CompanyRepository) : CompanyService {

    override fun findByCnpj(cnpj: String): Company? = companyRepository.findByCpnj(cnpj)

    override fun save(company: Company): Company = companyRepository.save(company)
}
