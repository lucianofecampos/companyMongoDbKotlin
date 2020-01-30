package com.lucianocampos.companymongodbkotlin.util

import org.junit.jupiter.api.Test

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

internal class SecurityUtilTest {

    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun makeBCrypt() {
        val password = "123456"
        val hash = SecurityUtil().makeBCrypt(password)
        assert(bCryptEncoder.matches(password, hash))
    }
}
