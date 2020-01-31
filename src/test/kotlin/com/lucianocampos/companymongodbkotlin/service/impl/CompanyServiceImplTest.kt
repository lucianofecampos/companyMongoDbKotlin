package com.lucianocampos.companymongodbkotlin.service.impl

import com.lucianocampos.companymongodbkotlin.domain.Company
import com.lucianocampos.companymongodbkotlin.repository.CompanyRepository
import com.lucianocampos.companymongodbkotlin.service.CompanyService
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class CompanyServiceImplTest {

    @Autowired
    val companyService: CompanyService? = null
    val companyRepository: CompanyRepository? = null

    private val cnpj = "51463645000100"
    private val company = Company("Name", cnpj, "1")

    @BeforeEach
    @Throws(Exception::class)
    internal fun setup() {
        given(companyRepository?.findByCpnj(cnpj)).willReturn(company)
        given(companyRepository?.save(company)).willReturn(company)
    }

    @Test
    fun findByCnpj() {
        val companyFounded: Company? = companyService?.findByCnpj(cnpj)
        assertNotNull(companyFounded)
    }

    @Test
    fun save() {
        val companySaved: Company? = companyService?.save(company)
        assertNotNull(companySaved)
    }
}
