package com.lucianocampos.companymongodbkotlin.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Company (
        val name: String,
        val cpnj: String,
        @Id val id: String? = null
)
